package excercise_4;

public class MissElemntQ17 {
	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 6, 8 };
		int[] b = { 2, 3, 4, 5, 6 };
		int m = 0;
		int n = 0;

		for (int i = 0; i < a.length; i++) {

			m = a[i];

		}
		for (int j = 0; j < b.length; j++) {

			n = b[j];

		}
		if(m!=n) {
			System.out.println(m);
			
		}
	}

}
