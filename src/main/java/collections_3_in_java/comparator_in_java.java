package collections_3_in_java;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.package_np.interface1;

import opps_concepts_2.class_clone_in_java;



class studo{
	int id;
	String name;
	int age;
	studo(int id,String name,int age) {
	this.id=id;
	this.age=age;
	this.name=name;
} 
	
	
	public String toString() {
		return "the name is "+name+" the age "+age+" the id is "+id;
	}
}
class name1 implements Comparator<studo> {
		

		@Override
		public int compare(studo o1, studo o2) {
			
			return o1.name.compareTo(o2.name);
		}
	}

public class comparator_in_java {
public static void main(String[] args) {
	ArrayList<studo>compar1=new ArrayList<studo>();
	compar1.add(new studo(1, "Nitin", 23));
	compar1.add(new studo(2, "ram", 223));
	compar1.add(new studo(3, "ganesh", 63));
	compar1.add(new studo(4, "the", 73));
	compar1.add(new studo(4, "with", 93));
	
	Collections.sort(compar1,new name1());
	compar1.forEach(System.out::println);
}
}
