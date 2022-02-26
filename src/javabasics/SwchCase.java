package javabasics;

public class SwchCase {
	public static void main(String[] args) {
		int size=args.length;
		switch(size) {
		case 0:
			System.out.println("Hello case 0 :");
			break;
		case 1:
			System.out.println("hello case 1 :");
			default:
			System.out.println("hello");
			break;
		}
		
	}

}
