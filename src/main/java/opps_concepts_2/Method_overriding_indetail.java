package opps_concepts_2;


// Method overriding 
/* Method Overriding occurs when a child class provides its own implementation of a method that already exists in the parent class.
 
 Method Overriding is a feature in which a child class provides its own implementation of a method already defined in the parent class using the same method signature, enabling runtime polymorphism.
 
 
 
 Overloading vs Overriding
Method Overloading	Method Overriding
Same class usually	Parent and child class
Same method name	Same method name
Different parameters	Same parameters
Compile-time polymorphism	Runtime polymorphism
Inheritance not required	Inheritance required
 *
 **/

class Animal1 {

    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog1 extends Animal {

    void sound() {
        System.out.println("Dog Bark");
    }
}


public class Method_overriding_indetail {
public static void main(String[] args) {
	
	
	Dog1 animal1=new Dog1();
	animal1.sound();
}
}
