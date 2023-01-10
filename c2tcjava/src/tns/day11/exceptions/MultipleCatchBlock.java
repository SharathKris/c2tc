package tns.day11.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void division() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		
		a=sc.nextInt();
		b=sc.nextInt();
		try
		{
			c=a/b;
			System.out.println("Division is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error occured.."+e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Error occured.."+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Error occured.."+e.getMessage());
		}
	}
	
	public static void main(String args[]) {
		division();
		System.out.println("__________________________________");
	}

}
