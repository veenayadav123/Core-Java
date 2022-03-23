package Practice;

import java.util.Scanner;

public class ScannerUse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = sc.next();
		System.out.println("Your name is :"+name);

		System.out.println("Enter a Number");
		int a = sc.nextInt();

		System.out.println("Enter a Second Number");
		int b = sc.nextInt();

		int total = a + b;
		System.out.println("Total is = "+total);

	}

}
