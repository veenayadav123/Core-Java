package Java8;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {

		int[] arr = { 15, 45, 89, 37, 97, 63, 42 };

		Arrays.parallelSort(arr);

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
