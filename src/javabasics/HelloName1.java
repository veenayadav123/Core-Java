package javabasics;

public class HelloName1 {
	public static void main(String[] args) {
		for (int k = 0; k < args.length; k++) {
			System.out.println(args[k]);
		}
		if (args.length == 5) {
			System.out.println("Hello " + args[0]);

		} else {
			System.out.println("Parameter name is required");
		}

	}

}
