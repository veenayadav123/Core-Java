package collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMarksheet11 {

	public static void main(String[] args) {

		ArrayList marksheets = new ArrayList();

		marksheets.add(new Marksheet11("A11", "Suraj", 90));
		marksheets.add(new Marksheet11("A3", "Aman", 80));
		marksheets.add(new Marksheet11("A1", "Raman", 95));
		marksheets.add(new Marksheet11("A5", "Shobhit", 89));
		marksheets.add(new Marksheet11("A4", "Amit", 91));

		Marksheet11 mk = new Marksheet11();
		Collections.sort(marksheets, mk);
		
		for (Object obj : marksheets) {

			System.out.println(obj);

		}

	}
}
