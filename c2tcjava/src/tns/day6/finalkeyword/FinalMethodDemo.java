package tns.day6.finalkeyword;

public class FinalMethodDemo {

	public static void main(String[] args) {
		
		FinalMethod f1 = new FinalMethod();
		f1.show();
		f1.display();
		
		Child c1=new Child();
		c1.show();
		c1.display();
		
		
		// Runtime Polymorphism/ Late Binding/ Dynamic Binding
		
		FinalMethod f2 = new Child();
		f2.show();
	}

}
