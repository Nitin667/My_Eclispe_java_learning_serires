package java_advanced_topics_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class flat_map_2 {
	private static List<flat_map_in_java> empess1=null;
	private static List<String> address_flat=List.of("goa","benagaluer","sirsit","karwar","hulekal","vaanalli");
	static {
		
		/*Yes, static blocks and static variables are initialized automatically when the class is loaded, before main() executes*/
		flat_map_in_java emp1=new flat_map_in_java(1,"Nitin",40000.45,address_flat);
		flat_map_in_java emp2=new flat_map_in_java(2,"ram",89000.45,address_flat);
		flat_map_in_java emp3=new flat_map_in_java(3,"shayam",90000.45,address_flat);
		flat_map_in_java emp4=new flat_map_in_java(4,"mohan",30000.45,address_flat);
		flat_map_in_java emp5=new flat_map_in_java(5,"Aakash",23523.45,address_flat);
		flat_map_in_java emp6=new flat_map_in_java(6,"mani",3849.45,address_flat);
		empess1=List.of(emp1,emp2,emp3,emp4,emp5,emp6);
	}
	public static void main(String[] args) {
		empess1.stream().flatMap(t->t.getAddressList().stream()).forEach(System.out::println);
	}
}
