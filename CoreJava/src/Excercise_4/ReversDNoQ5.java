package Excercise_4;

public class ReversDNoQ5 {

	public static void main(String[] args) {

		int reverse = 0;

		for (int no = 6789; no != 0; no = no / 10) {
			int reminder = no % 10;
			reverse = reverse * 10 + reminder;

		}
		System.out.println("The reverse Digit of given no is: " + reverse);

		// StringBuffer sb = new StringBuffer("786786");

		// System.out.println("Reverse Digit is : " + sb.reverse());
	}

}
