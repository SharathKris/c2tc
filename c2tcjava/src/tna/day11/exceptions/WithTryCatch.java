package tna.day11.exceptions;

public class WithTryCatch {

	public static float division(int a, int b) {
		int c=0;
		try {
			c=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println("Erroroccured...."+e);
		}
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("Division is "+division(12,3));
		System.out.println("Division is "+division(12,0));
	}

}
