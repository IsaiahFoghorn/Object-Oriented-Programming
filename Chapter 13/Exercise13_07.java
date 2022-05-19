import java.util.*;

class Exercise13_01 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		boolean filled = false;
		GeometricObject[] objects = new Triangle[5];
		
		for (int i = 0; i < objects.length; i++) {
			System.out.print("Please enter side lengths for triangle #" + (i + 1) + " separated by spaces: ");
			double sideA = inp.nextInt();
			double sideB = inp.nextInt();
			double sideC = inp.nextInt();
			
			if (((sideA + sideB) <= sideC) || ((sideB + sideC) <= sideA) || ((sideC + sideA) <= sideB)) {
				i--;
				System.out.println("\nThat triangle is invalid. Please try again.\n");
				continue;
			} else {
				objects[i] = new Triangle(sideA, sideB, sideC);
			}
			
			System.out.print("What color is the triangle? ");
			String color = input.nextLine();
			
			if (!color.equals("")) {
				objects[i].setColor(color);
			}
			
			System.out.print("Is the triangle filled? ");
			if (input.nextLine().equalsIgnoreCase("yes")) {
				objects[i].setFilled(true);
			}
			
			System.out.println("");
		}
		
		for (int i = 0; i < objects.length; i++) {
			System.out.printf("Triangle %s: %s\nHow to Color: %s\n\nArea: %.2f\nPerimeter: %.2f\n\n", (i + 1), objects[i].toString(), ((Colorable)objects[i]).howToColor(), objects[i].getArea(), objects[i].getPerimeter());
		}
		
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

class Triangle extends GeometricObject implements Colorable {
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
	
	@Override
	
	public String howToColor() {
		if (this.getColor().equalsIgnoreCase("white")) {
			return "Don't color";
		} else if (this.isFilled() == false) {
			return "Color all three sides " + this.getColor();
		} else {
			return "Color the entire triangle " + this.getColor();
		}
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
		String result = "\nsideA = " + sideA + "\nsideB = " + sideB + "\nsideC = " + sideC + "\n" + super.toString();
		
		return result;
	}
}

interface Colorable {
	public abstract String howToColor();
}
