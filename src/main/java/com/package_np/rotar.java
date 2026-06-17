package com.package_np;

import java.util.Scanner;

import org.apache.catalina.tribes.group.RpcCallback;
import org.apache.catalina.tribes.util.Arrays;




public class rotar {
public String[] killer() {
	System.out.println("Aot on the top level ok u got ");
	Scanner scanner =new Scanner(System.in);
	
	int a=scanner.nextInt();
	scanner.nextLine();
	
	System.out.println(a);
	
	
	
	System.out.println("Enter the five array values");
	String arr1[]=new String[5];
	System.out.println(arr1.length);
	for (int i = 0; i <arr1.length; i++) {
	arr1[i]=scanner.nextLine();
	}
	return arr1;
	
	
}


public void arrayprint(String[] str) {
	System.out.println(str.length);
	for (int i = 0; i <str.length; i++) {
		System.out.println(str[i]);
		}
}
}
