package tns.day7.arrays;

import java.util.Arrays;

public class OneDimArray {

	static void showArray(int [] arr) {
		//Index based interating
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + "\t\t");
		}
	}
	
	public static void main(String[] args) {
		// Array Declaration
		int[] a;
		int b[];
		
		//Creating array
		a=new int[5];			//allocates memory for 5 integers
		
		final int SIZE=10;
		b=new int[SIZE];		//allocates memory for 10 integers
		
		System.out.println("Array a is as follows");
		showArray(a);
		
		System.out.println("Array b is as follows");
		showArray(b);
		
		int d[]= {11,20,10,215};
		Arrays.sort(d);
		System.out.println("Array d after sorting is as follows");
		showArray(d);
		
		System.out.println(Arrays.binarySearch(d, 13));
		
		//for-each interating
		for(int n:d)
			System.out.println(n);
		
		String s[]= {'Hello','Hi','Bye'};
		for(String st:s)
			System.out.println(st);
	}

}
