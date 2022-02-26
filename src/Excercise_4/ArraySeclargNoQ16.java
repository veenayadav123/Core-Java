package Excercise_4;

public class ArraySeclargNoQ16 {
	public static void main(String[] args) {
		int[] a = { 11, 54, 16, 75, 22, 45, 74 };
		int b = 0;
		int c = a.length;

		for (int i = 0; i < c; i++) {

			for (int j = i + 1; j < c; j++) {

				if (a[i] > a[j]) {

					b = a[i];
					
					a[i] = a[j];
					
					a[j] = b;
				}

			}

		}

		System.out.println("Largest Number is : " + a[c-2]);

	}
}
