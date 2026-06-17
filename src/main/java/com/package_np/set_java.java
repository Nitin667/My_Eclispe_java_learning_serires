package com.package_np;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.sun.source.tree.Tree;

class set_1{
	Set<String> hashset() {
		Set<String> s1=new HashSet<>();
		s1.add("hello");
		s1.add("show");
		return s1;
	}
	TreeSet<String> treeSet1(){
		TreeSet<String> t1=new TreeSet<String>();
		t1.add("two");
		t1.add("one");
		t1.add("three");
		t1.add("apple");
		return t1;
	}
	LinkedHashSet<String> linkedhas1(){
		LinkedHashSet<String> t1=new LinkedHashSet<>();
		t1.add("two1");
		t1.add("one2");
		t1.add("three3");
		t1.add("apple4");
		return t1;
	}
	
	
}




class dp{
	void display(Set<String> s1) {
		for (String string : s1) {
			System.out.println(string);
		}
	}
		
		void display(TreeSet<String> s2) {
			for (String string : s2) {
				System.out.println(string);
			}
	}
		
		void display(LinkedHashSet<String> s3) {
			for (String string : s3) {
				System.out.println(string);
			}
		}
}

public class set_java {
public static void main(String[] args) {
	set_1 hoSet_1=new set_1();
	set_1 trSet_1=new set_1();
	
	dp d1=new dp();
	d1.display(hoSet_1.hashset());
	System.out.println();
	d1.display(trSet_1.treeSet1());
	d1.display(trSet_1.linkedhas1());
}
}
