package Excercise_4;

public class DescendingIntQ18 {

	static boolean b;

	public static void main(String[] args) {

		int a = position();

		if (b) {
			System.out.println(a);
		}
	}

	public static int position() {

		int[] a = { 7, 6, 5, 3, 2 };

		int x = 5;

		for (int i = 0; i < a.length; i++) {

			int y = a[i];

			if (x == y) {

				System.out.println(i);

			} else {
				b = x != y;
			}

		}

		return -1;

	}

}
