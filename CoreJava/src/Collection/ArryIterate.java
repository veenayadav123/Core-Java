package Collection;

import java.io.*;
import java.util.*;

import java.util.ArrayList;

import java.util.Iterator;

public class ArryIterate {

	public static void main(String[] args) throws Exception {

		// Collection v = new ArrayList();

		ArrayList v = new ArrayList();

		v.add("Ram");
		v.add("Aman");
		v.add(786);
		v.add(5.85);
		v.add("I am Indian");
		v.add("Shyam");

		System.out.println(v);

		Iterator it = v.iterator();

		while (it.hasNext()) {

			Object o = it.next();

			System.out.println(o);

			it.remove();

			System.out.println(it.next());

			if (it.hasNext()) {

				it.remove();

			}
			v.add("Ram");
		}

		System.out.println("i am removed" + v);

	}
}
