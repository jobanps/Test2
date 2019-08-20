
public class Square extends Shape implements TwoDimensionalShapeInterface {

	private double side;

	// Class's Constructor
	public Square(String color, double side) {
		super(color);
		this.side = side;
		this.setShapeArea(calculateArea());
	}

	// Function to calculate Area of a Square
	@Override
	public double calculateArea() {

		double squareArea = this.getSide() * this.getSide();
		return squareArea;
	}

	// PrintInfo will print color, dimensions, area of a Square
	@Override
	public void printInfo() {

		String detailStr = "Shape Type : Square \n" + "**********************" + "\nColor : " + this.getColor()
				+ "\nArea : " + this.getShapeArea() + "\nDimension as follows \n" + "Side : " + this.getSide();

		System.out.println(detailStr);

	}

	// Getters and Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

}
