package OOPExceQ;

public class TriangleConsQ1 extends ShapConsQ1 {

	private double base;
	private double hight;

	public TriangleConsQ1(double base, double hight) {

		this.base = base;
		this.hight = hight;

	}

	public double area() {

		return 1 / 2 * base * hight;
	}

}
