import java.util.*;
import java.io.*;

class Exercise12_15 {
	public static void main(String[] args) throws IOException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		
		/**if (file.exists()) {
			System.out.print("asdh");
			System.exit(1);
		}**/
		
		Scanner inp = new Scanner(file);
		
		//java.io.PrintWriter output = new java.io.PrintWriter(file);
		
		//output.print("a");
		
		//output.close();
		
		String test = inp.next();
		
		System.out.print(test);
	}
}
