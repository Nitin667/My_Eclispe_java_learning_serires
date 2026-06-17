package Basic_learning;

import com.package_np.interface1;

public class conditional_java {
public static void main(String[] args) {
//	if,if else ,nested if,switch
	int a=30,b=40;
	int age=28;
	if(a<b) {
		System.out.println("yes");
		if (a>b) {
			System.out.println("what");
		}
	}
	if(age<10) {
		System.out.println("yes 1");
	}
	if (age<40) {
		System.out.println("yes 2");
	}
	 if (age<50) {
		System.out.println("yes 3");
	}
	else {
		System.out.println("age is greater");
	}
	
	 String data="by";
	switch (data) {
	case "hi":
		System.out.println("hi");
		break;
	case "hello":
		System.out.println("hello");
		break;
		
	case "by":
		System.out.println("by");
		break;
	default:
		System.out.println("noen of the abotut");
		break;
	}
}
}
