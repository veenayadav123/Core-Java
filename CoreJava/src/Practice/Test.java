package practice;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first No.");
		int n1 = sc.nextInt();
		System.out.println("Enter Second no.");
		int n2 = sc.nextInt();
		int t = n1 + n2;
		System.out.println("total is : " + t);

		System.out.println("Enter first float no.");
		float f1 = sc.nextFloat();
		System.out.println("Enter second float no. ");
		float f2 = sc.nextFloat();
		float d = f1 - f2;
		System.out.println("Division is : " + d);

		System.out.println("Enter first String ");
		String s1 = sc.next();
		System.out.println("Enter Second String ");
		String s2 = sc.next();
		System.out.println("String is : " + s1 + s2);

	}
}
