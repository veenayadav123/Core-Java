package Collection;

public class hasCodeNequals implements Comparable<hasCodeNequals> {

	public String rollNo;

	public String name;

	public int marks;

	public hasCodeNequals() {

	}

	public hasCodeNequals(String rollNo, String name, int marks) {

		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public boolean equals(Object o) {

		if (o == null)

			return false;

		if (!(o instanceof hasCodeNequals))

			return false;
		hasCodeNequals other = (hasCodeNequals) o;
		return this.rollNo.equals(other.rollNo);

	}

	@Override
	public int hashCode() {

		return rollNo.hashCode();
	}

	@Override
	public String toString() {

		return rollNo + " " + name + " " + marks;
	}

	@Override
	public int compareTo(hasCodeNequals o) {

		return rollNo.compareTo(o.rollNo);
	}

}
