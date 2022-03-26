package clonning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReversArryList {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(8);
		al.add(9);
		al.add(10);
		
		al.add("Reverse");
		
		al.add("ArrayList");
		
		
		System.out.println(al);
		
		Collections.reverse(al);
		
		System.out.println(al);
	}

}
