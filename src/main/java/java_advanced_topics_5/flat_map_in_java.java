package java_advanced_topics_5;

import java.security.PrivateKey;
import java.util.List;

import opps_concepts_2.this_keyword_usage;

public class flat_map_in_java {

		private int id;
		private String nameString;
		private double salary;
		private List<String> addressList;
		
		
		public flat_map_in_java(int id,String name,double salary,List<String> addressList) {
			this.id=id;
			this.nameString=name;
			this.salary=salary;		
			this.addressList=addressList;
			
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
			return "id=" + id + ", nameString=" + nameString + ", salary=" + salary +" address= "+addressList ;
		}
		public List<String> getAddressList() {
			return addressList;
		}
		public void setAddressList(List<String> addressList) {
			this.addressList = addressList;
		}


	}

