package Excercise_4;

public class PrimeNoQQ11 {
	public static void main(String[] args) {
		int n = 23;

		if (n == 0 || n == 1) {
			System.out.println("Number is Invalid");
		}

		for (int i = 2; i <= n; i++) {

			if (n % i == 0) {

				if (n == i) {
					System.out.println("Given no is Prime");

				} else {
					System.out.println("Given no is not Prime");
					break;
				}

			}

		}

	}
}
