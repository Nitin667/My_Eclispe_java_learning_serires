package opps_concepts_2;


// interface 
/*
 * An Interface is a blueprint of a class that defines a contract. Any class implementing the interface must provide implementations for its abstract methods. Interfaces support abstraction, polymorphism, and multiple inheritance in Java.
 * 
 * 
 * Interface
    |
    +--> Contract
    |
    +--> Cannot create object
    |
    +--> Methods are
    |      public abstract
    |
    +--> Variables are
    |      public static final
    |
    +--> Uses implements
    |
    +--> Supports Multiple Inheritance
    |
    +--> Supports Polymorphism
    
    This single example demonstrates Interface + Abstraction + Polymorphism, which are core concepts used throughout professional Java development.
    
    Feature 	Interface	Abstract Class
Abstract Method	 ✅			✅
Method with Body	✅ (default)	✅ (normal method)
Static Method	✅				✅
Private Method	✅				✅
Constructor		  	❌     	✅
Instance Variables	❌ (constants only)	✅   (public static final String color = "Brown";)
default keyword			✅	   ❌
 * 
 * */
interface mobile{
	void camera();
	void musice();
	int age=20;
	default void hello() {
		System.out.println("thlllo hello ");
	}
}
class phon1 implements mobile{
	public void camera() {
		System.out.println("This have camera");
	}
	public void musice() {
		System.out.println("This is have musice");
	}
	void hacker() {
		System.out.println("THis is a hacker in a group");
	}
}




public class interface_in_java {
public static void main(String[] args) {
	mobile m1=new phon1();
	m1.camera();
	m1.musice();
	phon1 c1=new phon1();
	c1.hacker();
	c1.hello();
	System.out.println(c1.age);
	
}
}
