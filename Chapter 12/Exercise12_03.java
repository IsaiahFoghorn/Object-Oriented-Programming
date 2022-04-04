import java.util.Scanner;

class Exercise12_03 {	
	public static int access(int x[], int i) {
		if ((i < 0) || (i > 99)) {
			throw new ArrayIndexOutOfBoundsException("Out of Bounds");
		} else {
			return x[i];
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] array = new int[100];
		int result;
		
		for (int i = 0; i < 100; i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		
		
		try {
			System.out.print("Test:");
			int answer = inp.nextInt();
			access(array, answer);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print(ex);
		}
		System.out.print("!");
	}
}
