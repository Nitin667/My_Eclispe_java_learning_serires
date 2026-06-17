package opps_concepts_2;


class hacker{
	String nameString="Nitin";
	hacker display() {
		return this;
	}
}

public class this_keyword_usage {
//	The this keyword refers to the current object.
	
//	Whenever an object calls a method or constructor, Java automatically passes a hidden reference of that object. That reference is called this
	
	
	
	
	public static void main(String[] args) {
		hacker h1=new hacker();
		
	System.out.println(h1.display());
		
		
	}
}
