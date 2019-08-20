import java.util.ArrayList;
import java.util.Scanner;

// Jobanpreet Singh - C0748529

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int choice = 0;
		String color = "";
		double base, height, side;

		ArrayList<Shape> shapeList = new ArrayList<Shape>();

		while (choice != 3) {
			// 1. show the menu
			showMenu();

			// 2. get the user input
			System.out.println("Enter a number: ");
			choice = keyboard.nextInt();

			// 3. DEBUG: Output what the user typed in
			System.out.println("You entered: " + choice);

			switch (choice) {

			case 1: // Taking input for Triangle
				System.out.println("\nEnter color for Triangle: ");
				color = keyboard.next();
				System.out.println("Enter Dimensions for Triangle: ");
				System.out.println("Base : ");
				base = keyboard.nextDouble();
				System.out.println("Height : ");
				height = keyboard.nextDouble();
				shapeList.add(new Triangle(color, base, height));
				System.out.println("Input for Triangle Saved\n");
				break;
			case 2: // Taking input for Square
				System.out.println("\nEnter color for Square: ");
				color = keyboard.next();
				System.out.println("Enter Dimensions for Square: ");
				System.out.println("Side : ");
				side = keyboard.nextDouble();
				shapeList.add(new Square(color, side));
				System.out.println("Input for Square Saved\n");
				break;
			case 3:
				break;
			default:
				System.out.println("\nInvalid Choice -  Please Retry !!\n");

			}

		}

		printShapes(shapeList);

		keyboard.close();
	}

	public static void showMenu() {
		System.out.println("AREA GENERATOR");
		System.out.println("==============");
		System.out.println("1. Triangle");
		System.out.println("2. Square");
		System.out.println("3. Exit");
	}

	public static void printShapes(ArrayList<Shape> shapeList) {

		System.out.println("\nArea Calculator - Output");
		for (int index = 0; index < shapeList.size(); index++) {

			System.out.println("\nShape #" + (index + 1));
			shapeList.get(index).printInfo();

		}
		System.out.println("\nThank You for using Area Calculator");
	}
}
