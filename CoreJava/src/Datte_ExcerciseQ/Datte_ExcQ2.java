package Datte_ExcerciseQ;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Datte_ExcQ2 {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		
		for(int i=1; i<=12; i++) {
			
			cal.add(Calendar.DATE,30);
			
			Date nextEvent = cal.getTime();
			
			System.out.println(nextEvent);
			
		}
	}

}
