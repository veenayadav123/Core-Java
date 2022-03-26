package collectionExceQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Q5 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		
		for (int i = 0; i <= 100000; i++) {

			al.add(i);
			
		}
		System.out.println(al);
		
		Random r = new Random();
		
		for (int i = 0; i < 50; i++) {

			int p = r.nextInt(50);

			System.out.print(" "+al.get(p));
			
		}

		HashSet h1 = new HashSet(al);

		System.out.println(h1);

	}
}
