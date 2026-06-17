package java_advanced_topics_5;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.package_np.interface1;

import opps_concepts_2.static_variables_method;

interface Animal{
 int add(int a,int b);
 
 default void sleep() {

     System.out.println("Sleeping");
 }

// Can It Have Default Methods?
 static void Hi() {
	 System.out.println("hello guys");
 }
 
 
}

	







public class functional_interface_in_java {

	
	
	
	
	
	
	/*Functional Interface in Java (Full Detail)

A Functional Interface is an interface that contains exactly one abstract method.

Introduced mainly to support Lambda Expressions in Java 8.

interface Animal {

    void sound();
}
is the only abstract method.

So this is a Functional Interface.
							
										
										*/
	public static void main(String[] args) {
		Animal a1=(int a,int b)->{
			return a+b;
		};
		System.out.println(a1.add(4, 10));
Animal.Hi();


List<Integer> asList = Arrays.asList(34,5,6,7,40,50,23,443,232,2);
asList.stream().filter(t->t>20).forEach(System.out::println);;

List<String> aio = Arrays.asList("hello","nitin");
List<String> helloList  = Arrays.asList("the","shoe2","nitin","ok");
helloList
.stream()
.filter(s->(s.length())>3)
.forEach(System.out::println);

	}

}
