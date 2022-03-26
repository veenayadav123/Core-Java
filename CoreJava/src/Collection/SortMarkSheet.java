package collection;

public class SortMarkSheet implements Comparable<SortMarkSheet> {

	private String rollNo;

	private String name;

	private int marks;

	public SortMarkSheet(String rollNo, String n, int m) {

		this.rollNo = rollNo;

		this.name = n;

		this.marks = m;
	}

	
	  @Override public int compareTo(SortMarkSheet s) {
	  
	  return rollNo.compareTo(s.rollNo); }
	 
     /*
	 * @Override public int compareTo(SortMarkSheet s) { //For Integer value
	 * 
	 * if (marks > s.marks) {
	 * 
	 * return 1; } else if (marks == s.marks) {
	 * 
	 * return 0;
	 * 
	 * } else {
	 * 
	 * return -1; }
	 * 
	 * }
	 */
	 
	 
	public String toString() {
		return rollNo + " " + name + " " + marks;

	}

}
