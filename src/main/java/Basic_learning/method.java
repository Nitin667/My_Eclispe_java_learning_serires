package Basic_learning;

import com.package_np.interface1;

public class method {
	String  hello(String str) {
		System.out.println("This is a method from "+str);
		return "done";
	}
	int hello(int data) {
		System.out.println("This takes integer"+data);
		return 404;
	}
	
public static void main(String[] args) {
	method m1=new method();
	System.out.println(m1.hello("Nitin")
			);
	System.out.println(m1.hello(45));
}
}
