package com.package_np;

interface inter{
public void sound();  //only one method in interface is called functional interface 
//public void sound2();

}

public class interface2{
	public static void main(String[] args) {
//		inter n1=new inter() {
//			
//			@Override
//			public void sound() {
//				// TODO Auto-generated method stub
//				System.out.println("hi this a anonymous class");
//			}
//		};
		
//		using lamda expression 
		inter n1=()->System.out.println("THis is a lamda expression");
		n1.sound();
	}
}
