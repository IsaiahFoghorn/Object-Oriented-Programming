import java.util.*;

class Exercise13_11 {
	public static void main(String[] args) {
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

class Octagon extends GeometricObject implements Comparable, Cloneable {
	private double sideLengths = 1;
	
	Octagon() {
		
	}
	
	Octagon(double sideLengths) {
		this.sideLengths = sideLengths;
	}
	
	Octagon(double sideLengths, String color, boolean filled) {
		this.sideLengths = sideLengths;
		setColor(color);
		setFilled(filled);
	}
	
	public double getSideLengths() {
		return this.sideLengths;
	}
	
	public void setSideLengths(double sideLengths) {
		this.sideLengths = sideLengths;
	}
	
	public double getArea() {
		return (2 + (4 / Math.sqrt(2))) * Math.pow(sideLengths, 2);
	}
	
	public double getPerimeter() {
		return sideLengths * 8;
	}
	
	@Override
	
	public String toString() {
		String result = "\nObjects: ";
		
		return result;
	}
	
	public int compareTo(Octagon x) {
		
	}
}
