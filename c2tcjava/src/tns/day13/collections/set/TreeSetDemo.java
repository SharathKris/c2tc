package tns.day13.collections.set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		//sorted set
		TreeSet<Integer> numberSet = new TreeSet<Integer>();
		numberSet.add(50);
		numberSet.add(40);
		numberSet.add(30);
		numberSet.add(80);
		numberSet.add(90);
		numberSet.add(45);
		System.out.println(numberSet);

		//numberSet.add("Hello");   Only integers  compile time error
		
		//numberSet.add(null);    //Runtime error

	}

}
