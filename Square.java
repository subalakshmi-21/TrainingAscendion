package javaBasics;

public class Square extends Shapes {

	int length;

	Square(String name, int length) {
		super(name);
		// TODO Auto-generated constructor stub
		this.length = length;
	}
	
	void calcArea() {
		double Area = 4 * length;
		System.out.println("The Area of " + name + " is: " + Area);
	}
	
}
