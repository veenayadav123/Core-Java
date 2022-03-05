package Collection;

import java.util.ArrayList;

public class ArryListAdd {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("One");
		l.add("Two");
		l.add("Three");
		
		l.add(6);
		l.add(7);
		
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		//System.out.println(l.get(3)+l.get(4));    //Not Posible
		
		
		Integer i = (Integer)l.get(3);
		Integer j = (Integer)l.get(4);
		
		System.out.println(i+j);
		
	}

}
