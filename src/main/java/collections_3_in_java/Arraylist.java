package collections_3_in_java;
import java.lang.invoke.LambdaConversionException;
import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

import Basic_learning.method;
import opps_concepts_2.interface_in_java;
import opps_concepts_2.this_keyword_usage;



/*ArrayList is a dynamic array!
size grows and shrinks automatically!

normal array  → fixed size, cannot change
ArrayList     → dynamic size, changes automatically!
 *
 * Method              What it does
──────────────────────────────────────────────
add(x)              add at end
add(i, x)           add at index i
get(i)              get element at i
set(i, x)           update element at i
remove(i)           remove at index i
remove(x)           remove by value
size()              get total elements
contains(x)         check if exists
indexOf(x)          first position of x
lastIndexOf(x)      last position of x
isEmpty()           check if empty
clear()             remove all
sort()              sort elements
toArray()           convert to array
subList(s, e)       get portion of list
addAll(list)        add another list
removeAll(list)     remove another list
retainAll(list)     keep common elements
iterator()          get iterator
forEach(lambda)     loop with lambda
 * 
 * 
 * */









class arr1{
	ArrayList<String> array_list_implimentation() {
	ArrayList<String> ap1=new ArrayList<String>();
	ArrayList<String> ap2=new ArrayList<String>();
	ap1.add("Nitin");
	ap1.add("Jiyan");
	ap1.add("Nobita");
	ap1.add("Doremon");
	
	
	System.out.println(ap1.get(2));
	ap1.set(1, "suniyo");  //replace jiyan with suniyo
	ap1.remove(1);   // remove the suniyo
	System.out.println(ap1.size());
	System.out.println(ap1.contains("Doremon"));   //exitsts or not 
	System.out.println(ap1.indexOf("Nitin")); // find position: means give index 
	
	System.out.println(ap2.isEmpty());  // check the is empty or not 
	
	//ap1.clear();	//clearn the all elements 
	
//	sort() elements 
	Collections.sort(ap1);  // sort in ascending order 
//	toArray() — convert to array:
	
	String str[]=ap1.toArray(new String[0]);  
	/* new String[0] means: "Hey Java, here is a blank type blueprint. You figure out the size."

new String[1] means: "Hey Java, build a 1-slot box first, and if it doesn't fit, throw it away and build a bigger one."*/
	for (String string1 : str) {
		System.out.println(string1);
	}
	
	
	
//	 sub list 
	
//	subList()  gets the part of the list 
	List<String> sub = ap1.subList(2, 3);
	System.out.println(sub);  //start end(not included)
	
//	ap1.addAll(sub);  added data from sub list array to ap1
	
//	ap1.removeAll(sub);  //remove the data of ap1 which is present in sub 
	
//	retainAll() — keep only common elements:
//	ap1.retainAll(sub);
	
	System.out.println();
	return ap1;
	}
	
	void Arraylist_display(ArrayList<String> ap1) {
//	for (String string : ap1) {
//		System.out.println(string);
//	}
		
		
//	for (int i = 0; i < ap1.size(); i++) {
//		System.out.println(ap1.get(i));
//	}
		
		
//		using Iterator 
//		Iterator<String> iterator1=ap1.iterator();
//		while (iterator1.hasNext()) {
//			System.out.println(iterator1.next());
//			
//		}
		
//		Lambda
//		ap1.forEach(s->System.out.println(s));
		
//		method referenceMethod 
		ap1.forEach(System.out::println);
	}
}
  
//objects using arraylist usage 
class Student_32{
	String nameString;
	int age ;
	 Student_32(String nameString,int age) {
		this.nameString=nameString;
		this.age=age;
	}
	 @Override
	 public String toString() {
		return "Student_32 [nameString=" + nameString + ", age=" + age + "]";
	 }
	
	 
}


public class Arraylist {
public static void main(String[] args) {
	arr1 appp1=new arr1();
	appp1.Arraylist_display(appp1.array_list_implimentation());
	
	ArrayList<Student_32> stoArrayList=new ArrayList<Student_32>();
	stoArrayList.add(new Student_32("Nitin", 32));
	stoArrayList.add(new Student_32("pavna", 12));
	stoArrayList.add(new Student_32("Aakash", 92));
	stoArrayList.add(new Student_32("Vishwa", 42));
	
	for (Student_32 student_321 : stoArrayList) {
		System.out.println(student_321);
	}

	// sort by age using lambda
	System.out.println("  sort by age using lambda");
	
	stoArrayList.sort((s1, s2) -> s1.age - s2.age);
	stoArrayList.forEach(s -> System.out.println(s));
}
}
