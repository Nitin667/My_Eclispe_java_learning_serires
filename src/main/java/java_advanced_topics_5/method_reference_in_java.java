package java_advanced_topics_5;

import java.util.Arrays;
import java.util.List;

import org.apache.tomcat.util.digester.ArrayStack;

/*
 * Method Reference = shorter way to write Lambda!
instead of writing full lambda
just point to existing method!



Lambda         → s -> System.out.println(s)
Method Ref     → System.out::println
                              ↑↑
                          :: double colon
                          
                          
                          list.forEach(s -> System.out.println(s));

// method reference way — shorter! ✅
list.forEach(System.out::println);


 * 
 * */

class hi{
	static void printring(String s) {
		System.out.println(s.toUpperCase());
	}
}
public class method_reference_in_java 
{
public static void main(String[] args) {
//	List<Integer> a1=Arrays.asList(1,2,4,5);
	List<String> a1 = Arrays.asList("Mohan","Nitin","Aakash","Vishwa");
	
	a1.forEach(hi::printring);
//	a1.forEach(n->System.out.println(n));
//	a1.forEach(System.out::print);
}
}
