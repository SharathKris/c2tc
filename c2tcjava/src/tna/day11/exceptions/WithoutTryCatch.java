package tna.day11.exceptions;

public class WithoutTryCatch {

	public static float division(float a, float b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		System.out.println("Division "+ division(12.5f,2f));
		System.out.println("Division "+ division(12.5f,0f));
	}

}
