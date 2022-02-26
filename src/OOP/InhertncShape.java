package OOP;

public class InhertncShape {
	public static void main(String[] args) {
		
		CircleEx c = new CircleEx();
		
		//Shape1 s = new CircleEx();
		//CircleEx c = (CircleEx) s;

		c.setBw(21);
		c.setColor("Red");
		c.setRadius(2);

		double d = c.area();
		System.out.println(c.getBw());
		System.out.println(c.getColor());
		System.out.println(c.getRadius());
		System.out.println(d);

	}
}