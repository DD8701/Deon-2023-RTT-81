package inheritance;

public class Triangle extends Shape {

	private double base;
	private double height;
	private double side1;
	private double side2;

	public Triangle() {
		super();
	}

	@Override
	public double calculateArea() {
		return 1 / 2 * base * height;

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;

	}

	public double calculatePerimeter() {
		return base + side1 + side2;
	}

	public void setSide1(double side1) {

	}

	public void setSide2(double side2) {

	}
}