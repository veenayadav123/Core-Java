package javabasics;

public class CopyArray {
	public static void main(String[] args) {

		int[] a = { 2, 3, 24, 7, 5, 3, 2, 5, 67 };

		int[] b = new int[4];

		System.arraycopy(a, 0, b, 0, 3);
		b[3] = 45;
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}

	}

}
