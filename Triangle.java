package javaBasics;

public class Triangle extends Shapes {
	int base;
	int height;
	Triangle(String name, int base, int height){
		super(name);
		this.base = base;
		this.height = height;
	}
	
	void calcArea() {
		double Area = 0.5 * base * height;
		System.out.println("The Area of " + name + " is: " + Area);
	}
}
