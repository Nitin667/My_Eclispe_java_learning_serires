package opps_concepts_2;


class Animal{
	void sound() {
		System.out.println("The animal makes sound");
	}
}
	
	class cat extends Animal{
		void sound() {
			System.out.println("Cats makes meow meow");
		}
	}
	
	class dog extends Animal{
		void sound(){
			System.out.println("Dog makes bow bow");
		}
	}

public class ploymorphism_in_java {
	
//	In Java, polymorphism allows the same method name to behave differently in different situations.
	
//This flexibility is why polymorphism is heavily used in frameworks, collections, GUI programming, Spring, Hibernate, and many real-world Java applications.
	/*
	 * Runtime Polymorphism
=
Inheritance
+
Method Overriding
+
Parent Reference
+
Child Object

This single line is one of the most important concepts in Java OOP and is used throughout professional Java development, frameworks, and enterprise applications.
	 * */
	
public static void main(String[] args) {
//	Animal animal11;
//	animal11=new cat();
//	animal11.sound();
//	
//	animal11=new dog();
//	animal11.sound();
	Animal a11=new dog();
	a11.sound();
	a11=new cat();
	a11.sound();
	
}

}
