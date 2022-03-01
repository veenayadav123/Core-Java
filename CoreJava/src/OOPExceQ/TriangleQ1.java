package OOPExceQ;

public class TriangleQ1 extends ShapeQ1{
	
	private double base;
	private double hight;

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}

	public double area() {

		return 1 / 2 * base * hight;
	}

}
