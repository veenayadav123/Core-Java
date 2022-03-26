package inheritance;

public class TextInheritance {
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t=new Triangle();
		
		c.setColor("Green");
		c.setBw(25);
		c.setRadius(3);
		double d=c.area();
		
		
		System.out.println(c.getColor());
		System.out.println(c.getBw());
		System.out.println(c.getRadius());
		System.out.println("Circle Area :"+d);
		
		r.setColor("yellow");
		r.setBw(21);
		r.setlength(3);
		r.setWidth(5);
		double d1=r.area();
		
		System.out.println(r.getColor());
		System.out.println(r.getBw());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println("Rectangle Area :"+d1);
		
		t.setColor("yellow");
		t.setBw(21);
		t.setHight(6);
		t.setBase(7);
		double d2=r.area();
		
		System.out.println(t.getColor());
		System.out.println(t.getBw());
		System.out.println(t.getHight());
		System.out.println(t.getBase());
		System.out.println("Triangle Area :"+d2);
		
		double totalArea=d+d1+d2;
		System.out.println("Total Area :"+totalArea);
	}

	

}
