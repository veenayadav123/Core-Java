package javabasics;

public class Swtch1 {
	public static void main(String[] args) {
		int size=args.length;
		switch(size) {
		case 0:
	    System.out.println("Hello All n1 n2 n3...");
		break;
		case 1:
		System.out.println("Hello1" +args[0]);
		break;
		default:
		for(int i=0;i<size;i++) {
			System.out.println(i+"= Hello2 " + args[i]);
		}
				
		
		}
		
	}

}
