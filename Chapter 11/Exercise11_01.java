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
		
		GeometricObject obj = (GeometricObject)triang;
		
		Print((GeometricObject)obj);
	}
	
	public static void Print(Object obj) {
		System.out.print(obj.toString());
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
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	@Override
	
	public String toString() {
		String result = "Color: " + color + "filled:" + filled + "dateCreated:" + dateCreated;
		
		return result;
	}
}

class Triangle extends GeometricObject {
	private double sideA = 1, sideB = 1, sideC = 1;
	
	Triangle() {
		
	}
	
	Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	
	Triangle(double sideA, double sideB, double sideC, String color, boolean filled) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSideA() {
		return sideA;
	}
	
	public double getSideB() {
		return sideB;
	}
	
	public double getSideC() {
		return sideC;
	}
	
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	
	public double getArea() {
		double s = (sideA + sideB + sideC) / 2;
		double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}
	
	public double getPerimeter() {
		return (sideA + sideB + sideC);
	}
	
	@Override
	
	public String toString() {
		String result = "Triangle: sideA = " + sideA + " sideB = " + sideB + " sideC = " + sideC;
		
		return result;
	}
}
