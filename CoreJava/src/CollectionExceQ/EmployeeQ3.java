package collectionExceQ;

import java.util.Comparator;

public class EmployeeQ3 implements Comparator<EmployeeQ3> {

	public String fname;
	public String lname;

	public EmployeeQ3() {

	}

	public EmployeeQ3(String fname, String lname) {

		this.fname = fname;
		this.lname = lname;

	}

	@Override
	public int compare(EmployeeQ3 e1, EmployeeQ3 e2) {

		if (e1.fname == e2.fname) {

			return e1.lname.compareTo(e2.lname);
		} else {

			return e1.fname.compareTo(e2.fname);
		}
	}

	@Override
	public String toString() {

		return fname + " " + lname;
	}

}
