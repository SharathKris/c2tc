package tns.day6.abstraction;

public abstract class Shape {
	float area;
	abstract void calArea();
	void show() {
		System.out.println("Area of shape is: "+area);
	}
}





/*
abstract method 
- method which do not contain body
- method without body
- method with declaration only
- which is declared with abstract keyword

abstract class
- class which is preceded with keyword abstract
- class contain at least one abstract method
- which can't be instantiated
- class which is always parent to other class
*/