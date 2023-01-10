package tns.day4.package1;

public class PointDemo {

	public static void main(String[] args) {
		
		/* Compile time polymorphism / static binding */
		
		Point p1 = new Point(); //default constructor
		p1.show();
		
		Point p2 = new Point(2.5f,3.5f);
		p2.show();
	}

}
