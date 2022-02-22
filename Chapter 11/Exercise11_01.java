import java.util.*;
import java.sql.*;

class Exercise11_01 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		boolean filled = false;
		
		System.out.print("Please enter the side lengths of a triangle separated by spaces: ");
		double sideA = inp.nextInt();
		double sideB = inp.nextInt();
		double sideC = inp.nextInt();
		
		System.out.print("What color is the triangle? ");
		String color = input.nextLine();
		
		System.out.print("Is the triangle filled? ");
		if (input.nextLine().equalsIgnoreCase("yes")) {
			filled = true;
		}
		
		Triangle tri = new Triangle();
		
		Triangle triang = new Triangle(sideA, sideB, sideC);
		
		Triangle triangle = new Triangle(sideA, sideB, sideC, color, filled);
		
		tri.setColor(color);
		
		System.out.print(tri.getColor());
		
		System.out.print(triang.getColor());
		
		System.out.print(triang.getArea());
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
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	boolean isFilled() {
		return filled;
	}
	
	void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	// add toString() method here
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
	
	Triangle(double SideA, double SideB, double SideC, String color, boolean filled) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		setColor(color);
		setFilled(filled);
	}
	
	double getSideA() {
		return sideA;
	}
	
	double getSideB() {
		return sideB;
	}
	
	double getSideC() {
		return sideC;
	}
	
	void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	double getArea() {
		double s = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}
	
	double getPerimeter() {
		return (sideA + sideB + sideC);
	}
	
	// add toString() method here
}
