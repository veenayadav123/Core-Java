package javabasics;

public class CostMeth {
	public static void main(String[] args) {
		add();
		printAll(args);
		
	}
	public static void add() {
		int a=5, b=10,sum;
		sum=a+b;
		System.out.println(sum);
	}
	public static void printAll(String[] args) {
		
		for(int i=0;i<args.length;i++) {
		
			System.out.println("Hello " + args[i]);
			
		}
	}

	}


