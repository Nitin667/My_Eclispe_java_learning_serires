package Exception_handling_in_java4;

import com.package_np.interface1;

/*
 * Exception = something goes WRONG
            during program running!
 
 
 
Like:
divide by zero        → error!
access null object    → error!
wrong array index     → error!
file not found        → error!


  */

public class exp1_in_java {
public static void main(String[] args) {
	
	try {
		int number=10/0;
		System.out.println(number);
		   int[] arr = new int[3];
		    arr[10] = 5;          
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println("can not divide this number");
	}
	
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("can not divide this number 2");
	}
	finally {
		System.out.println("This will run all the time ");
	}
	
}
}
