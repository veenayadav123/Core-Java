package excercise_4;

public class PrimeNoQ11 {
	public static void main(String[] args) {

		System.out.println("1 to 100 prime number are : ");

		for (int number = 1; number <= 100; number++) {

			int count = 0;

			for (int i = 2; i <= number / 2; i++) {

				if (number % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0 && number != 1) {

				System.out.println(number + " ");

			}
		}
	}

}
