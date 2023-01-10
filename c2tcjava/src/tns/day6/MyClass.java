package tns.day6;

public class MyClass {
	private String name;
	
	private MyClass(String name) {    // private constructor cannot be used from other class
		this.name=name;
	}
	
	public static MyClass getMyClass(String name)   //Factory Method 
	{
		return new MyClass(name);				//return type of the method is MyClass because it returns an object of type class
	}
	
	public void show() {
		System.out.println("Name is "+name);
	}
}

