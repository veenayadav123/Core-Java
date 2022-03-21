package Generics;


import java.util.ArrayList;
import java.util.List;

public class WildcardsTest {
	
	public static void display(List< ? extends Number> list) {
		
		for(Number e : list) {
			System.out.println(e);
		}
	}
	public static double sum(List < ? extends Number> list) {
		
		double total = 0;
		
		for(Number e : list) {
			
			total+= e.doubleValue();
		}
		return total;
	}
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(50);
		l.add(90);
		display(l);
		System.out.println(sum(l));
	}

}
