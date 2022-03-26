package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMarkSheet extends MarkSheet implements Comparable {

	private static int result;
	private MarkSheet m;

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		MarkSheet m1 = new MarkSheet();

		MarkSheet m2 = new MarkSheet();

		m1.setRollNo("103");
		m1.setName("Veena");
		m1.setPhysics(94);
		m1.setChemistry(90);
		m1.setMaths(91);

		System.out.println("Student 1 :" + m1.getRollNo() + " " + " " + m1.getName() + " " + m1.getPhysics() + " "+ m1.getChemistry() + " " + m1.getMaths());

		m2.setRollNo("102");
		m2.setName("Veera");
		m2.setPhysics(95);
		m2.setChemistry(91);
		m2.setMaths(89);

		System.out.println("Student 2 :" + m2.getRollNo() + " " + " " + m2.getName() + " " + m2.getPhysics() + " "+ m2.getChemistry() + " " + m2.getMaths());

		Integer o = result;
		System.out.println(o);
	}

	@Override
	public int compareTo(MarkSheet m) {
		
		int result = rollNo.compareTo(m.rollNo);
		return result;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
