package java_advanced_topics_5;




class function_program_try_1 {

	private int id;
	private String nameString;
	private double salary;
	public flat_map_in_java(int id,String name,double salary) {
		this.id=id;
		this.nameString=name;
		this.salary=salary;		
	}
	public int getAge() {
		return id;
	}
	public void setAge(int age) {
		this.id = age;
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nameString=" + nameString + ", salary=" + salary ;
	}


}
