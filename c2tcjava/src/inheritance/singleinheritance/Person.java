package inheritance.singleinheritance;

public class Person {
	String name;
	String city;
	
	public Person() {
		System.out.println("Person class Default Constructor");
		name = "kris";
		city = "goa";
	}

	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public void show() {
		System.out.println("Name: "+name+"\t City "+city);
	}
}
