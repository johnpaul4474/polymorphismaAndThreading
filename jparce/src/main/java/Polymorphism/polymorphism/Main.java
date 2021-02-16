package Polymorphism.polymorphism;

public class Main {
	public static void main(String [] args) {
		Shape shape = new Shape();
		Circle circle = new Circle();
		Square square = new Square();
		
		shape.printShape();
		circle.printShape();
		square.printSquare();
		
		shape.shapeColor();
		square.shapeColor();
		circle.shapeColor();
		
		square.area(5, 5);
		circle.area(5, 2);
	}
}
