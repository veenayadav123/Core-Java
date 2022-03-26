package oopExceQ;

public class TestConQ1 {

	public static void main(String[] args) {

		ShapConsQ1[] s = new ShapConsQ1[3];
		s[0] = new RactnglConsQ1(4, 5);
		s[1] = new CircleConsQ1(9);
		s[2] = new TriangleConsQ1(6, 7);

		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}

	public static double calcArea(ShapConsQ1[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea += s[i].area();

		}
		return totalArea;

	}

}
