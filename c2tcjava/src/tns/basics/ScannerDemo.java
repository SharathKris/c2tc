package tns.basics;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter number: ");
		a=sc.nextInt();
		System.out.println("Number entered: "+a);
		
		String s;
		System.out.println("Enter name: ");
		s=sc.nextLine();
		System.out.println("Entered name: "+s);
		sc.close();
	}

}
