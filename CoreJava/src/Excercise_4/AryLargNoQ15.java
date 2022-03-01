package Excercise_4;

public class AryLargNoQ15 {
	public static void main(String[] args) {
		int[] a = { 55, 13, 7, 5, 11,65 };
		int b = 0;

		for(int i=0;i<a.length;i++) {
			
			if(b < a[i]) {
				
				b = a[i];
			}
		}
		
		System.out.println("Largest Number is : " +b);
	}


}

