package opps_concepts_2;
class hi{

	void hi1() {
		System.out.println("HI method ");
	}
}

class hello{
	void hello1() {
		System.out.println("THis is a hello method ");
	}
}
class working{
	void working1() {
		System.out.println("THis is a working method");
	}
}
public class Classes_and_objects {
public static void main(String[] args) {
	hi h1=new hi();
	hello hello1=new hello();
	working work1=new working();
	
	h1.hi1();
	hello1.hello1();
	work1.working1();
}
}
