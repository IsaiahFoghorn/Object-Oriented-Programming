import java.util.Scanner;

class Exercise12_03 {	
	public static int access(int x[], int i) {
		if ((i < 0) || (i > 98)) {
			throw new ArrayIndexOutOfBoundsException("Out of Bounds");
		}
		
		return x[i];
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] x = new int[100];
		int result;
		
		for (int i = 0; i < 100; i++) {
			x[i] = (int)(Math.random() * 1000);
		}
		
		
		try {
			System.out.print("Test:");
			int y = inp.nextInt();
			access(x, y);
		}
		catch (ArrayIndexOutOfBoundsException out) {
			System.out.print(out);
		}
		System.out.print("!");
	}
}
