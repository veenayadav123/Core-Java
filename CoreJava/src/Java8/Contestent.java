package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Contestent {public static void main(String[] args) {

	ArrayList<Contestant> list = new ArrayList<Contestant>();
	list.add(new Contestant("Ram", "9993296435"));
	list.add(new Contestant("Shyam", "9755519435"));
	list.add(new Contestant("Raman", "9179906582"));
	list.add(new Contestant("Rashmi", "9589417726"));
	list.add(new Contestant("Shreya", "9698213329"));
	list.add(new Contestant("Sanaya", "9589412269"));
	list.add(new Contestant("InvalidNO", "11"));

	System.out.println("Winners !!");
	
	list.stream().map(e -> e.phone);
	
	list.stream().map(e ->e.phone).filter(e->e.length() == 10);
	
	list.stream().map(e ->e.phone).filter(e ->e.length()==10).distinct();

		
		  list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
		  .collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
		  Collections.shuffle(e); return e.stream();
		  
		  })).limit(3).forEach(e -> System.out.println(e));
		 
}
}

class Count {

public String name = null;
public String phone = null;

public Count(String n, String p) {

	name = n;
	phone = p;
}

}
