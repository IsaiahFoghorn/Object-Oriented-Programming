import java.util.*;

public class Exercise09_07 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		Account a1 = new Account(1122, 20000, 4.5);
		int answer = 0;
		double amount = 0;
		boolean leave = false;
		
		System.out.printf("Account ID Number: %d\nAccount Balance: %.2f\nAnnual Interest Rate: %.2f\n", a1.getID(), a1.getBalance(), a1.getAnnualInterestRate());
		
		do {
			switch (Prompt(answer)) {
				case 1:
					System.out.print("\nHow much would you like to withdraw? $");
					a1.withdraw(inp.nextDouble());
					break;
				case 2:
					System.out.print("\nHow much would you like to deposit? $");
					a1.deposit(inp.nextDouble());
					break;
				case 3:
					answer = 3;
					break;
			}
		} while (answer != 3);
		
		
		System.out.printf("\nAccount Balance: %.2f\nMonthly Interest: %.2f\nDate Created: %s", a1.getBalance(), a1.getMonthlyInterest(), a1.dateCreated());
	}
	
	public static int Prompt(int answer) {
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("\nWould you like to...\n1) Withdraw\n2) Deposit\n3) Exit\n:");
			answer = input.nextInt();
			
			if ((answer < 1) || (answer > 3)) {
				answer = 0;
				System.out.println("\nInvalid input. Please try again.");
			}
		} while (answer == 0);
		return answer;
	}
}

class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private java.util.Date dateCreated;
	
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new java.util.Date();
	}
	
	Account(int newID, double newBalance, double newAnnualInterest) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterest;
		dateCreated = new java.util.Date();
	}
	
	int getID() {
		return id;
	}
	
	void setID(int newID) {
		id = newID;
	}

	double getBalance() {
		return balance;
	}
	
	void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	String dateCreated() {
		return dateCreated.toString();
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return (annualInterestRate / 1200 + 1) * balance;
	}
	
	void withdraw(double withdrawalAmount) {
		balance -= withdrawalAmount;
	}
	
	void deposit(double depositAmount) {
		balance += depositAmount;
	}
}
