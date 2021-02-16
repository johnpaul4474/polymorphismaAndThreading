package Polymorphism.polymorphism;

public class Circle extends Shape {
	public void printShape() {
		System.out.println("Printing Circle!");
	}
	
	@Override
	public void shapeColor() {
		System.out.println("Circle color is white!");
	}
	
	public void area(int x, int y) {
		System.out.println("Area of circle: " + (x*y)/2);
	}
}
