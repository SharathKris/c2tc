package tns.day13.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	public static void  main(String args[]) {
		//unordered and unsorted map
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();
		studentMap.put(1, "Zorak");
		studentMap.put(7, "Kris");
		studentMap.put(6, "Tan");
		studentMap.put(2, "Ram");
		studentMap.put(5, "Raju");
		studentMap.put(8, "Ravi");
		studentMap.put(8, "Raj");
		studentMap.put(10, null);
		//studentMap.put(null, null);  key cannot be null but iterator shows error
		System.out.println(studentMap);
		System.out.println(studentMap.containsValue("Raj"));
		System.out.println(studentMap.containsKey(6));
		System.out.println(studentMap.entrySet());

		if(studentMap.get(5)==null) 
			System.out.println("Does not exist");
		else
			System.out.println("Name : "+studentMap.get(5));
		
		System.out.println("Student Count: "+studentMap.size());
		studentMap.replace(5, "Andrew");
		System.out.println(studentMap);
		
		Set s1 = studentMap.keySet();
		Iterator it = s1.iterator();
		Integer key;
		while(it.hasNext()) {
			key=Integer.parseInt(it.next().toString());
			System.out.println(key + " : "+studentMap.get(key));
		}
		
		
		
	}
}
