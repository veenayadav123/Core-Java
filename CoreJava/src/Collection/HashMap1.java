package Collection;

import java.util.HashMap;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		
		map.put("A121", 90);
		map.put("A122",95 );
		map.put("A123",75 );
		
		Integer i = (Integer)map.get("A121");
		Integer j = (Integer)map.get("A122");
		Integer k = (Integer)map.get("A123");
		
		System.out.println((i+j+k)/3);
		
	}

}
