package Constructor1;

public class Hello {
	private String name=null;
	private int no=0;
	
	public String getName() {
		return name;
	}
	/*public void setName(String name) {
		this.name = name;
	}*/
	public int getNo() {
		return no;
	}
	/*public void setNo(int no) {
		this.no = no;
	}*/
	public Hello() {
		System.out.println("I am default Constructor");
	}
	public Hello(String name,int no1) {
		this.name=name;
		no=no1;
	}
	
	

}
