package practice;

class Base {
      
    int id;
    
	Base() {

		System.out.println("This is Parent Constructor");
	}
	Base(int id) {

		this.id=id;
		System.out.println(id);
	}
	public int getId() {
		
		return id;
	}
	
}

class New extends Base {

	New() {
		super(45);
		System.out.println("This is Child Constructor");
	}

}

public class TestSuper {

	public static void main(String[] args) {

		New c = new New();
		Base b = new Base();
	   System.out.println(""+c.getId());
		

	}
}
