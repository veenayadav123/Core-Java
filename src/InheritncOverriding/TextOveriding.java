package InheritncOverriding;

import Inheritance.Circle;
import Inheritance.Rectangle;
import Inheritance.Triangle;

public class TextOveriding {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();

		c.setColor("Green");
		c.setBw(25);
		c.setRadius(3.5);
		c.area();
		
		System.out.println(c.getColor());
		System.out.println(c.getBw());
		System.out.println(c.getRadius());
		System.out.println("Circle Area :" + c.area());

		r.setColor("yellow");
		r.setBw(21);
		r.setlength(3);
		r.setWidth(5);
		

		System.out.println(r.getColor());
		System.out.println(r.getBw());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		

	}

}
