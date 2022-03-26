package oopExceQ;

public class CircleConsQ1 extends ShapConsQ1 {

	private double radius;

	public CircleConsQ1(double radius) {

		this.radius = radius;
	}

	public double area() {

		return 3.14 * radius * radius;
	}

}
