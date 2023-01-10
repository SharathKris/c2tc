package tns.day13.collections.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//unordered and cannot be sorted 
		HashSet<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(10);
		numberSet.add(50);
		numberSet.add(200);
		numberSet.add(100);
		numberSet.add(250);
		numberSet.add(null);
	
		System.out.println(numberSet.add(180));
		System.out.println(numberSet.add(180));  // return type of HashFunction is boolean
		System.out.println("Number Set is "+ numberSet);
		
		
		HashSet<Integer> numberSet1 = new HashSet<Integer>();
		numberSet1.add(100);
		numberSet1.add(505);
		numberSet1.add(210);
		numberSet1.add(10);
		numberSet1.add(255);
	
		System.out.println("Number Set is "+ numberSet1);
		
		HashSet<Integer>dummyset = numberSet1;
		
		//SET Difference (numberSet1 - numberSet)
		numberSet1.removeAll(numberSet);			//set difference is applied
		System.out.println("Number Set removeAll is "+ numberSet1);
		
		//SET Intersection (numberSet1 Intersection numberSet)
		numberSet1 = dummyset;
		numberSet1.retainAll(numberSet);			//set difference is applied
		System.out.println("Number Set reatainAll is  "+ numberSet1);
		
		//SET Union
		numberSet1 = dummyset;
		numberSet1.addAll(numberSet);			//set difference is applied
		System.out.println("Number Set addAll is "+ numberSet1);
		
	}
}
