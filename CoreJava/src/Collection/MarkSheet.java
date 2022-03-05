package Collection;

import java.util.HashMap;

public class MarkSheet {
	
	public static void main(String[] args) {
		
		HashMap m1 =new HashMap();
		
		/*m1.put("Maths",91 );
		m1.put("Physics", 94);
		m1.put("Chemistry", 90);*/
		m1.put(4,5.05);
		m1.put(5,55.5);
		
		
		for(double v:keys) {
			
			System.out.println(v);
			
		}
		
		System.out.println(m1.get(4));
		
		Integer i = (Integer)m1.get("Maths");
		Integer j = (Integer)m1.get("Physics");
		Integer k = (Integer)m1.get("Chemistry");
		
		Object PCM = i+j+k;
		
		System.out.println("PCM TotalMarks : "+PCM);
		
		Double d = (Double)m1.get(4);
		Double l = (Double)m1.get(5);
		
		
		Object m = d+l;
		System.out.println(m);
		
		
		
	}

}
