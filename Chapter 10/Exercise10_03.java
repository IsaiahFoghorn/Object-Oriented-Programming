import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String answer;
		
		do {
			System.out.print("Enter a number or type 'Exit' to leave the program: ");
			answer = inp.next().trim();
			MyInteger value = new MyInteger(MyInteger.parseInt(answer));
			
			System.out.print("Which condition would you like to test? \n1) Even\n2) Odd\n3) Prime\n4) Equal to\n: ");
			
			switch (input.nextInt()) {
				case 1:
					
			}
		} while (!answer.equalsIgnoreCase("exit"));
		
		System.out.print("Please enter three numbers separated by spaces: "); 
		MyInteger v1 = new MyInteger(inp.nextInt());
		MyInteger v2 = new MyInteger(inp.nextInt());
		MyInteger v3 = new MyInteger(MyInteger.parseInt(input.nextLine()));
		
		System.out.print(v1.getValue() + " " + v2.getValue() + " " + v3.getValue());
		
	}
}

class MyInteger {
	int value;
	
	MyInteger(int newValue) {
		value = newValue;
	}
	
	int getValue() {
		return value;
	}
	
	boolean isEven() {
		return isEven(value);
	}
	
	boolean isOdd() {
		return isOdd(value);
	}
	
	boolean isPrime() {
		return isPrime(value);
	}
	
	static boolean isEven(int newValue) {
		if (newValue % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean isOdd(int newValue) {
		if (newValue % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	static boolean isPrime(int newValue) {
		boolean check = true;
		
		for (int i = 2; i <= (newValue / 2); i++) {
			if (newValue % i == 0) {
				check = false;
			}
		}
		
		return check;
	}
	
	static boolean isEven(MyInteger newInt) {
		return isEven(newInt.getValue());
	}
	
	static boolean isOdd(MyInteger newInt) {
		return isOdd(newInt.getValue());
	}
	
	static boolean isPrime(MyInteger newInt) {
		return isPrime(newInt.getValue());
	}
	
	boolean equals(int newValue) {
		if (value == newValue) {
			return true;
		} else {
			return false;
		}
	}
	
	boolean equals(MyInteger newInt) {
		return equals(newInt.getValue());
	}
	
	static int parseInt(char[] charArray) {
		int result = 0;
		
		for (int i = 0, place = 1; i < charArray.length; i++, place *= 10) {
			result *= 10;
			result += (int)charArray[i] % 48;
		}
		
		return result;
	}
	
	static int parseInt(String stringInt) {
		char[] str = new char[stringInt.length()];
		
		for (int i = 0; i < stringInt.length(); i++) {
			str[i] = stringInt.charAt(i);
		}
				
		return MyInteger.parseInt(str);
	}
}
