import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter two numbers separated by a space: "); 
		
		int value = MyInteger.parseInt(inp.next());
		MyInteger myValue = new MyInteger(MyInteger.parseInt(inp.next()));
		boolean cond;
		
		do {
			cond = true;
			
			System.out.print("\nWhich method would you like to test with these values? \n1) isEven() \n2) isOdd() \n3) isPrime() \n4) equals() \n: ");
			
			switch (inp.nextInt()) {
				case 1:
					System.out.println("\n" + value + " is an even number: " + MyInteger.isEven(value));
					System.out.println(myValue.getValue() + " is an even number: " + myValue.isEven());
					break;
				case 2:
					System.out.println("\n" + value + " is an odd number: " + MyInteger.isOdd(value));
					System.out.println(myValue.getValue() + " is an odd number: " + myValue.isOdd());
					break;
				case 3:
					System.out.println("\n" + value + " is a prime number: " + MyInteger.isPrime(value));
					System.out.println(myValue.getValue() + " is a prime number: " + myValue.isPrime());
					break;
				case 4:
					System.out.println("\n" + value + " is equal to " + myValue.getValue() + ": " + MyInteger.isEven(value));
					break;
				default:
					System.out.println("\nThat isn't a valid choice. Please try again. ");
					cond = false;
			}
		} while (!cond);
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
