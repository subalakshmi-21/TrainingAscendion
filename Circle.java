package javaBasics;

public class Circle extends Shapes {
	final double pi = 3.14;
	int radius;
	
	Circle(String name, int radius){
		super(name);
		this.radius = radius;
	}
	void calcArea() {
		double Area = pi * radius * radius;
		System.out.println("The Area of " + name + " is: " + Area);
	}
}
