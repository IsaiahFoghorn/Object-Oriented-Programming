import java.util.*;

class Exercise12_03 {	
	public static int access(int x[], int i) {
		if ((i < 0) || (i > 100)) {
			throw new IndexOutOfBoundsException("Out of Bounds");
		}
		
		return x[i];
	}
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int[] x = new int[100];
		
		for (int i = 0; i < 100; i++) {
			x[i] = (int)(Math.random() * 1000);
		}
		
		
		try {
			System.out.print("");
			int y = inp.nextInt();
			System.out.print(x[y]);
		}
		catch (IndexOutOfBoundsException ex) {
			System.out.print("Out of Bounds");
		}
		
	}
}
