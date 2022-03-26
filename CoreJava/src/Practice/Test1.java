package practice;

public class Test1 {

	public static void main(String[] args) {

		MethodConcept1 m1 = new MethodConcept1();

		Test1 t = new Test1();

		m1.mult();
		m1.add();
		m1.sub();
		t.div();
	}

	void div() {
		int i = 2;
		int j = 22;
		int k = j / i;
		System.out.println(k);
	}

}
