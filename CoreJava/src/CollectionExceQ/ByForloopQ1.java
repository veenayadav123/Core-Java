package collectionExceQ;

import java.util.ArrayList;

public class ByForloopQ1 {

	public static void main(String[] args) {

		ArrayList l = new ArrayList();

		l.add("Aman");
		l.add("Raman");
		l.add("Sohan");
		l.add(859);
		l.add("Mohan");

		for (Object object1 : l) {

			System.out.println(object1);

		}

		/*
		 * for (int i = 0; i < l.size(); i++) {
		 * 
		 * System.out.println(l.get(i));
		 * 
		 * }
		 */
	}

}
