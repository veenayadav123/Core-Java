package javabasics;

public class D2AryTable {
	public static void main(String[] args) {
		
		int[][] a=new int [10][10];
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(" ");
			
			for(int j=2;j<a[i].length;j++) {
				int l=i+1;
				
				int k=l*j;
				
				System.out.print(k+"\t");
				
			}
			
		}
		
	}

}
