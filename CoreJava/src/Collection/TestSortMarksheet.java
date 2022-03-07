package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortMarksheet {

	public static void main(String[] args) {

		ArrayList marksheets = new ArrayList();

		marksheets.add(new SortMarkSheet("A4", "Veena", 91));

		marksheets.add(new SortMarkSheet("A2", "Veera", 95));

		marksheets.add(new SortMarkSheet("A1", "Trapti", 90));

		System.out.println("Sort element by Comparable & by RollNo");

		Collections.sort(marksheets);

		for (Object o : marksheets) {

			System.out.println(o);
		}

	}
}
