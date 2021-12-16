import java.util.*;
import java.awt.*;

public class Exercise09_01 {
	public static void main(String[] args) {
		
		simpleRectangle r1 = new simpleRectangle(4, 40);
		
		System.out.printf("Rectangle 1\nWidth: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter: %.2f", r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());
		
		simpleRectangle r2 = new simpleRectangle(3.5, 35.9);
		
		System.out.printf("\n\nRectangle 2\nWidth: %.2f\nHeight: %.2f\nArea: %.2f\nPerimeter: %.2f", r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
	}
}

class simpleRectangle {
	private double width;
	private double height;
	
	simpleRectangle() {
		width = 1;
		height = 1;
	}
	
	simpleRectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	double getWidth() {
		return width;
	}
	
	double getHeight() {
		return height;
	}
	
	double getArea() {
		return width * height;
	}
	
	double getPerimeter() {
		return (width * 2) + (height * 2);
	}
	
	void setWidth(double newWidth) {
		width = newWidth;
	}
	
	void setHeight(double newHeight) {
		height = newHeight;
	}
}
