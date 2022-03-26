package oop;

public class EmployeeGS {

	public static void main(String[] args) {

		EmpDataGS e1 = new EmpDataGS();
		EmpDataGS e2 = new EmpDataGS();
		String s;

		e1.setName("Aman");
		e1.setId(7861);
		System.out.println("Employee Name is :" + e1.getName());
		System.out.println("Employee Id is :" + e1.getId());

		e2.setName("Raman");
		e2.setId(7862);
		System.out.println(e2.getName());
		System.out.println(e2.getId());

		s = e1.getName();
		System.out.println("Hello" + s);

	}

}
