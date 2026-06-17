package com.package_np;
class A{
	void show() {
		System.out.println("hi A");
	}
	void showc() {};
}
class b extends A{
	void show() {
		System.out.println("hi B");
	}
	void showb() {
		System.out.println("hi b");
	}
}
class C extends b{
	void show() {
		System.out.println("hi C");
	}
	void showc() {
		System.out.println("hi A");
	}
}
public class inheritance {
public static void main(String[] args) {
	C obj1=new C();
	
	obj1.show();
	obj1.showb();
	obj1.showc();
//	obj1.showc();
}
}
