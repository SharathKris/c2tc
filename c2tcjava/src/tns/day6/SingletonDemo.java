package tns.day6;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m1 = MyClass.getMyClass("Tan");
		m1.show();
		
		MyClass m2 = MyClass.getMyClass("Kris");
		m2.show();
		
		//singleton
		System.out.println("----------------");
		MyClass1 m3 = MyClass1.getObject("Buu");
		m3.show();
		
		MyClass1 m4 = MyClass1.getObject("HI");
		m4.show();
		
		System.out.println("----------------");
		m3.show();
		m4.show();
	}

}
