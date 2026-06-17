package opps_concepts_2;

import java.awt.CardLayout;

//Hide implementation details and show only essential features.
/*Think about a car.

You know:

Start Car
Stop Car
Accelerate
Brake

But you don't need to know:

How fuel is injected
How pistons move
How combustion happens


An abstract class is a class that cannot be instantiated. can not create any instance for abstract class 
abstract method does not have any body 
child class must implement it





Abstract Class
      |
      +--> Can have abstract methods
      |
      +--> Cannot create object directly
      |
      +--> Child class should implement
           abstract methods
      |
      +--> Then create child object
           and call methods
 * */


abstract class tokyo{
	abstract void toyota();
}
 abstract class get_toyota extends tokyo{ 
	void toyota1() {
		System.out.println("I am purchasing it ");
	}
}
public class abstraction_java_in4 {
public static void main(String[] args) {
	tokyo t1=new get_toyota(){
//	t1.toyota();
		
		void toyota() {
			System.out.println("I am purchasing it 3");
		}
	};	
//	get_toyota.toyota1();
	
}
}
