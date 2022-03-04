package CollectionExceQ;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintElementQ1 {
	
	public static void main(String[] args) {
		
		ArrayList l = new ArrayList();
		
		l.add("Aman");
		l.add("Raman");
		l.add("Sohan");
		l.add(859);
		l.add("Mohan");
		
		Iterator it = l.iterator();
		
		System.out.println("ArrayList Elements");
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
	}

}
