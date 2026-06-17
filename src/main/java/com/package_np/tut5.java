package com.package_np;


import java.util.*;

//import sun.jvm.hotspot.opto.HaltNode;

public class tut5 {
	
	public static void display(List <String>list1) {
		for (int i = 0; i <list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}
	public static void displayhas(HashSet<String>list1) {
		for (String string : list1) {
			System.out.println(string);
		}
	}
public static void main(String[] args) {
	System.out.println("This is my list ");
	List<String> l1=new ArrayList<>();
	l1.add("Nitin");
	l1.add("Hello");
	display(l1);
	
	l1=new LinkedList<String>(l1);
	l1.add("Linkedlist");
	display(l1);
	
	
	System.out.println("THe set ");
	HashSet<String> ha1=new HashSet<String>();
	ha1.add("Thi is a hashset");
	ha1.add("Thi is a hashset");
	ha1.add("Thi is a hashst");
	ha1.add("vvl");
//	ha1.remove("vvl");
	Iterator<String> it = ha1.iterator();
	while (it.hasNext()) {
		String string=it.next();
		if(string=="Thi is a hashst")
		{
			it.remove();
		}
		
		
		
	}
	displayhas(ha1);
}
}
