package tns.day6.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Square sq = new Square();
		Square sq1 = new Square(12.5f);
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10,20);
		
		sq.calArea();
		sq.show();
		
		sq1.calArea();
		sq1.show();
		
		r1.calArea();
		r1.show();
		
		r2.calArea();
		r2.show();
		
		
		//Runtime Polymorphism, the value for sh is allocated during runtime
		Shape sh;
		sh=new Square(12.5f);
		sh.calArea();
		sh.show();
		
		sh=new Rectangle(12.5f, 15);
		sh.calArea();
		sh.show();
 	}
	
}
