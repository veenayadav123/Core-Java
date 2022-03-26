package collection;

import java.util.ArrayList;

public class ListByCollectnFW {

	public static void main(String[] args) {

		ArrayList name = new ArrayList();

		for (int i = 0; i < 10; i++) {

			name.add("No # " + i);

			// name.add(i);

		}
		System.out.println("Name :" + name.size());

		Object o = name.get(2);

		 String name1 = (String)o;

		//String name1 = (String) name.get(0);

		System.out.println("First Name is " + name);
		
		System.out.println("First Name " + name1);

	}

}
