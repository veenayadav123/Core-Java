package collection;

import java.util.LinkedList;

public class LinkedListMtd {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("Ram");
		l.add("Shyam");
		l.add(55);

		l.add(1, "Aman");
		l.add(4, "Raman");
		l.add(5, "man");

		System.out.println(l);

		l.set(0, "raj");
		System.out.println(l);

		for (int i = 0; i < l.size(); i++) {

			System.out.println(l.get(i));
		}

		System.out.println("Removed Index 0 Value  " + l.remove(0));

		System.out.println(l.subList(0, 3));

		System.out.println(l.indexOf("raj"));

		System.out.println(l.lastIndexOf("Shyam"));

	}

}
