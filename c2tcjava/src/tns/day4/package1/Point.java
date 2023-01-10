package tns.day4.package1;

public class Point {
	private float x;
	private float y;
	
	public Point() 
	{
		this.x=0.0f;
		this.y=0.0f;
		System.out.println("Default Constructor");
	}
	
	public Point(float v)
	{
		this.x=v; this.y=v;
	}
	
	public Point(float x,float y)
	{	
		this();
		this.x=x; this.y=y;
	}
	
	public Point (int v, int z) {
		
	}
	
	public Point (float v, int z) {
		
	}
	
	public Point (int v, float z) {
		
	}

	public void show() {
		System.out.println("x "+x+" y "+y);
	}
}
