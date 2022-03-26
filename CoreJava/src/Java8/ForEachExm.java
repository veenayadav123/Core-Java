package java8;

import java.util.ArrayList;

public class ForEachExm {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");

		list.forEach(li -> System.out.println(li));
	}

}
