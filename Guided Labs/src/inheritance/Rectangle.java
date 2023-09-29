package inheritance;

public class Rectangle extends Shape {

	private double height;
	private double width;
	private double length;

	public Rectangle() {
		super();
	}
	// this is the specific formula for the area of a rectangle.
	// this is implementation of the Area interface

	@Override
	public double calculateArea() {
		return height * width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
public double calculatePerimter() {
	return 2 * getLength() + getWidth();
}
}