package javabasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExEmpAge {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(today);
		System.out.println(s);
		Calendar cal = Calendar.getInstance();
		int d = cal.get(Calendar.DATE);
		int m = cal.get(Calendar.MONTH);
		int y = cal.get(Calendar.YEAR);

		int dobD = 11;
		int dobM = 1;
		int dobY = 1998;
		int Age = y - dobY;
		System.out.println(Age);

		int date = d-dobD;
		int month = m-dobM;
		int year = y - dobY;

		System.out.print(date);
		System.out.print("/" + month);
		System.out.print("/" + year);

	}
}
