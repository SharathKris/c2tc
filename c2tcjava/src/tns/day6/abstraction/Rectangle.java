package tns.day6.abstraction;

public class Rectangle extends Shape {
	float width, height;
	
	
	public Rectangle(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	
	public Rectangle() {
		this.width = 2.5f;
		this.height = 5.0f;	
	}


	@Override
	void calArea() {
		super.area=width*height;
	}

}
