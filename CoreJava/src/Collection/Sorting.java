package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Sorting {

	public static void main(String[] args) throws Exception {

		ArrayList al = new ArrayList();

		/*
		 * al.add(925); al.add(512); al.add(756); al.add(612); al.add(12);
		 */

		al.add("Ram");
		al.add("Enaya");
		al.add("Rama");
		al.add("Vanshika");
		al.add("Ananya");

		Collections.sort(al);

		System.out.println(al);
	}
}
