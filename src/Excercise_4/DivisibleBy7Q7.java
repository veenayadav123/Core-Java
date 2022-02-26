package Excercise_4;

public class DivisibleBy7Q7 {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 101; i < 200; i++) {
			if (i % 7 == 0) {
				j = j + i;

			}

		}
		System.out.println("Sum is : " + j);

	}

}
