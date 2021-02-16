package Polymorphism.polymorphism;

public class Square extends Shape{
	public void printSquare() {
		System.out.println("Printing square! ");
	}
	
	@Override
	public void shapeColor() {
		System.out.println("Square color is red!");
	}
	
	public void area(int x, int y) {
		System.out.println("Area  of square: " + (x*y));
	}
}
