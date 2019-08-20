
public class Shape {

	private double shapeArea;
	private String color;

	// Class's Constructor
	public Shape(String color) {
		super();
		this.shapeArea = 0;
		this.color = color;
	}

	// Defining Empty Function for Use OverRiding for subclasses
	public void printInfo() {

	}

	// Getters and Setters

	public double getShapeArea() {
		return shapeArea;
	}

	public void setShapeArea(double shapeArea) {
		this.shapeArea = shapeArea;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
