package com.package_np;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Email_pattern{
	
	void email_check(){
		String email_p[]=new String[]{
				
				"Nitinprabhu46@gmail.com",
				 "userWithoutAt.com",        // ❌ no @ symbol
		            "@gmail.com",              // ❌ no username
		            "user@.com",
		            "user_name@yahoo.com",      // ✅ valid
		            "user123@domain.in",        // ✅ valid
		            "user@domain.co.in",
				
		};
		
		
		Pattern p1=Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9._]+\\.[a-zA-Z]{2,}$");
		for (String string : email_p) {
				Matcher m1=p1.matcher(string);
				if(m1.find()) {
					System.out.println(m1.group());
				}
				else {
					System.out.println("Wrong emails");
				}
		}
//		Matcher m1=p1.matcher()
	}
	
	
	
	
	
}
public class Email_regex {
	public static void main(String[] args) {
		Email_pattern p1=new Email_pattern();
		p1.email_check();
	}

}
