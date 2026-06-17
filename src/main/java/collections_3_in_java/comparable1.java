package collections_3_in_java;

import java.nio.channels.NetworkChannel;
import java.util.ArrayList;
import java.util.Collections;

import com.package_np.interface1;

import opps_concepts_2.this_keyword_usage;



class student_retro implements Comparable<student_retro>{
	int id;
	String name_1;
	public student_retro(int id,String name_1) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name_1=name_1;
		
		
	}
	public int compareTo(student_retro other) {
		return this.name_1.compareTo(other.name_1);
	}
	public String toString() {
		return "the name is "+name_1+" id is "+id;
	}
	
}

public class comparable1 {
public static void main(String[] args) {
	ArrayList<student_retro> com1=new ArrayList<student_retro>();
	com1.add(new student_retro(1, "hacker"));
	com1.add(new student_retro(2,"raistar"));
	com1.add(new student_retro(3,"kai"));
	com1.add(new student_retro(3,"ketu"));
	com1.add(new student_retro(4,"Pogo"));
	Collections.sort(com1);
	com1.forEach(System.out::println);
	
	
}
}
