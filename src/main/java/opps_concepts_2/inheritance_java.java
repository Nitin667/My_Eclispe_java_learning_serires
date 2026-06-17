package opps_concepts_2;



/*     What is Inheritance?

Inheritance is a mechanism where one class acquires the properties and methods of another class.

In simple words:

A child class can reuse the variables and methods of a parent class

✅ extends is used for inheritance.

✅ Child class gets parent variables and methods.

✅ Constructors are NOT inherited.

✅ Parent constructor executes before child constructor.

✅ super refers to parent class.

✅ Java supports:

Single Inheritance
Multilevel Inheritance
Hierarchical Inheritance

Parent Variable	Accessible in Child?
private	❌ No
default (same package)	✅ Yes
protected	✅ Yes
public	✅ Yes

*/
class Animal{
	String string="lions";
	void sound() {
		String string="lions";
		System.out.println("Animal make sound");
	}
}
class Dog extends Animal{
	void sound(){
		
//		super Keywords  refers to the parent 
		String string="hello";
		super.string="hoiii";
		System.out.println("THis is a animal "+super.string);
		System.out.println("This is bow bow");
	}
	
	
}
class monkey extends Animal{
	void sound() {
		System.out.println("This is  mow mow ");
	}
	
}


public class inheritance_java {
public static void main(String[] args) {
	Dog d1=new Dog();
	d1.sound();
}
}
