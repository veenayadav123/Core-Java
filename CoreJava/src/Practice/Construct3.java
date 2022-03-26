package practice;

class Parent1 {

	String color = "Red";

	Parent1() {

		System.out.println("Hello");
	}
}

class Child1 extends Parent1 {

	String color = "black";

	void printColor() {

		System.out.println(color);
		System.out.println(super.color);

	}
}

public class Construct3 {

	public static void main(String[] args) {

		Child1 c = new Child1();

		c.printColor();

	}

}
