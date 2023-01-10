package tns.day13.collections.map;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		// sorted on key
		TreeMap<Integer, String> studentMap = new TreeMap<Integer, String>();
		studentMap.put(1, "Zorak");
		studentMap.put(7, "Kris");
		studentMap.put(6, "Tan");
		studentMap.put(2, "Ram");
		studentMap.put(5, "Raju");
		studentMap.put(8, "Ravi");
		studentMap.put(8, "Raj");
		studentMap.put(10, null);
		
		//studentMap.put(null, null);  key cannot be null


		System.out.println(studentMap);
	}

}
