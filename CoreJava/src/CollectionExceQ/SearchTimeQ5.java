package CollectionExceQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class SearchTimeQ5 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		ArrayList a1 = new ArrayList();
		HashSet s = new HashSet();
		Random r = new Random();

		for (int i = 0; i < 100000; i++) {

			a.add(i);
		}
		s.add(a);
		long l = 0;

		for (int i = 0; i < 50; i++) {
			int p = r.nextInt(100);
			a1.add(p);
		}
		System.out.println("Random No : \n" + a1);

		for (int i = 0; i < 50; i++) {
			int p = r.nextInt(100);
			a.containsAll(a1);

			l += System.currentTimeMillis();

		}
		System.out.println("Taking Time by ArrayList for search 50 random No : \n" + l);

		for (int i = 0; i < 50; i++) {
			int p = r.nextInt(100);
			s.containsAll(a1);

			l += System.currentTimeMillis();
		}
		System.out.println("Taking Time by HashSet for search 50 random No :\n" + l);
	}

}
