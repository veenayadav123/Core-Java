package Excercise_4;

public class ArrayQ18 {

	public static void main(String[] args) {

		int[] a = { 5, 4, 3, 2, 1 };

		ArrayQ18 e = new ArrayQ18();

		int z = e.position(a, 56);

		System.out.println(z);

	}

	public int position(int[] arr, int value) {

		int k = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == value) {

				k = i;

				return k;

			}
		}
		if (k == 0) {

			return -1;

		}

		return k;
	}
}
