package practice;

class Parent {

	int id;

	public Parent(int id) {

		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Parent() {

		System.out.println("I am a Parent Constructor");

	}

}

class Child extends Parent {

	private String name;

	public String getName() {
		return name;
	}

	/*
	 * public Child() {
	 * 
	 * System.out.println("I am a Child Constructor"); }
	 * 
	 * public Child(String name) {
	 * 
	 * this.name = name; }
	 */

}

public class Constructor2 {

	public static void main(String[] args) {

		Parent p = new Parent();
		// Parent p1 = new Parent(55);
		Child c = new Child();
		// Child c1 = new Child("Riya");

		// System.out.println("Name is : " + c1.getName());
		// System.out.println("Id is : " + p1.getId());

	}

}
