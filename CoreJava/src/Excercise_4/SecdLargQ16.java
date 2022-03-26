package excercise_4;

public class SecdLargQ16 {

	public static void main(String[] args) {

		int a[] = { 6000, 1025, 3035, 500, 425, 999, 25, 5000 };

		int y = 0;

		int x = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > x) {

				y = x;

				x = a[i];

			} else if (a[i] > y && a[i] < x) {

				y = a[i];

			}

		}

		System.out.println(y);
	}

}
