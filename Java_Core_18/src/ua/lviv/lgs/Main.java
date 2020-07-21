package ua.lviv.lgs;

public class Main 
{
	public static void main(String[] args)
	{
		MyEntry<String, Integer> map = new MyEntry<String, Integer>();
		
		map.add("po4ka", new Integer(1));
		map.add("po4ka", new Integer(2));
		map.add("peremo4ka", new Integer(3));
		map.add("to4ka", new Integer(4));
		map.add("koro4ka", new Integer(4));
		map.add("kovto4ka", new Integer(1));
		map.add("kvo4ka", new Integer(1));
		map.add("kvo4ka", new Integer(4));
		map.add("rostro4ka", new Integer(8));
		map.add("prymo4ka", new Integer(6));
		
		System.out.println(map.keys);
		
		map.removeByKey("po4ka");
		System.out.println(map.keys);

		
		map.removeByValue(new Integer(4));
		System.out.println(map.keys);

		
		map.showKeys();
		map.showValues();
	}
}
