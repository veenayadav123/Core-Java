package constructor1;

public class CircleEx extends Shape1 {

	public static void main(String[] args) {

		CircleEx c = new CircleEx();
		CircleEx c1 = new CircleEx(25);
		CircleEx c2 = new CircleEx(2,5);
		
		//Shape1 s = new CircleEx();
		//Shape1 s1 = new CircleEx(5);
		
		//Shape1 s3 = new Shape1();
		 //Shape1 s4 = new Shape1(25);

	}
	public CircleEx() {

		System.out.println("Default Child Constructor");
	}

	public CircleEx(int i) {

		System.out.println(i);
	}

	public CircleEx(int i,int j) {

		System.out.println(i+j);
	}

}
