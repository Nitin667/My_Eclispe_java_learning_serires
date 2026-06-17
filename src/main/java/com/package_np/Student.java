package com.package_np;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

class Student {
String nameString;
int age;

public Student(int age,String nameString) {
	// TODO Auto-generated constructor stub
	this.age=age;
	this.nameString=nameString;
}
void show() {
	printstring(this);
}
    
void printstring(Student s) {
	System.out.println("the name "+s.nameString+" the age "+s.age);
	
}

public static void main(String[] args) {
	Student s3=new Student(23, "Nitin Prabhu");
	s3.show();
}
}
