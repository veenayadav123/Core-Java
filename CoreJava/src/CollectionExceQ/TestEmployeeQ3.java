package collectionExceQ;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployeeQ3 {
	
	public static void main(String[] args) {
		
		ArrayList employees = new ArrayList();
		
		employees.add(new EmployeeQ3("Veena","Yadav"));
		employees.add(new EmployeeQ3("Pratibha","Soni"));
		employees.add(new EmployeeQ3("Shubh","Gupta"));
		employees.add(new EmployeeQ3("Ram","Sharma"));
		employees.add(new EmployeeQ3("Ananya","Verma"));
		employees.add(new EmployeeQ3("Ananya","Jadhav"));
		employees.add(new EmployeeQ3("Pratibha","Agrawal"));
		
		EmployeeQ3 emp = new EmployeeQ3();
		
		Collections.sort(employees,emp);
		
		for(Object o : employees) {
			
			System.out.println(o);
			
		}
	
	}

}
