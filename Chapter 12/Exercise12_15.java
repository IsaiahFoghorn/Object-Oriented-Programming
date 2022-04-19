import java.util.*;
import java.io.*;
import java.nio.file.*;

class Exercise12_15 {
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		int[] array = new int[100];
		
		if (file.exists()) {
			file.delete();
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		for (int i = 0; i < 100; i++) {
			output.print(((int)(Math.random() * 100) + 1) + " ");
		}
		
		output.close();
		
		Scanner inp = new Scanner(file);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = inp.nextInt();
			
			System.out.printf("%-4d ", array[i]);
			if ((i % 10) == 9) {
				System.out.println("");
			}
		}
		
		System.out.println("");
		
		sortArray(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%-4d ", array[i]);
			if ((i % 10) == 9) {
				System.out.println("");
			}
		}
	}
	
	public static int[] sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] >= array[j]) {
					int x = array[i];
					array[i] = array[j];
					array[j] = x;
				}
			}
		}
		
		return array;
	}
}
