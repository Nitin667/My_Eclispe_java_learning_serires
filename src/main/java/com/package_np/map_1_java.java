package com.package_np;
import java.util.*;
import java.util.Map.Entry;
//import java.util.HashMap;
//import java.util.Map;

class Map_java{
//	Map<String,Integer> maps() {
//
//		Map<String, Integer> m1=new HashMap<String, Integer>();
//		m1.put("Nitin",2);
//		m1.put("ak",3);	m1.put("rad",1);	m1.put("sg",4);	m1.put("jeke",5);
//		
//		return m1;
//	}	
	TreeMap<String,Integer> maps() {

		TreeMap<String, Integer> m1=new TreeMap<String, Integer>();
		m1.put("Nitin",4);
		m1.put("aak",2);	m1.put("Rad",1);	m1.put("sg",5);	m1.put("jeke",3);
		
		return m1;
	}
}
class hi_display{
	void display(Map<String, Integer> hello)  {
		for (String str : hello.keySet()) {
			System.out.println(str);
			
		}
		for (Integer str : hello.values()) {
			System.out.println(str);
			
		}
	}
	void display(TreeMap<String, Integer> hello)  {
		int[] srt=new int[5];
		srt[0]=45;
		System.out.println(srt[0]);
//		for (String str : hello.keySet()) {
//			System.out.println(str);
//			
//		}
//		for (String str : hello.values()) {
//			System.out.println(str);
//			
//		}
//		Iterator<String> iterator=hello.keySet().iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		
//		};
		
		Iterator<Map.Entry<String,Integer>> iterator=hello.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String,Integer> ent=iterator.next();
			System.out.println(ent.getKey()+" "+ ent.getValue());
		
		};
	}
}
public class map_1_java {
public static void main(String[] args) {
	Map_java m3=new Map_java();
	hi_display hoiDisplay=new hi_display();
	hoiDisplay.display(m3.maps());
	
	System.out.println("This is a tree map");
hoiDisplay.display(m3.maps());
System.out.println(m3.maps());
}
}
