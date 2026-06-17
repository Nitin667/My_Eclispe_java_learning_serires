package com.package_np;

interface animalS{
	void sound();
	void color();
}
interface bird{
	void fly();
}

class dog1 implements animalS,bird{
	public void sound(){
		System.out.println("Bow bow");
	}
	public  void color() {
		System.out.println("THis is a color");
	}
	public void fly() {
		System.out.println("bird flys");
	}
}
public class interface1 {
	
	public static void main(String[] args) {
		dog1 a1=new dog1();
		
		a1.sound();
		a1.fly();
	}

}
