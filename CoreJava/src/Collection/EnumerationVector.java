package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationVector {

	public static void main(String[] args) {

		Vector v = new Vector();
		int i = 2;

		v.add("Ram");
		v.add("Shyam");

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

			if (i == 2) {

				// v.add("Raman");
				v.remove(0);
			}
		}

		System.out.println(v);

	}

}
