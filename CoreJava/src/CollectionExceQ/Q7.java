package CollectionExceQ;

import java.util.LinkedList;

public class Q7 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("Ananya");
		l.add("Enaya");
		l.add("Aman");
		l.add("Shreya");
		l.add("Vanshika");
		l.add("Vansh");
		//l.add("Shatansh");

		// System.out.println(l.size());
		System.out.print("Middle node of linked list : ");
		if (l.size() % 2 == 0) {

			int i = l.size() / 2;
			int j = i - 1;
			System.out.println(l.get(j) + " , " + l.get(i));

		} else {

			int k = (l.size() / 2);

			System.out.println(l.get(k));

		}
	}

}
