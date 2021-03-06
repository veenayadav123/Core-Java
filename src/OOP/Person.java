package OOP;

import java.util.Date;

public class Person {

	private String name;
	private Date dob;
	private String address;
	private static final double PI = 3.14;
	
	public double getPI() {
		
		return PI;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
