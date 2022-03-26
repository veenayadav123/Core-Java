package inheritance;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public int getLength() {

		return length;
	}

	public void setlength(int length) {

		this.length = length;

	}

	public int getWidth() {

		return width;
	}

	public void setWidth(int Width) {

		this.width = Width;

	}

	public double area() {

		return length * width;
	}
	

}
