package java_advanced_topics_5;

interface hello{
	void sound();
}
/*
 What is a Lambda Expression?

A short way to implement a functional interface.

What is a Functional Interface?

An interface containing exactly one abstract method.


Which Java Version Introduced Lambda?
Java 8

syntax

(parameters) -> {
    statements
}
*
*/

public class lambda_in_java {
public static void main(String[] args) {
	hello h=()->{
		System.out.println("THis is lambda expression");
	};
	h.sound();
}
}
