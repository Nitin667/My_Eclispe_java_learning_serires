package Basic_learning;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import com.package_np.interface1;

public class operators {
//arithematic operators 
	int a=30;
	int b=30;
	public static void main(String[] args) {
//		+,-,*,/,%
		int a=30;
		int b=30;
		operators p1=new operators();
		System.out.println(p1.a+p1.b);
//		post inerement  a++ and a--
//		pre increment ++a and --a
//		comparision operator 
//		> < <= >= != etc 
		System.out.println(a<b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		
//		logical operator && || !
		if (a<30 || b>3) {
			System.out.println("yess.......");
		}
		else {
			System.out.println("No.........");
		}
		
		int age = 15;

		// check NOT adult
		if(!(age >= 18)) {
		    System.out.println("Not Adult!");  // prints!
		}
		
		
		
		System.out.println("Bitwsie operator");
		int a1=5;
		int r1=13,r2=30;
		System.out.println(~14);
		System.out.println(5&4);
		System.out.println(4|7);
		System.out.println(5<<2);
//		>>This is left shift
//		>> This right shift
		System.out.println(5>>2);
		
		System.out.println("ternary");
		System.out.println(r1<r2?"yes":"no");
		
		
	}
	
	
}
