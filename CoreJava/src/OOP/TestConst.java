package oop;

public class TestConst {

	public static void main(String[] args) {

		Const c = new Const();
		c.setId(1);
		c.setName("veena");
		

		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.PI);
		
		Const c1 = new Const();
		c1.setId(2);
		c1.setName("veer");

		System.out.println(c1.getId());
		System.out.println(c1.getName());

	}

}
