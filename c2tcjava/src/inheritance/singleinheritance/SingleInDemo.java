package inheritance.singleinheritance;

public class SingleInDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.show();
		System.out.println("___________________");

		Person p2 = new Person();
		p2.show();
		System.out.println("___________________");
		
		Student s1 = new Student("Amit","CI");
		s1.show();
		
	}

}
