package javabasics;

import java.time.LocalDate;
import java.time.Period;

public class DatteExQ1 {
	public static void main(String[] args) {
		 LocalDate l= LocalDate.of(1997, 12, 4);
		LocalDate l1=LocalDate.now();
		Period p= Period.between(l,l1 );
		System.out.println(p);
		
		System.out.println("Year =" +p.getYears());
		System.out.println("Months =" +p.getMonths());
		System.out.println("Days =" +p.getDays());
		
	
	}

}
