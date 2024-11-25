package javaBasics;

public abstract class Shapes {
	
	String name;
	Shapes(String name){
		this.name = name;
	}
	abstract void calcArea();
	public void setOuterColor(String Color) {
		System.out.println("The outer color of " + name + " is: " + Color);
	}
	
}
