package javabasics;

public class CostMethWPara {
	public static void main(String[] args) {
		
		add(9,5);
		sub(10,4);
	} 
	public static void add (int a,int b) {
		
		System.out.println("Sum is:" +(a+b));
		
	}
	public static int sub(int a,int b) {
		
		System.out.println("Sub is:" +(a-b));
		
		return a+b;
		
	}


}
