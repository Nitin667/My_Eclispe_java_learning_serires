package com.package_np;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

public class regex_2 {
public static void main(String[] args) {
 String data[]=new String[] {
		 "Data._-1@co",
		 "hello3@con",
		 "this455._is@con",
		 "simple4@con"
 };
 
 Pattern p1=Pattern.compile("^[a-zA-Z\\d._-]+@[a-zA-Z]+{2,}$");
 for (String string : data) {
	 Matcher m1=p1.matcher(string);
	 if(m1.find()) {
		 System.out.println(m1.group());
	 }
	 else {
		System.out.println("not based on rutles");
	}
	 
}

 
}
}
