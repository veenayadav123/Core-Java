package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArryListMtds {

	public static void main(String[] args) {

		// Collection l = new ArrayList();

		ArrayList l = new ArrayList();

		ArrayList l2 = new ArrayList();

		LinkedList l3 = new LinkedList();

		LinkedList l4 = new LinkedList();

		//l3.add("Five");
		//l3.add(7.86);

		//l4.addAll(l3);
		//sSystem.out.println(l4);

		l.add("One");
		l.add("two");
		l.add("Three");
		l.add(1);
		l.add(5);
		l.add('v');
		l.add(5.6);
		l.add(3, 'c');
	    l.add(4, "Ram");
		l.add("Aman");
		l.add(5,"man");

		/* System.out.println(l);

		 System.out.println(l3);

		 
		 System.out.println(l2.addAll(l));

		 System.out.println(l2);

		 l.clear();

		 System.out.println(l);

		 System.out.println(l.contains("Ram"));

		 System.out.println(l.containsAll(l));

		 l.isEmpty();
		 System.out.println(l.isEmpty());

		 System.out.println(l.remove("Ram"));

		 System.out.println(l);

		 System.out.println("Hello "+l.removeAll(l));

		System.out.println(l.retainAll(l2));*/

		 System.out.println(l.size());

		 l.iterator();
		 System.out.println(l);

	}

}
