package InheritncOverriding;

import Inheritance.Shape;

public class Circle extends Shape {

	private double radius;

	public double getRadius() {

		return radius;
	}

	public void setRadius(double radius) {

		this.radius = radius;

	}

	public void area() {

		System.out.println("area of circle = "+ (3.14*radius*radius));
	}

}
