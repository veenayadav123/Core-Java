package practice;

import java.util.Iterator;
import java.util.Vector;

public class VectorUseIterator {

	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("One");
		v.add("Two");
		v.add("Three");

		Iterator it = v.iterator();
		while (it.hasNext()) {

			String str = (String) it.next();

			System.out.println(str);
		}

	}

}
