package opps_concepts_2;
class jai{
	static int age=30;
	int year=203;
	static void run() {
		System.out.println("THis is running");
	}
	
	static {
//		System.out.println("This is a block "+year); error because Cannot Directly Access Instance Variables
		jai t1=new jai();
		System.out.println("This is a "+t1.year);
		
	}
	
	void take() {
		System.out.println(year);
	}
}


//public static void main(String[] args)
//Because JVM calls it directly.
//static 
//1. Variables
//2. Methods
//3. Blocks
//4. Nested Classes
//Can Non-Static Methods Access Static Members?
//yes Because objects can access class members.

//Static nested class 


class outer{
	static  class inner{
		void show() {
			System.out.println("printer");
		}
	}
}




public class static_variables_method {
public static void main(String[] args) {
	System.out.println(jai.age);
//	System.out.println(.year);
jai.run();
jai j1=new jai();
j1.take();


outer.inner obj=new outer.inner();
obj.show();
}
}
