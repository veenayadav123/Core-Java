package collection;

import java.util.Comparator;

public class Marksheet11 implements Comparator<Marksheet11> {

	public String rollNo;

	public String name;

	public int marks;

	public Marksheet11() {

	}

	public Marksheet11(String rollNo, String name, int marks) {

		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;

	}

	public String toString() {

		return rollNo + "," + name + "," + marks;
	}

	@Override
	public int compare(Marksheet11 m1, Marksheet11 m2) {

		if (m1.marks > m2.marks) {

			return 1;

		} else if (m1.marks == m2.marks) {

			return 0;

		} else {

			return -1;
		}

	}

}
