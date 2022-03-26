package practice;

public class MethodConcept1 {

	public static void main(String[] args) {

		MethodConcept1 m = new MethodConcept1();
		m.sub();
		add();
		mult();
	}

	static void add() {
       
		int a = 5;
		int b = 7;
		int c = a + b;
		System.out.println(c);
	}

	 void sub() {

		int x = 15;
		int y = 10;
		int z = x - y;
		System.out.println(z);

	}

	public static void mult() {

		int i = 9;
		int j = 8;
		int k = i * j;
		System.out.println(k);
	}

}
