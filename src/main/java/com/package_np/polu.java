package com.package_np;

import java.util.Iterator;
import java.util.Scanner;

class Animal {
void sound() {
	System.out.println("ANimal barks");
}
}

 class dog extends Animal{
	void sound() {
		System.out.println("dog barks");
	}
	
}

 class cat extends Animal{
	
	void sound() {
		System.out.println("cat barks");
	}
}
public class polu{
public static void main(String[] args) {
//	polu p1=new polu();
Animal[] a1=new Animal[4];

a1[0]=new dog();
a1[1]=new cat();
a1[2]=new dog();
a1[3]=new Animal();

	for (Animal a : a1) {
		a.sound();
		
	}
//	 a1[0]=new dog();
	
	Scanner[] scanner=new Scanner[2];
	
	scanner[0]=new Scanner(System.in);
	 
	scanner[1]=new Scanner(System.in);
	int age=0;
for (Scanner scanner2 : scanner) {
	 age=scanner2.nextInt();
}
System.out.println(age);
}
}