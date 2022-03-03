package InheritncOverriding;

public class PolyArryargs {
	
	public static void main(String[] args) {

		ShapArryargs[] s = new ShapArryargs[2];
		s[0] = new RectArryargs();
		s[1] = new CircleArryargs();
		
		double length = Double.parseDouble(args[0]);
		double Width = Double.parseDouble(args[1]);
		double radius = Double.parseDouble(args[2]);

		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}

	public static double calcArea(ShapArryargs[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea += s[i].area();

		}
		return totalArea;
	
	}
}
