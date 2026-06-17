package com.package_np;
import java.util.regex.*;;
public class regex3 {

	    public static void main(String[] args) {
String arrsString= "THis is ia asting guys";
for (String string : arrsString.split("is")) {
	System.out.println(string);
}
	        Pattern p = Pattern.compile("a");

	        String[] arr = p.split("Java Python Spring");

	        for(String word : arr) {
	            System.out.println(word);
	        }
	    }
}
