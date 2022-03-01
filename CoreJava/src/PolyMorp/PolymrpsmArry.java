package PolyMorp;

import javax.swing.text.html.parser.Parser;

import OOP.Shape;

public class PolymrpsmArry {

	public static void main(String[] args) {

		ShapeArry[] s = new ShapeArry[3];
		s[0] = new RectangleArry();
		s[1] = new CircleArry();
		s[2] = new TriangleArry();

		double totalArea = calcArea(s);
		System.out.println(totalArea);
	}

	public static double calcArea(ShapeArry[] s) {

		double totalArea = 0;

		for (int i = 0; i < s.length; i++) {

			totalArea += s[i].area();

		}
		return totalArea;

	}
}
