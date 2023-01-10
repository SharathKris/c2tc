package inheritance.singleinheritance;

public class Student extends Person {
	String clas;
	float per;
	public Student(String clas, float per) {
		super();
		this.clas = clas;
		this.per = per;
	}
	public Student() {
		System.out.println("Student class Default Constructor");
	}
	
	public void show() {
		System.out.println("Class: "+ clas + "\t Percentage " +per);
	}
}
