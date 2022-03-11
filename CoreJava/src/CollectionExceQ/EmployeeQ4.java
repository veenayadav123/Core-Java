package CollectionExceQ;

public class EmployeeQ4 {
	
	public String name;
	
	public int id;
	
	public EmployeeQ4() {
		
	}
	
	public EmployeeQ4(String name,int id) {
		
		this.name = name;
		this.id =id;
		
	}

	@Override
	public boolean equals(Object obj) {
		
		return false;
	}

	@Override
	public int hashCode() {
		
		return super.hashCode();
	}

}
