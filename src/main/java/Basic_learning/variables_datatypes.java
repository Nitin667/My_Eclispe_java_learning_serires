package Basic_learning;

import java.io.Console;
//literal :-  a fixed value directly written in code is called literal

public class variables_datatypes {
// primitive data types are Byte short int long double char float boolean 
public static void main(String[] args) {
	Short shoByte=1000;
	long l1=9_223_372_036_854_775_807L;
	System.out.println(shoByte);
	System.out.println(l1);
	char a='A';
	
//	System.out.println((int)a);
	for (char i ='A'; i<='Z'; i++) {
		System.out.println(i+" the number is = " +(int)i);
	}
	
	

String iString ="   This is a sequence of characters    ";
System.out.println(iString);
System.out.println(iString.charAt(1));
System.out.println(iString.indexOf("is"));
System.out.println(iString.length());
System.out.println(iString.contains("ence"));
System.out.println(iString.trim());



}
}
