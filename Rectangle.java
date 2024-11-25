package javaBasics;

public class Rectangle extends Shapes{

	int length;
	int breadth;

	Rectangle(String name, int length, int breadth) {
		super(name);
		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}
	
	void calcArea() {
		double Area = length * breadth;
		System.out.println("The Area of " + name + " is: " + Area);
	}
	
}
