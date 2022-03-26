package excercise_4;

public class FibonacciSerQ6 {
	public static void main(String[] args) {
		int i = 0, j = 1, k;
		System.out.println(i);
		System.out.println(j);
		for (int l = 2; l <= 7; l++) {
			k = i + j;
			System.out.println(k);
			i = j;
			j = k;

		}

	}

}
