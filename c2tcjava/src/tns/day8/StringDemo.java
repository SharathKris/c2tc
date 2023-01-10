package tns.day8;

public class StringDemo {

	public static void main(String[] args) {
		String str = "Hello";	//creates a string with Hello message
		System.out.println("String is "+ str);
		
//		str = new String();		//creates an empty string
//		System.out.println("String is "+ str);
//
//		str=new String("World");	//creates a string with World
//		System.out.println("String is "+ str);
		
		String str1 = str;		//creates a string 
		System.out.println("String is "+ str1);
		
		str = "Hi";
		System.out.println("String is " + str1 + str);
		
//		System.out.println(str.equals(str1));
//
//		char ch[]= {'H','i'};
//		str= new String(ch);
//		System.out.println("String is "+ str);
//		
//		System.out.println("String at position 0 "+ str.charAt(0));
//		
//		str1=str.concat("Hello");
//		System.out.println("String is "+ str1);
		
//		System.out.println(str.equals(str1));
//		
//		str = "Hi, I am a String H.";
//		
//		System.out.println(str.indexOf('H'));
//		
//		System.out.println(str.lastIndexOf('H'));
//		
//		System.out.println(str.indexOf('H',4));		//Find H from the postion of the String
//		
//		System.out.println("Length of "+str+" is "+str.length());
//		
//		System.out.println(str.toUpperCase());
//		
//		System.out.println(str.toLowerCase());
//		
//		String s[]=str.split(" ");
//		for(String ss:s)
//			System.out.println(ss);
//		
//		System.out.println(str.startsWith("Hi"));
//		System.out.println(str.endsWith("."));
//		
//		str="		Java 		";
//		System.out.println("Before Trim :"+str);
//		System.out.println("After Trim :"+str.trim());
		
				
	}

}
