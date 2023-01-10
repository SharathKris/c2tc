package tns.day13.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(10);
		list1.add("Hello");
		list1.add(false);
		list1.add(10);
		list1.add(true);
		list1.add(50);
		list1.add("Hello");
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		System.out.println("Element 50 is present or not?" + list1.contains(50, 0));
		
		System.out.println("Index at lcoation 2 is: "+list1.get(2));
		
		System.out.println("index at 10 is: "+list1.indexOf(10));
		
		System.out.println(lsit1.remove(list1.indexOf(10))+ " is removed");
		
		System.out.println("list1");
		
		list1.remove("Hello");
		
		System.out.println(list1);
		
		Iterator it = list1.iterator();
		while(it.hasNext()) {
			Objext o=it.next();
			System.out.println(0);
		}
	}

}
