package StrExcerciseQ;

public class StrCharQ3 {
	public static void main(String[] args) {
		String s = "Welcome Rays Technology";
		char c = 'e';

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == c) {

				count++;

			}

		}
		System.out.println(count);

	}

}
