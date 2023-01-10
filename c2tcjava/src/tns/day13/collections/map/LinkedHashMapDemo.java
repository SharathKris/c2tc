package tns.day13.collections.map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//ordered
		LinkedHashMap<Integer, String> studentMap = new LinkedHashMap<Integer, String>();
		studentMap.put(1, "Zorak");
		studentMap.put(7, "Kris");
		studentMap.put(6, "Tan");
		studentMap.put(2, "Ram");
		studentMap.put(5, "Raju");
		studentMap.put(8, "Ravi");
		studentMap.put(8, "Raj");
		System.out.println(studentMap);

	}

}
