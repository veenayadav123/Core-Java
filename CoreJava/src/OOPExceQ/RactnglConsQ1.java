package oopExceQ;

public class RactnglConsQ1 extends ShapConsQ1 {

	private double length;
	private double width;

	public RactnglConsQ1(double lenght, double Width) {

		this.length = lenght;

		this.width = Width;

	}

	public double area() {

		return length * width;
	}

}
