package tns.day13.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		//Ordered
		LinkedHashSet<String> courseSet = new LinkedHashSet<String>();
		courseSet.add("Core Java");
		courseSet.add("HTML");
		courseSet.add("React");
		courseSet.add("Python");
		courseSet.add("C++");
		courseSet.add("C#");
		courseSet.add("Angular");
		courseSet.add("NodeJS");
		System.out.println("Course Set is "+courseSet);
		
		//Collections.sort(courseSet);    hash set cannot be sorted, instead convert it into array
		
		ArrayList<String> list = new ArrayList(courseSet);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
