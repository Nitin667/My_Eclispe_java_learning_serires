package Basic_learning;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jdk.javadoc.internal.doclets.toolkit.taglets.snippet.Replace;

public class regex_learning {
public static void main(String[] args) {
//	Regex ok 
	
	String string="THis is aaa string you got it or not tell aaaa me as faast as possible";
	Pattern p1=Pattern.compile("a{2,}");
	Matcher m1=p1.matcher(string);
//	System.out.println(m1.find());
string=string.replaceAll("a{2,}", "hee");
	
	while (m1.find()) {

	System.out.println(m1.group());
		
		
		System.out.println(m1.start());
	
	}	
}
}
