import java.util.*;

class Exercise13_01 {
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
		
		Triangle tri = new Triangle(sideA, sideB, sideC, color, filled);
		
		System.out.printf("%s\n\nArea: %.2f\nPerimeter: %.2f", tri.toString(), tri.getArea(), tri.getPerimeter());
		
		GeometricObject object1 = new Triangle(3, 4, 5);
		GeometricObject object2 = new Triangle(4, 5, 6);
		System.out.print(equals(object1, object2));
	}
	
	public static boolean equals(GeometricObject x, GeometricObject y) {
		return (x.getArea() == y.getArea());
	}
}

abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
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
		String result = "\nProperties: \nColor: " + color + "\nFilled: " + filled + "\nDate Created: " + dateCreated;
		
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
		String result = "\nTriangle: \nsideA = " + sideA + "\nsideB = " + sideB + "\nsideC = " + sideC + "\n" + super.toString();
		
		return result;
	}
}
