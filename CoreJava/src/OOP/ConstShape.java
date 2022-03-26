package oop;

public class ConstShape {
	
	private String color = null;

	private int bd = 0;

	public static final double PI = 3.14;
	
	public ConstShape(String color,int bd) {
		
		this.color=color;
		this.bd=bd;
		
	}

	public String getcolor() {

		return color;
	}

public int getborderWidth() {
	
	return bd ;
	
	}

	
	}




