package java_advanced_topics_5;


class Box<T extends String>{
	T value;
	
	void setvalue(T value) {
		this.value=value;
	}
	
	T getvalue() {
		return value;
	}
//	void ge
}
class box1{
	<T> void print(T value){
		System.out.println( value);
		
	}
	
//	 return inning a value using generics
	<T> T return_value(T value) {
		return value;
	}
	
}

// generics interface 

interface Printer_interface<T> {

    void print(T data);
}

class child_printer implements Printer_interface<String>{
	public void print(String data) {
		System.out.println(data);
	}
	
}
/*
 * Why Generics?
Type safety
Reusability
No casting

Generics allow you to write one class, method, or interface that can work with different data types while maintaining compile-time type safety.
 * */

public class generics_in_java {
public static void main(String[] args) {
	Box<String> b1=new Box<>();
	b1.setvalue("Nitin");
	String a1=b1.getvalue();
	System.out.println(a1);
//	Box<Integer> b2=new Box<>();
//	b2.setvalue(45);
//	int a2=b2.getvalue();
//	System.out.println(a1+ " "+a2);
	
	box1 b3=new box1();
	b3.print("hHello  my name it Nitin");
	b3.print(45);
	System.out.println(b3.return_value(40000));
	
	child_printer c1=new child_printer();
	c1.print("hello");
	
	
}
}
