package tns.day6.Interface;

public class ChildInterfaceClass implements InterfaceOne, InterfaceTwo
{

	@Override
	public void show() {
		System.out.println("In Interface implemented method");
	}

	@Override
	public void display() {
		System.out.println("In 2nd Interface method");
	}

	public void greet(String name) {
		System.out.println("Name "+name);
	}


}
