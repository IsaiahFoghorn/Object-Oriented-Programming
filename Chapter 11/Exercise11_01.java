import java.util.*;
import java.sql.*;

class Exercise11_01 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the side lengths of a triangle separated by spaces: ");
		double sideA = inp.nextInt();
		double sideB = inp.nextInt();
		double sideC = inp.nextInt();
		
		System.out.print("What color is the triangle? ");
		String color = input.nextLine();
		
		System.out.print("Is the triangle filled? ");
		String filled = input.nextLine();
		
		System.out.printf("%.2f %.2f %.2f %s %s", sideA, sideB, sideC, color, filled);
	}
}

class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	GeometricObject(String color, boolean filled) {
		// Add code
	}
}

class Triangle extends GeometricObject {
	private double sideA = 1, sideB = 1, sideC = 1;
	
	Triangle() {
		
	}
	
	Triangle(double SideA, double SideB, double SideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	Triangle(double SideA, double SideB, double SideC, String color) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		// add color and filled specifications
	}
}
