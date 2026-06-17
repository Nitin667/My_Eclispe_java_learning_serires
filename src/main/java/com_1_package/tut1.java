package com_1_package;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class tut1{
	
	
	public static void main(String[] args) {
//		boolean  a=true;
//		Scanner scanner=new Scanner(System.in);
//		String strin=scanner.nextLine();
//		System.out.println(strin);
//		System.out.println(a);
//		System.out.println(!a);
//		int a=30;
//		System.out.println(a>70);
//		System.out.println(a>20);
//		
//		String s1="Hello";
//		String s2="Hello";
//		String s3=new String("Hello");
//		System.out.println(s1.equals(s3)+"\'");
//		
//		int a=(int)((100-90+1)*Math.random()+90);
//		
//		System.out.println(a);
//		
//		
//		int values[]= {10,3,4,5};
//		try {
//			System.out.println(values[3]);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("error"+e);
//		}
//		try {
//			System.out.println(values[75]);
//		} 
//		catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		
//		finally {
//			// TODO: handle finally clause
//			System.out.println("error occured");
//		}
		
		
		ArrayList<String> carStrings=new ArrayList<String>();
		carStrings.add("Volvo");
		carStrings.add("BMW");
		carStrings.add("Ford");
		carStrings.add("Hyundai");
		System.out.println(carStrings.size());
		for (int i = 0; i < carStrings.size(); i++) {
			System.out.println(carStrings.get(i));
		}
		Collections.sort(carStrings);
		System.out.println(carStrings);
	for (String string : carStrings) {
		System.out.println(string);
	}
	System.out.println(carStrings.contains("Ford"));
	
	
	addition addition=new addition();
	addition.add(3,4);
	userinput u1=new userinput();
	String data_str=u1.get_input("this is a tutorial one ");
	System.out.println(data_str);
	}
}