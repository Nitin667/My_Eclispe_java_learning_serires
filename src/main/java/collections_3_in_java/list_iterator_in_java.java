package collections_3_in_java;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class list_iterator_in_java {
public static void main(String[] args) {
List<String> list_it1=new ArrayList<String>();

//	List<String> a1=new Arraylist();
	list_it1.add("five");
	list_it1.add("Nitin");
	list_it1.add("Aakash");
	list_it1.add("Vishwa");
	list_it1.add("mani");
	
	/*
	 * ListIterator can:
✅ go FORWARD
✅ go BACKWARD
✅ add elements
✅ update elements
✅ get index
✅ remove elements

works ONLY with List!
not with Set or Map!
	 * */
	ListIterator<String> list1=list_it1.listIterator(list_it1.size());
	while (list1.hasPrevious()) {
		System.out.println("hehe");
		String str=list1.previous();
		
		if(str.equals("mani"))
		{System.out.println("mtches ");
			list1.remove();
		}
//		System.out.print(str+" ");
		try {
			System.out.println(list1.previous());
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("SOmething eroor comes");
		}
		
		
	}
	
}
}
