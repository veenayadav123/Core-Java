package practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hash_Equals { //Used for Compare Objects
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("One");
		al.add("Two");
		al.add("Three");
		
		LinkedList l = new LinkedList();
	    l.addAll(al);
	    if(al.equals(l)) {
	    	
	    	System.out.println("This Object Values are Same "+al.hashCode()+" & "+l.hashCode());
	    }
		
		String a ="Ananya";
		String b ="Ananya";
		
		if(a.equals(b)) {
			
			System.out.println("a & b are equal variables,and their hashvalues are:"+" "+a.hashCode()+" & "+b.hashCode());
		}
		String c = "Sanaya";
		String d = "Shreya";
		
		if(!c.equals(d)) {
			
			System.out.println("a & b are equal variables,and their hashvalues are:"+" "+c.hashCode()+" & "+d.hashCode());
		}
	}

}
