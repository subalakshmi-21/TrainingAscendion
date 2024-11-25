package javaBasics;

public class abstractClassesRunner {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle("Rectangle", 2, 4);
		rec.calcArea();
		rec.setOuterColor("Red");
		
		Square sq = new Square("Square", 5);
		sq.calcArea();
		sq.setOuterColor("Yellow");
		
		Circle c = new Circle("Circle", 10);
		c.calcArea();
		c.setOuterColor("Pink");
		
		Triangle tri = new Triangle("Triangle", 5, 5);
		tri.calcArea();
		tri.setOuterColor("Black");
	}
}
