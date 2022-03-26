package collection;

import java.util.Iterator;
import java.util.Stack;

public class stack {

	public static void main(String[] args) {

		Stack l = new Stack();
		l.add("Ram");
		l.add("Raman");
		l.add("Man");
		l.add("Aman");
		l.add("Rashmi");

		Iterator it = l.iterator();
		while (it.hasNext()) {

			System.out.println(it.next());

		}
		// System.out.println(l.size());

		Stack l1 = new Stack();

		for (int j = 0; j <=l.size(); j++) {

			l1.push(l.pop());

		}
		System.out.println(l1);

	}

}
