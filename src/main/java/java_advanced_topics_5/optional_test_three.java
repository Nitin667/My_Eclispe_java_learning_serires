package java_advanced_topics_5;

import java.util.Optional;

class Emp{
	private String emailString;
	public String getEmail() {
		return emailString;
	}
	public void setEmail(String email) {
		this.emailString=email;
	}
}
class Dao{
	public Optional<Emp> getempinfo(int id) {
		Emp e=new Emp();
		e.setEmail("Nitinppraabhi46@gmail.com");
		
		return Optional.ofNullable(e);
	}
	
}



public class optional_test_three {

	public static void main(String[] args) {
	Dao d1=new Dao();
//	String emialString=d1.getempinfo(23);
	
	Optional<Emp> empInfOptional=d1.getempinfo(1);
	if(empInfOptional.map(t->t.getEmail()).isPresent())
	{
	System.out.println(empInfOptional.get().getEmail().toUpperCase());
	}
	else {
		System.out.println("Null value occured");
	}
//	System.out.println(emialString.toUpperCase());
	
	
	
	}
}
