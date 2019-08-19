
public class Square extends Shape implements TwoDimensionalShapeInterface{

	private double side;

	//Class's Constructor
	public Square(double shapeArea, String color, double side) {
		super(shapeArea, color);
		this.side = side;
	}
	
	@Override
	public double calculateArea() {
		
		double squareArea = this.side * this.side;
		return squareArea;
	}

	@Override
	public void printInfo() {
		
		
		
	}

	//Getters and Setters
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	
	
}
