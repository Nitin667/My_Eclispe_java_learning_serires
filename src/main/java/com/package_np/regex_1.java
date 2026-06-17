package com.package_np;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//  "."   -> dot goes one bye a single character the cursor will be moving ok 
//^Hello	if hello Finds a match at the beginning of a string as in: ^Hello
//$	Finds a match at the end of the string as in: World$ , example Sirsi$
//\d	Find a digit
//\d+ — find multiple digits together: one or more digits   \D — opposite of \d, matches NON digits:




//matcher.start()  Gives the Index Position where the match was found!

//matcher.group() → Returns the Actual Matched Word/Text!


//n+	Matches any string that contains at least one n
//"nn"    →  ✅  two n        — OK!
//"nnn"   →  ✅  three n      — OK!
//"nnnn"  →  ✅  four n       — OK!

//n*	Matches any string that contains zero or more occurrences of n if there a 0 n no problem

//a?	Matches any string that contains zero or one occurrences of n
//if a is not there  it prints empty if 1 a present it print a 


//n{x}	Matches any string that contains a sequence of X n's 
//      ex a{3}  aa ,aaa aaaaa  first one wil not match second one match ,third one match other left ignonere

//n{x,y}	Matches any string that contains a sequence of X to Y n's 
// atleast 2 aa must persent else not more than 4


//n{x,}	Matches any string that contains a sequence of at least X n's
//Pattern pattern = Pattern.compile("a{3,}");
									//↑
								//minimum 3, NO maximum limit there should be 3 other aaaaaaaaaaaaaaaaa more ! 

public class regex_1 {
public static void main(String[] args) {
	String string1="Heallo234 tt This aa aaa aaaaa aaaaaaaaaaaaa is r a y t Nitin from Sirsi124";
	
	Pattern p1=Pattern.compile("a{3,}");
	Matcher m1=p1.matcher(string1);
//	Boolean yesBoolean=m1.find();
	while(m1.find()) {
		System.out.println(m1.group());
		System.out.println(m1.start());
		
	}

//	if(yesBoolean) {
//		System.out.println("Found");
//	}
//	else {
//		System.out.println("Not found");
//	}
}
}
