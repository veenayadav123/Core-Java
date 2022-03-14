package Practice;

import java.awt.List;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUse {
	
	public static void main(String[] args) {
		
		List emails = new ArrayList();
		
		emails.add("user@gmail.com");
		emails.add("user@domain.com");
		emails.add("user.name@domain.com");
		
		//Invalid emails
		emails.add("user#domain.com");
        emails.add("@yahoo.com");
        
        String regex = "^(.+)@(.+)$";
        
        Pattern pattern = Pattern.compile(regex);
        
       for (String email : emails) {
		
	Matcher matcher = pattern.matcher(email);
	
	System.out.println(email +" : "+matcher.matches());
		
	}
		
	}

}
