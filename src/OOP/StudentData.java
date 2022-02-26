package OOP;

public class StudentData {
	
	private String fname=null;
	private String lname=null;
	private int eno=0;
	
	public String getFname() {
		
		return fname;
	}
	public String getLname() {
		
		return lname;
	}
	public int getEno() {
		
		return eno;
	}
	public StudentData(String fname,String lname,int eno) {
		
		this.fname=fname;
		this.lname=lname;
		this.eno=eno;
	}
	
	

}
