import java.util.*;

class Exercise09_07 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		Account a1 = new Checkings(1122, 2000, 4.5);
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
		
		
		System.out.printf("\n%s", a1.toString());
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
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	Account() {
		dateCreated = new java.util.Date();
	}
	
	Account(int newID, double newBalance, double newAnnualInterest) {
		id = newID;
		balance = newBalance;
		annualInterestRate = newAnnualInterest;
		Date dateCreated = new java.util.Date();
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int newID) {
		id = newID;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	public double getMonthlyInterest() {
		return (annualInterestRate / 1200 + 1) * balance;
	}
	
	public void withdraw(double withdrawalAmount) {
		balance -= withdrawalAmount;
	}
	
	public void deposit(double depositAmount) {
		balance += depositAmount;
	}
	
	public String toString() {
		return "Account " + id + "\nBalance: " + balance + "\nAnnual Interest Rate: " + annualInterestRate + "\nCreated on " + dateCreated;
	}
}

class Checkings extends Account {
	private double draftLimit = 100;
	
	Checkings() {
		
	}
	
	Checkings(int id, double balance, double annualInterestRate) {
		setID(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
	}
	
	Checkings(int id, double balance, double annualInterestRate, double draftLimit) {
		setID(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
		this.draftLimit = draftLimit;
	}
	
	double getLimit() {
		return draftLimit;
	}
	
	void setLimit(double newLimit) {
		draftLimit = newLimit;
	}

	public void withdraw(double amount) {
		if (amount <= (draftLimit + getBalance())) {
			super.withdraw(amount);
		} else {
			System.out.print("\nThe amount you wish to withdraw exceeds your account's balance and overdraft limit\n");
		}
	}
	
	public String toString() {
		return "Checkings " + super.toString(); // add overdraft limit to this
	}
}

class Savings extends Account {
	Savings() {
		
	}
	
	Savings(int id, double balance, double annualInterestRate) {
		setID(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
	}
	
	public void withdraw(double amount) {
		
	}
	
	public String toString() {
		return "Savings " + super.toString();
	}
}
