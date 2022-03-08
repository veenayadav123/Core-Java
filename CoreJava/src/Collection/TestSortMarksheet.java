package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortMarksheet {

	public static void main(String[] args) {

		ArrayList marksheets = new ArrayList();

		marksheets.add(new SortMarkSheet("A4", "Veena", 80));

		marksheets.add(new SortMarkSheet("A2", "Veera", 90));

		marksheets.add(new SortMarkSheet("A5", "Trapti", 50));
		
		marksheets.add(new SortMarkSheet("A1", "Yashika", 70));
		
		marksheets.add(new SortMarkSheet("A3", "Vanshika", 90));
		
		marksheets.add(new SortMarkSheet("A7", "Yami", 60));
		
		marksheets.add(new SortMarkSheet("A6", "Rashmi", 100));
		
		System.out.println("Sort element by Comparable & by RollNo");

		Collections.sort(marksheets);

		for (Object o : marksheets) {

			System.out.println(o);
		}

	}
}
