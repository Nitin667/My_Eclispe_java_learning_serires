package opps_concepts_2;

class parent{
 private String nameString;
 private int age;
 public void setName(String name,int age) {
	 nameString=name;
	 this.age=age;
 }
 
 public void getname() {
	 System.out.println("The name and age is "+nameString+" "+age);
 }
}
//Encapsulation = Make data private + provide controlled access through methods.
//Encapsulation : Make variables private.
//Data can only be accessed through methods.
/*
 Encapsulation
      |
      +--> Data Hiding
      +--> Private Variables
      +--> Getter Methods
      +--> Setter Methods
      +--> Validation
      +--> Security
 */


public class Encapsulation_java {
public static void main(String[] args) {

	parent p1=new parent();
		p1.setName("nitin", 34);
		p1.getname();
	
	
	
}}
