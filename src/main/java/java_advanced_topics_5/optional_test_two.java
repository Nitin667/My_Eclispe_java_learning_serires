package java_advanced_topics_5;

import java.util.Optional;

public class optional_test_two {
public static void main(String[] args) {
	Optional<String> of = Optional.of("hello ");
	System.out.println(of.get());
	System.out.println(of.isPresent());
	System.out.println(of.isEmpty());
	System.out.println(of.orElse("hello1"));
	System.out.println(of.orElseThrow());
	Optional<Object> empty = Optional.empty();

	Optional<Object> ofNullable = Optional.ofNullable(null);  
	System.out.println(ofNullable.get());
	System.out.println(ofNullable.isPresent());
}
}
