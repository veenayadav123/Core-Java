package collection;

import java.util.ArrayList;

public class ArrListReadEle {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add("One");
		a.add("Two");
		a.add("Three");
		a.add("Four");
		
		int size = a.size();
		
		System.out.println("Size "+a.size());
		
		for(int i=0; i<a.size(); i++) {
			
			System.out.println(i+":"+a.get(i));
			
		}
		
		
		
	}

}
