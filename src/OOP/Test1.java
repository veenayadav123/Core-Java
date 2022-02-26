package OOP;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws ParseException {
		
		Person p=new Person();
		Account ac=new Account();
		Automobile am=new Automobile();
		
		p.setName("Aman");
		p.setAddress("Indore");
		
		String a = "12/03/1999";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d = sdf.parse(a);
		
		System.out.println(d);

		System.out.println(p.getName());
		System.out.println(p.getDob());
		System.out.println(p.getAddress());
		System.out.println(p.getPI());
		
		ac.setNumber("990510114237");
		ac.setAccountType("saving Account");
		ac.setBalance(5000000);
		
		System.out.println(ac.getNumber());
		System.out.println(ac.getAccountType());
		System.out.println(ac.getBalance());
		
		am.setColor("Red");
		am.setSpeed(75);
		am.setMake("India");
		
		System.out.println(am.getColor());
		System.out.println(am.getSpeed());
		System.out.println(am.getMake());
		
	}

		
		
}

