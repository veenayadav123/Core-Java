package CollectionExceQ;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.io.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Q6 {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");

		java.util.Iterator it = hs.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.print(" " + str);
		}
		System.out.println();

		TreeSet ts = new TreeSet();
		ts.add("Six");
		ts.add("Seven");
		ts.add("Eight");
		ts.add("Nine");
		ts.add("Ten");

		java.util.Iterator it1 = ts.iterator();
		while (it1.hasNext()) {
			String str1 = (String) it1.next();
			System.out.print(" " + str1);
		}
		System.out.println();

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Zero");
		lhs.add("Zero1");
		lhs.add("Zero2");
		lhs.add("Zero3");
		lhs.add("Zero4");

		java.util.Iterator it2 = lhs.iterator();
		while (it2.hasNext()) {
			String str2 = (String) it2.next();
			System.out.print(" " + str2);

		}

	}

}
