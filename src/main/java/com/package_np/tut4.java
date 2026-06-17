package com.package_np;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class tut4{

	    // ✅ accepts ANY List - ArrayList or LinkedList
	    public static void printAll(List<String> list) {
	        System.out.println("Elements:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(i + " → " + list.get(i));
	        }
	    }

	    public static void main(String[] args) {

	        // ✅ Using List on left side - flexible!
	        List<String> list = new ArrayList<>();

	        // adding elements
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        System.out.println("=== Using ArrayList ===");
	        System.out.println("Type: " + list.getClass().getSimpleName());
	        printAll(list);

	        // ✅ Just change this ONE LINE to switch to LinkedList!
	        list = new LinkedList<>(list);  // carries all existing data too!

	        System.out.println("\n=== Switched to LinkedList ===");
	        System.out.println("Type: " + list.getClass().getSimpleName());
	        printAll(list);

	        // adding in middle
	        list.add(2, "NEW FRUIT");
	        System.out.println("\n=== After adding in middle ===");
	        
	        printAll(list);
	        System.out.println("This is a Nitin array list ");
	        list=new ArrayList<>(list);
	        list.add("Nitin");
	        printAll(list);
	        
	        list=new LinkedList<>(list);
	    
	}

}

