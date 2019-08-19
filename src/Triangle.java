public class Triangle extends Shape implements TwoDimensionalShapeInterface {
	
	private double base;
	private double height;
	
	//Class's Constructor
	public Triangle(double shapeArea, String color, double base, double height) {
		super(shapeArea, color);
		this.base = base;
		this.height = height;
	}
	
	
	@Override
	public double calculateArea() {
		
		double triangleArea = this.base * this.height;
		return triangleArea;
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//Getters and Setters
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

	
	

}
