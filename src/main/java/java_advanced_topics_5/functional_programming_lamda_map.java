package java_advanced_topics_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.package_np.interface1;

public class functional_programming_lamda_map {
public static void main(String[] args) {
	List<String> strings=new ArrayList<String>();
	List<String>strings2=Arrays.asList("Nitn","ram","shayam","Mohan");
	strings2.stream().map(s->s+"191").forEach(System.out::println);;
	
	
	List<Integer> integers=Arrays.asList(12,45,23,455,677,23);
Integer a1=	integers.stream().max(Integer::compare).get();
System.out.println(a1);
Integer a2=	integers.stream().min(Integer::compare).get();
System.out.println(a2);

Integer a3=	integers.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(null);
System.out.println(a3);
System.out.println();
integers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

}
}
