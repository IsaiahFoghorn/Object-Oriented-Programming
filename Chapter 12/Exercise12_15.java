import java.util.*;
import java.io.*;
import java.nio.file.*;

class Exercise12_15 {
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		int[] array = new int[100];
		
		if (file.exists()) {
			//System.out.print("asdh");
			file.delete();
			//System.exit(1);
		}
		
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		for (int i = 0; i < 100; i++) {
			output.println((int)(Math.random() * 100) + 1);
		}
		
		output.close();
		
		Scanner inp = new Scanner(file);
		
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = inp.nextInt();
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				if (array[i] < array[j]) {
					
				}
			}
		}
	}
}
