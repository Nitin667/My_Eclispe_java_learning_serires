package collections_3_in_java;

import java.util.ArrayList;

import java.util.Collections;

import opps_concepts_2.this_keyword_usage;







class child_student implements Comparable<child_student>{
	int id;
	String nameString;
	 child_student(int id,String nameString) {
		// TODO Auto-generated constructor stub
		 this.id=id;
		 this.nameString=nameString;
	}
public int  compareTo(child_student other) {
	return this.id-other.id;
}
	
	 public String toString() {
		 return "The id is "+id+" Name is "+nameString;
	 }
	 
//	 class sortbyid
}


/*
 * 
 * compareTo() is ONE method!
you can only define ONE sorting logic!
today sort by id → tomorrow also id!
CANNOT change! ❌


ERROR: duplicate method!
cannot have two compareTo()!
Comparable only allows ONE! ❌


where ha compartator can have Comparator — MULTIPLE sorting ways:
each class has its OWN compare()!
no conflict!
unlimited sorting ways! ✅

Comparable = your FIXED home address
             always same! cannot change!

Comparator = GOOGLE MAPS
             search by distance    ✅
             search by rating      ✅
             search by price       ✅
             switch anytime!       ✅
             
             
             
             Comparable:
→ ONE compareTo() method
→ ONE sorting way only
→ FIXED forever
→ cannot sort by id AND name AND age!

Comparator:
→ separate class for each sorting
→ MULTIPLE sorting ways
→ switch anytime!
→ sort by id ✅ name ✅ age ✅ anything ✅

Comparable CANNOT do multiple sorting!
Comparator CAN do multiple sorting! ✅
 * */

public class comparable_comprator_in_java {
	
public static void main(String[] args) {
	
	ArrayList<child_student> arr_1=new ArrayList<child_student>();
	arr_1.add(new child_student(10,"Nitin"));
	arr_1.add(new child_student(2,"ram"));
	arr_1.add(new child_student(3,"mohan"));
	arr_1.add(new child_student(5,"ankith"));
	arr_1.add(new child_student(8,"keshav"));
	arr_1.add(new child_student(9,"ganpathi"));
	arr_1.add(new child_student(1,"ganpathi"));
	
	arr_1.forEach(System.out::println);
	Collections.sort(arr_1);
	System.out.println("After sorting");
	
	arr_1.forEach(System.out::println);
	
}
}
