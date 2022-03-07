package Collection;

public class SortMarkSheet implements Comparable<SortMarkSheet> {

	private String rollNo;

	private String name;

	private int marks;

	public SortMarkSheet(String r, String n, int m) {

		this.rollNo = r;

		this.name = n;

		this.marks = m;
	}

	
	  @Override public int compareTo(SortMarkSheet m) {
	  
	  return rollNo.compareTo(m.rollNo); }
	 
	
	/*
	 * public int compareTo(SortMarkSheet n) {
	 * 
	 * return name.compareTo(n.name); }
	 */


	public String toString() {
		return rollNo + " " + name + " " + marks;

	}

	

}
