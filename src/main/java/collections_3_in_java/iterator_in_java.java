package collections_3_in_java;

import java.util.HashMap;
import java.util.Iterator;

import com.package_np.map_1_java;

public class iterator_in_java {
public static void main(String[] args) {
	HashMap<String,String> map_1=new HashMap<String, String>();
	map_1.put("one", "Nitin");
	map_1.put("two","Aakash");
	map_1.put("three","Vishwa");
	map_1.put("four","mani");
	
	
	/*
	 * Iterator can only go FORWARD!
cannot go backward!
cannot add elements!
cannot update elements!

	 * 
	 * ListIterator — more powerful than Iterator:
	 * */
	
	Iterator<String> it1=map_1.keySet().iterator();
	while (it1.hasNext()) {
		
		System.out.println();
//		String keyString=it1.next();
		System.out.println(map_1.get(it1.next()));
		
	}
}
}
