package tna.day11.exceptions;

public class UsingFinally {

	public static void show(int a[]) {
		int i,sum=0;
		
		try {
		for( i=0; i<a.length; i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		//System.exit(0);   // if this code runs the program exits and no further code is executed
		System.out.println(a[i]);
		
		}
		
		catch(Exception e) {
			System.out.println("Exception "+e.getMessage());
		}
		
		finally {
			System.out.println("Finally");
		}
	}
	
	
	public static void main(String[] args) {
		int a[]= {10,20,30};
		show(a);
		System.out.println("DONE!");
	}
}
