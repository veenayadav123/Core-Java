package Collection;

import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {

		TreeMap map = new TreeMap();

		map.put("101", "One");
		map.put("103", "Three");
		map.put("105", "Five");
		map.put("102", "Two");
		map.put("104", "Four");

		for (Object o : map.keySet()) {

			//System.out.println( map.get(o));
			System.out.println(o + " = " + map.get(o));
		}
	}
}
