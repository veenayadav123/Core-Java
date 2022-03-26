package datte_ExcerciseQ;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datte_ExcQ3 {

	public static void main(String[] args) throws Exception {

		String sd = "03/02/2022"; // Start date
		String ed = "02/02/2022";

		SimpleDateFormat sdf1 = new SimpleDateFormat("mm/DD/yyyy");
		Date std = sdf1.parse(sd);

		SimpleDateFormat sdf2 = new SimpleDateFormat("mm/DD/yyyy");
		Date edd = sdf2.parse(ed);

		if (std.compareTo(edd) == 1) {

			System.out.println("Error : End date is less than start date");
		}
	}

}
