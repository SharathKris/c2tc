package tns.day13.collections.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> nameList = new LinkedList<String>();
		
		
		nameList.add("Bruce");
		nameList.add("Wayne");
		nameList.add("Kris");
		nameList.add("Batman");		
		nameList.add("Abc");
		nameList.add("Bcd");
		nameList.add("Abc");

		System.out.println("Name list is as follows\n"+nameList);
		
		nameList.addFirst("Tony");
		nameList.addLast("Stark");		
		
		System.out.println("Name list is as follows\n"+nameList);
		
		System.out.println("First Element "+nameList.getFirst());
		System.out.println("First Element "+nameList.getLast());

		nameList.removeFirst();
		nameList.removeLast();
		System.out.println("Name list is as follows\n"+nameList);

		
		Collections.sort(nameList);
		System.out.println("Name list after sorting is as follows\n"+nameList);
		
		Collections.reverse(nameList);
		System.out.println("Name list after reversing is as follows\n"+nameList);

		nameList.add(3,"Third");
		System.out.println("Name list is as follows\n"+nameList);

		ListIterator<String> li = nameList.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		
		//System.out.println(li.next());		//li.next() is already at the last postion

		while(li.hasPrevious())
			System.out.println(li.previous());
		
		System.out.println("Name list is as follows\n"+nameList);
		System.out.println("___________________________");
		ListIterator<String> li1 = nameList.listIterator(nameList.size());   //specify size of list and point iterator to last index
		while(li1.hasPrevious())
		{
			String name = li1.previous();
			if(name.equals("Abc")) {
				li1.add("Xyz");
				//System.out.println("Name list is as follows add xyz \n"+nameList);
			}
			
			if(name.equals("Abc")) {
				li1.set("Zorak");
				//System.out.println("Name list is as follows set \n"+nameList);
			}
			

			if(name.equals("Xyz")) {
				li1.remove();
				
				}
		}
		System.out.println("Name list is as follows\n  "+nameList);
	}

}

