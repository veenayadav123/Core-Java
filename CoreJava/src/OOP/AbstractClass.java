package oop;

public abstract class AbstractClass {

	String color = null;
	int borderWidth = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {

		return borderWidth;
	}

	public abstract double area();

}
