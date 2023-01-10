package tns.day6.finalkeyword;

public class FinalMethod {
	
	public void show() {
		System.out.println("Hello");
	}
	
	public final void display()
	{
		System.err.println("Final Method");
	}
	
}
class Child extends FinalMethod
{	@Override
	public void show() {
		System.out.println("Hello,Go");
	}
	
	//Final method cannot be overridden
	//public void display(){
	//System.err.println("Final override Method");
	//}
}
