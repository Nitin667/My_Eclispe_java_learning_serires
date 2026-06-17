package com_1_package;



class hi{
	void bye() {
		System.out.println("Bye guys");
	}
}


class userinput{
	String get_input(String str) {
		
		str=str+" hello this is a string";
		return str;
		
	}
}

class addition{
	void add(int a,int b) {
		System.out.println("THe value "+ (a+b));
	}
}

public class tut2 {
	public static void main(String[] args) {
		
		
		System.out.println("Hello");
//		tut2 n1=new tut2();
		Np n3=new Np();
		n3.hello();
		hi h1=new hi();
		h1.bye();
		
		userinput userinput =new userinput();
		String anbString=userinput.get_input("Nitin is a ");
		System.out.println(anbString);
	}

}
