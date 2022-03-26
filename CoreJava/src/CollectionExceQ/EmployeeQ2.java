package collectionExceQ;

import java.util.Comparator;

public class EmployeeQ2 implements Comparator<EmployeeQ2> {

	public String ename;

	public int esalary;

	public EmployeeQ2() {

	}

	public EmployeeQ2(String ename, int esalary) {

		this.ename = ename;
		this.esalary = esalary;

	}

	public String toString() {

		return ename + "," + esalary;
	}

	public int compare(EmployeeQ2 e1, EmployeeQ2 e2) {

		if (e1.esalary > e2.esalary) {

			return -1;
		} else if (e1.esalary == e2.esalary) {

			return 0;
		} else {
			return 1;
		}
	}

}
