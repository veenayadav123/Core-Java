package SuperKey;

public class SuperChild extends SuperParent {

	public static void main(String[] args) {

		SuperChild s = new SuperChild(25, 9);

		// SuperParent s1 = new SuperChild(55,6);

		//SuperParent s2 = new SuperParent(7);

	}

	public SuperChild() {

		System.out.println("Hello Default Constructor ");

	}

	public SuperChild(int i, int j) {

		super(j);

		System.out.println("Hello " + i);

	}

}
