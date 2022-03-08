package CollectionExceQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestEmployeeQ2 {

	public static void main(String[] args) {

		ArrayList employees = new ArrayList();

		employees.add(new EmployeeQ2("Vanshika", 50000));
		employees.add(new EmployeeQ2("Yashika", 40000));
		employees.add(new EmployeeQ2("Vansh", 90000));
		employees.add(new EmployeeQ2("Vashnavi", 30000));
		employees.add(new EmployeeQ2("Rashmi", 70000));
		employees.add(new EmployeeQ2("Rashmi", 60000));

		EmployeeQ2 emp = new EmployeeQ2();
		Collections.sort(employees, emp);

		for (Object o : employees) {

			System.out.println(o);

		}

	}
}
