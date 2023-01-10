package tns.day6.finalkeyword;

public class FinalVariableDemo {
	
	final static int size=10;   //we only need to initialize the memory once since it cannot be altered
	
	public static void main(String args[]) {
		FinalVariableDemo f1 = new FinalVariableDemo();
		System.out.println(f1.size);
		// f1.size=25;    final variable is a constant so we cannot reassign the values
		
		System.out.println(f1.size);

		FinalVariableDemo f2 = new FinalVariableDemo();

	}
}


/*
final keyword
define a constant

define final method - cannot override it 

Method overriding
Same name method with same signature in different scope

define final class - can't inherit
*/
