package OOPExceQ;

public class RectangleQ1 extends ShapeQ1 {
	
	private double  length;
	private double width;

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double area() {

		return length * width;
	}

}
