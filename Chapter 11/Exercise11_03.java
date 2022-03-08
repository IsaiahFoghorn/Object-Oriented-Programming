import java.util.*;

class Exercise09_07 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int answer = 0;
		double amount = 0;
		boolean leave = false;
		
		outer: do {
			Account acnt = new Account(0, 2000, 4.5);
			
			switch (Prompt("Would you like to access your checking account or your savings account? \n1) Checking \n2) Savings \n3) Exit \n: ", answer)) {
				case 1:
					System.out.print("\nWhat is your account's ID? ");
					acnt = new Checking(inp.nextInt(), 2000, 4.5);
					break;
				case 2:
					System.out.print("\nWhat is your account's ID? ");
					acnt = new Savings(inp.nextInt(), 2000, 4.5);
					break;
				case 3:
					answer = 3;
					break outer;
			}
			
			System.out.printf("\n%s", acnt.toString());
			
			do {
				switch (Prompt("\nWould you like to...\n1) Withdraw\n2) Deposit\n3) Exit\n:", answer)) {
					case 1:
						System.out.print("\nHow much would you like to withdraw? $");
						acnt.withdraw(inp.nextDouble());
						break;
					case 2:
						System.out.print("\nHow much would you like to deposit? $");
						acnt.deposit(inp.nextDouble());
						break;
					case 3:
						answer = 3;
						break;
				}
			} while (answer != 3);
		} while (leave == false);
	}
	
	public static int Prompt(String prompt, int answer) {
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print(prompt);
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
		dateCreated = new java.util.Date();
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

class Checking extends Account {
	private double draftLimit = 100;
	
	Checking() {
		
	}
	
	Checking(int id, double balance, double annualInterestRate) {
		setID(id);
		setBalance(balance);
		setAnnualInterestRate(annualInterestRate);
	}
	
	Checking(int id, double balance, double annualInterestRate, double draftLimit) {
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
		return "Checking " + super.toString(); // add overdraft limit to this
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
