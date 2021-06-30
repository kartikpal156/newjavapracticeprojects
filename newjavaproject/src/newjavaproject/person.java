package newjavaproject;

public class person {
	// gloabal variable/ instance data members
	private String name;
	private int age;
	private String address;
	
	public person() {
		System.out.println("Constructor invoked ");
			this.name = "Nisha";
			this.age = 40;
			this.address ="Pune";
	}
	
	public person(String name , int age, String address) {
		this.name = name;
		this.age = age;
		this.address =address;
	
	
	}
	
	
	// setter method which allows to initialize private data member of a class
	// getter methos which allows to fetch the value of private data member of a class 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
