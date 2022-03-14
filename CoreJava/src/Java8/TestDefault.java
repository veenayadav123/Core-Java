package Java8;

//import Java8.DefaultMethod.TestDefault;

public class TestDefault implements DefaultMethod {

	public static void main(String[] args) {

		TestDefault t = new TestDefault();

		((DefaultMethod) t).defMethod();
	}

}
