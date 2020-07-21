package ua.lviv.lgs;

import java.util.*;

public class MyEntry<K, V> 
{
	private class Key
	{
		private K value;
		private ArrayList<V> address = new ArrayList<V>();
		
		Key(K value)
		{
			super();
			this.value = value;
		}
		
		public K getValue() {
			return value;
		}
		
		public void addAddress(V address)
		{
			this.address.add(address);
		}

		@Override
		public String toString() {
			return "Key [value=" + value + ", address=" + address + "]";
		}
		
	}
	
	public HashSet<Key> keys = new HashSet<Key>();
	
	MyEntry()
	{
		super();
	}
	
	public void add(K key, V value)
	{
		Key tempKey = null;
		
		boolean flag = true;
		
		for(Key object: keys)
		{
			if(key.equals(object.getValue()))
			{
				tempKey = object;
				flag = false;
			}
		}
		
		if(flag)
		{
			tempKey = new Key(key);
		}
		
		tempKey.addAddress(value);
		
		keys.add(tempKey);
	}
	
	public void removeByKey(K key)
	{
		Iterator<Key> iterator = keys.iterator();
		
		while(iterator.hasNext())
		{
			Key object = iterator.next();
			
			if(object.getValue().equals(key))
			{
				iterator.remove();
			}
		}
	}
	
	public void removeByValue(V value)
	{
		for(Key object: keys)
		{
			Iterator<V> iterator = object.address.iterator();
			
			while(iterator.hasNext())
			{
				V object2 =  iterator.next();
				
				if(object2.equals(value))
				{
					iterator.remove();
				}
			}
		}
	}
	
	public void showKeys()
	{
		Iterator<Key> iterator = keys.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().getValue());
		}
	}
	
	public void showValues()
	{
		for(Key object: keys)
		{
			Iterator<V> iterator = object.address.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
		}
	}
}
