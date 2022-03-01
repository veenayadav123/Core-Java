package OOPExceQ;

public class CircleQ1 extends ShapeQ1 {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {

		return 3.14 * radius * radius;
	}

}
