import java.util.Scanner;

class Exercise12_03 {	
	public static int access(int array[], int i) {
		if ((i < 0) || (i >= array.length)) {
			throw new ArrayIndexOutOfBoundsException("Out of Bounds");
		} else {
			return array[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] array = new int[100];
		int result, exit = 0;
		
		for (int i = 0; i < 100; i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		
		System.out.print("Please insert a number from 1 to 100: ");
		
		do {
			try {
				int answer = (inp.nextInt() - 1);
				System.out.print(access(array, answer));
				exit = 1;
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.print("Out of Bounds. \n\nPlease try again: ");
			}
		} while (exit == 0);
	}
}
