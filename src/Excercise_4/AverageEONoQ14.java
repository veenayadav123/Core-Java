package Excercise_4;

public class AverageEONoQ14 {
	public static void main(String[] args) {
		int Eno = 0, Ono = 0, count = 0, count1 = 0;
		float EAve = 0, OAve = 0;
		for (int i = 1; i <= 20; i++) {

			if (i % 2 == 0) {
				Eno = Eno + i;
				count++;
			}
		}
		EAve = Eno / count;
		System.out.println("Average of Even no. " + EAve);

		for (int j = 1; j <= 20; j++) {
			if (j % 2 != 0) {
				Ono = Ono + j;
				count1++;
			}
		}
		OAve = Ono / count1;
		System.out.println("Average of odd no. " + OAve);
	}

}
