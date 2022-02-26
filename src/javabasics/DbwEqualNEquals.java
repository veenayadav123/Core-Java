package javabasics;

public class DbwEqualNEquals {
	public static void main(String[] args) {
		//String s3=new String("Ram");
	    //String s4=new String("Ram");
		
		String s3="Ram",s4="Ram";
	
		boolean result=(s3==s4);
		System.out.println(result);
		
		boolean result1=s3.equals(s4);
		System.out.println(result1);
		
	}

}
