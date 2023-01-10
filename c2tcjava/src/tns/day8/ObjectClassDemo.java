package tns.day8;

class Point
{
	private float x, y;
	
	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}

	
	public Point(float x, float y) {
		super();
		System.out.println("Parameterized");
		this.x = x;
		this.y = y;
	}



	public Point() {
		super();
		System.out.println("Default");
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}



	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destroyed");
	}
	
	
}

public class ObjectClassDemo {

	public static void main(String[] args) {
		
		Point p1 = new Point();
		System.out.println("Point is :"+p1);
		
		Point p2 = new Point(15.2f, 20.3f);
		System.out.println("Point is :"+p2);
		
		p1=null;	//p1 is assigned to null so that the reference to location is deleted
		p2=null;
		System.gc();
	}

}
