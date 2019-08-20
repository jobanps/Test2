public class Triangle extends Shape implements TwoDimensionalShapeInterface {

	private double base;
	private double height;

	// Class's Constructor
	public Triangle(String color, double base, double height) {
		super(color);
		this.base = base;
		this.height = height;
		this.setShapeArea(calculateArea());
	}

	@Override
	public double calculateArea() {

		double triangleArea = 0.5 * this.getBase() * this.getHeight();
		return triangleArea;
	}

	@Override
	public void printInfo() {
		String detailStr = "Shape Type : Triangle \n" + "**********************" + "\nColor : " + this.getColor()
				+ "\nArea : " + this.getShapeArea() + "\nDimension as follows \n" + "Base : " + this.getBase()
				+ "\nHeight : " + this.getHeight();

		System.out.println(detailStr);

	}

	// Getters and Setters
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
