package javabasics;

public class D3Array {
	public static void main(String[] args) {

		int[][][] a = new int[2][2][2];

		System.out.println(a.length);

		for (int i = 0; i < a.length; i++) {

			System.out.println(" ");

			for (int j = 0; j < a[i].length; j++) {

				System.out.print(" ");

				for (int k = 0; k < a[j].length; k++) {

					System.out.print(" " + k);

				}

			}

		}
	}
}
