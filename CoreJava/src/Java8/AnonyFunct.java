package Java8;

public interface AnonyFunct extends HelloInt {

	public static void main(String[] args) {

		HelloInt aFun = new HelloInt() {

			public void say() {

				System.out.println("Hello Anonymous Function");
			}
		};

		aFun.say();

	}
}
