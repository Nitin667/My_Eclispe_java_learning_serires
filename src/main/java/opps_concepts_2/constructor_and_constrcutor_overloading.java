package opps_concepts_2;

import com.package_np.interface1;



/*
✅ Constructor name must be same as class name.
✅ Constructor has no return type.
✅ Called automatically when object is created.
✅ Used to initialize objects.
✅ Java provides a default constructor only if you don't write any constructor.
✅ Multiple constructors with different parameters = Constructor Overloading.
✅ this() is used for constructor chaining.
✅ Constructors cannot be inherited.
 
 */

class eran{
	 eran() {
		// TODO Auto-generated constructor stub
		 System.out.println("this is a contructor");
	}
	 eran(String str){
		 this();
		 System.out.println("THis taks a string"+str);
		 
	 }
	 eran(int data,int age){
		 this(String.valueOf(age));
		 System.out.println("THis is a data and age"+data+" "+age);
	 }
}
public class constructor_and_constrcutor_overloading {
	public static void main(String[] args) {
//		eran e1=new eran();
		eran e2=new eran(23,12);
	}
}
