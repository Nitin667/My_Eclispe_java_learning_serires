package opps_concepts_2;

import java.util.Objects;

class dog_1{
	String nameString="tommy";
public	String toString() {
		System.out.println("The dog name is "+nameString);
		return nameString;
	}
}

class cat_1{
	void cat_hi() {
		System.out.println("This is a cat");
	}
}
class Eqy{
	 int id;	
	    String name;

	    Eqy(int id, String name) {
	        this.id   = id;
	        this.name = name;
	    }

		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}

//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Eqy other = (Eqy) obj;
//			return id == other.id && Objects.equals(name, other.name);
//		}
	
//	 public boolean equals(Object obj) {
//	        // step 1 — cast Object to Student
//	        Eqy s = (Eqy) obj;
//
//	        // step 2 — compare id
//	        return name == s.name;
//	    }
}

public class object_class_methods {
	
	
	
//	Important Object Class Methods
//	toString() :Converts an object into a string representation.
//	equals()
//	hashCode()
//	getClass()
//	clone()
//	finalize()
//	wait()
//	notify()
//	notifyAll()
	
	public static void main(String[] args) {
		dog_1 d1=new dog_1();
		System.out.println(d1); // output:opps_concepts_2.dog_1@24d46ca6 , interaly java will do this System.out.println(d.toString());
		
//		default implimetation is this getClass().getName() + "@" + Integer.toHexString(hashCode())
		
		
		
		Eqy evEqy=new Eqy(12, "Nitin");
		Eqy evEqy2=new Eqy(12, "Nitin");
		Eqy evEqy3=new Eqy(14, "Nitin");
		System.out.println(evEqy2.equals(evEqy3));
		cat_1 xpCat_1=new cat_1();
		Object v=xpCat_1;
		
		
		
	}
	
	
	
}
