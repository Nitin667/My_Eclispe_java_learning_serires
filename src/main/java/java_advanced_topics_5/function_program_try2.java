package java_advanced_topics_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import java_advanced_topics_5.function_program_try_1;
//import opps_concepts_2.static_variables_method;import sun.security.krb5.internal.crypto.Aes128CtsHmacSha1EType;

public class function_program_try2 {
	
	private static List<function_program_try_1> empess=null;
	static {
		
		/*Yes, static blocks and static variables are initialized automatically when the class is loaded, before main() executes*/
		function_program_try_1 emp1=new function_program_try_1(1,"Nitin",40000.45);
		function_program_try_1 emp2=new function_program_try_1(2,"ram",89000.45);
		function_program_try_1 emp3=new function_program_try_1(3,"shayam",90000.45);
		function_program_try_1 emp4=new function_program_try_1(4,"mohan",30000.45);
		function_program_try_1 emp5=new function_program_try_1(5,"Aakash",23523.45);
		function_program_try_1 emp6=new function_program_try_1(6,"mani",3849.45);
		empess=List.of(emp1,emp2,emp3,emp4,emp5,emp6);
	}
	
	
public static void main(String[] args) {
//	System.out.println(empess);
			List<Double> collect1 = empess.stream().filter(t->t.getSalary()>40000).map(e->e.getSalary()).collect(Collectors.toList());
			
			List<String> strings=empess.stream().map(t->t.getNameString().toUpperCase()).collect(Collectors.toList());
			
			String string2 = empess.stream().map(t->t.getNameString()).reduce((t, u) ->t+" "+u).get();
//			using reduce 
			 Double double11 = empess.stream().map(t->t.getSalary()).reduce((t, u) ->t+u).get();
			 Double double2 = empess.stream().map(t->t.getSalary()).reduce(Double::sum).get();
			 

		function_program_try_1 hoi=	empess.stream().max(Comparator.comparing(function_program_try_1::getSalary)).get();
			 
		function_program_try_1 hoi1=	
				empess.stream()
				.min(Comparator.comparing(function_program_try_1::getSalary)).get();
			 
		
		List<function_program_try_1> collect_name = empess.stream()
				.sorted(Comparator.comparing(function_program_try_1::getNameString)).collect(Collectors.toList());
//		limit and skip 
		List<function_program_try_1> collect1_limit = empess.stream().skip(2).limit(2).collect(Collectors.toList());
		System.out.println(collect1_limit);
		System.out.println("limit");
System.out.println(collect1);
System.out.println(string2);
System.out.println(double11);
System.out.println(double2);
System.out.println("hiioie");
System.out.println(hoi);
System.out.println(hoi1);
System.out.println(collect_name);















}
}
