package tns.day8;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		String str = "Hello! How r u?";
		sb = new StringBuffer(str);
		sb.append("*************");
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		System.out.println("Reverse is :"+sb.reverse());
		sb.replace(1,10,">");
		System.out.println(sb.toString());
		
	
	}

}
