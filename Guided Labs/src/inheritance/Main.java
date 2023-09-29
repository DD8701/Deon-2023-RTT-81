package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// area = length * width
		Rectangle rect = new Rectangle();
		rect.setName("Rectangle");
		rect.setHeight(10);
		rect.setWidth(5);

		// area = pi * radius * radius
		Circle circle = new Circle();
		circle.setName("Circle");
		circle.setDiameter(100);

		Triangle triangle = new Triangle();
		triangle.setName("Triangle");
		triangle.setBase(0);
		triangle.setHeight(0);
		triangle.setSide1(0);
		triangle.setSide2(0);

		List<Shape> shapes = new ArrayList<>();
		shapes.add(rect);
		shapes.add(circle);
		shapes.add(triangle);

		for (Shape shape : shapes) {
			System.out.println("The area of a " + shape.getName() + " is " + shape.calculateArea());
		}

	}

}
