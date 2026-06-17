package com.package_np;

class Box<T>{
	T value;
	void set(T data) {
		this.value=data;
	}
	T get() {
		return value;
	}
}
class printer{
	static <T> void raistr(T data) {
		System.out.println(data);
	}
}


public class generics {
public static void main(String[] args) {
	Box<String> b1=new Box<>();
	b1.set("Hi its me Nitin");
	Box<Integer> b2=new Box<>();
	b2.set(34);
	System.out.println(b1.get());
	System.out.println(b2.get());
	printer.raistr("the cnage is very important in life");
	printer.raistr(455);
}
}
