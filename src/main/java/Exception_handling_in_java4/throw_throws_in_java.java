package Exception_handling_in_java4;

import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.apache.jasper.tagplugins.jstl.core.If;

import com.package_np.interface1;

class add{
	void  add(int a,int b)throws ArithmeticException{
		if(b==0) {
			throw new ArithmeticException("the value of b is o ");
		}
	}
}

class Nitin_invalid_exception extends RuntimeException{
	public Nitin_invalid_exception(String message) {
		super(message);
	}
	
	
}

public class throw_throws_in_java {
public static void main(String[] args) {
	try {
		add ab1=new add();
		ab1.add(3, 0);
	}
	catch (Exception e) {
		System.out.println("there is some error in code");
	}
	

	
int age=300;
try {
if(age>18) {
	throw new Nitin_invalid_exception("In valid age  "+age);
	
}
}
catch(Nitin_invalid_exception e){
	System.out.println(e.getMessage());
}
}


}
