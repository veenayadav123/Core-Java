package collection;

import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Failfast1 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("Ram");
		l.add("Raman");
		l.add("Aman");

		java.util.Iterator it = l.iterator();

		while (it.hasNext()) {

			Object o = it.next();

			System.out.println(o);

			l.add("Shyam");

		}
	}

}
