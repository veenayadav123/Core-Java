package javabasics;

public class StrSB { 
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rays");
		System.out.println(sb);
		sb.append(" Technology");
		System.out.println(sb);
		System.out.println("Lenght:"+sb.length());
		System.out.println("Capacity:"+sb.capacity());
		System.out.println("Char:"+sb.charAt(5));
		System.out.println("Index Of:"+sb.indexOf("Tech"));
		System.out.println("Replace:"+sb.replace(0,5,"Hello"));
		System.out.println("Reverse:"+sb.reverse());
	}

}
