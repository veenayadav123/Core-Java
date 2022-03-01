package javabasics;

public class D1Array {
	public static void main(String[] args) {
		int [] a= {2,11,6,7,9,12};
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		int[] b=new int[3];
		b[0]=8;
		b[1]=5;
		b[2]=9;
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
			
		System.out.println(b[0]);
		System.out.println(b[1]);
		
	}

}
