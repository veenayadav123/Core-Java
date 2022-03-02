package ExceptnExerQ;

public class TestPropagationQ6 {

	public static void main(String[] args) {

		try {

			first();
		} 
		catch (Exception e2) {

			System.out.println("Caught the final Exception");

		}
	}

	public static void first() {

		try {

			second();
		}

		catch (RuntimeException e) {

			System.out.println("Caught by first,raised by second");

			RuntimeException e2 = new RuntimeException();

			throw e2;

		}
	}

	public static void second() {

		RuntimeException e = new RuntimeException();

		throw e;

	}

}
