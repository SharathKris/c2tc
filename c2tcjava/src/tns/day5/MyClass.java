package tns.day5;

public class MyClass {
	
	int srNo;		//instance variable
	static int cnt;	//class variable
	
	MyClass(){
		System.out.println("constructor");
		this.srNo++;
		cnt++;
	}
	
	 static {
		System.out.println("_______");
	}
	 
	public void show(){
		System.out.println("Serial No "+srNo);			//srNo is instance variable for every instance there is a new 

	}
	
	static void display() {
		System.out.println("Count "+cnt);			//count is static so has only one instance 
		//System.out.println("srNO "+srNo);
	}

}
