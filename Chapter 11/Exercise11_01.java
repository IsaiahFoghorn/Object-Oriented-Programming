import java.util.*;

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
