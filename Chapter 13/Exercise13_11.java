import java.util.*;
import java.lang.*;

class Exercise13_11 {
	public static void main(String[] args) {
		Octagon object1 = new Octagon(4);
		Octagon object2 = (Octagon)object1.clone();
		System.out.print(((Octagon)object1).compareTo((Octagon)object2));
	}
}

abstract class GeometricObject extends Object {
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

class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {
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
	
	public int compareTo(Octagon o) {
		if (getSideLengths() < o.getSideLengths()) {
			return -1;
		} else if (getSideLengths() > o.getSideLengths()) {
			return 1;
		} else {
			return 0;
		}
	}
	
	@Override
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	@Override
	
	public String toString() {
		String result = "\nSide Lengths: " + sideLengths + "\n" + super.toString();
		
		return result;
	}
}
