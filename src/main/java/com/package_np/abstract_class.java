package com.package_np;

//

//FORCE child to implement methods:
//Purpose 1  → FORCE children to implement specific methods
//Purpose 2  → SHARE common code to avoid repetition
//Purpose 3  → PREVENT creating incomplete/concept objects
//

abstract class ab1{
	abstract void help(int a,int b);
	abstract void nono();
}
class ab2 extends ab1{
	void help(int a,int v) {
		System.out.println("I am acessing abstract method "+a+" "+v);
	}
	void nono() {
		System.out.println("THis is a nono method");
	}
}


public class abstract_class {
public static void main(String[] args) {
	ab2  n2=new ab2();
	n2.help(4,5);
	n2.nono();
}
}
