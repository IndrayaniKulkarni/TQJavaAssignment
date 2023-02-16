/*
 * 4)WAP to create class shape with method draw().
 * create class circle, square, Rectangle which extends 
 * Shape implement draw() differently in each child.
 */
package com.overriding;
class Shape{
	void draw() {
		System.out.println("Drawing shape (_)");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("Drawing shape of circle..");
		System.out.println("    ...... ");
		System.out.println("  .         .");
		System.out.println(" .           .");
		System.out.println(" .          .");
		System.out.println("  .        .");
		System.out.println("    ....... ");
	}
}
class Square extends Shape{
	void draw() {
		System.out.println("Drawing shape of square..");
		System.out.println(" --------- ");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println(" --------- ");
	}
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("Drawing shape of rectangle..");
		System.out.println(" --------- ");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println(" --------- ");
	}
}
public class ShapeImplement {

	public static void main(String[] args) {
		
        Shape s = new Shape();
        s.draw();
        Circle c = new Circle();
        c.draw();
        Square sq = new Square();
        sq.draw();
        Rectangle r = new Rectangle();
        r.draw();
	}

}
