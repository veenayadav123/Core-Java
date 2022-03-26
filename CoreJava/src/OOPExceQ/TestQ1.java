package oopExceQ;

public class TestQ1 {

	public static void main(String[] args) {

		CircleQ1 c = new CircleQ1();
		c.setRadius(5.0);
		c.getRadius();

		RectangleQ1 r = new RectangleQ1();
		r.setLength(7.0);
		r.getLength();
		r.setWidth(3.0);
		r.getWidth();

		TriangleQ1 t = new TriangleQ1();
		t.setBase(5.0);
		t.getBase();
		t.setHight(3.0);
		t.getHight();

		ShapeQ1[] s = new ShapeQ1[3];
		s[0] = r;
		s[1] = c;
		s[2] = t;

		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}

	public static double calcArea(ShapeQ1[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea += s[i].area();

		}
		return totalArea;

	}

}
