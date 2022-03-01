package javabasics;

public class Str {
	public static void main(String[] args) {
		String s="Aman Mathur";
		String st=new String("Raman");
		System.out.println(st);
		System.out.println(s);
		s.concat("Hello");
		System.out.println("String Length-" +s.length());
		System.out.println("3rd Character is-" +s.charAt(2));
	    System.out.println("ma index is-"+s.indexOf("Ma"));
	   System.out.println("First a Position-"+s.indexOf("a"));
	   System.out.println("Last a Position-"+s.lastIndexOf("a"));
	   System.out.println("a is replaced by b-"+s.replace("a","b"));
	   System.out.println("All a is replaced by b-"+s.replaceAll("a","b"));
	   System.out.println("All space is replaced by . .-"+s.replaceAll(" ", ".."));
	   System.out.println("Small Aman Mathur-"+s.toLowerCase());
	   System.out.println("Capital Aman-"+s.toUpperCase());
	   System.out.println("Start with Aman-"+s.startsWith("Aman"));
	   System.out.println("Ends with hur-"+s.endsWith("hur"));
	   System.out.println("Substring-"+s.substring(6));
	}
}
