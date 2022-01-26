import java.util.*;

class Untitled {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		Account[] account = new Account[10];
		
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account(i, 100, 0);
		}
		
		do {
			System.out.print("Enter an ID: ");
			int answer = inp.nextInt();
			
			if ((answer >= 0) && (answer <= 9)) {
				Prompt(account, answer);
			} else {
				System.out.println("That ID is invalid. Please try again. \n");
			}
		} while (account.length != 0);
	}
	
	public static void Prompt(Account[] account, int id) {
		Scanner input = new Scanner(System.in);
		Scanner floatInp = new Scanner(System.in);
		int answer;
		
		do {
			System.out.print("\nMain Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n> ");
			answer = input.nextInt();
			
			switch (answer) {
				case 1:
					System.out.printf("Account Balance: $%.2f", account[id].getBalance());
					break;
				case 2:
					System.out.print("How much would you like to deposit? $");
					account[id].deposit(floatInp.nextDouble());
					break;
				case 3:
					
				case 4:
					
				default:
					answer = 0;
			}
		} while (answer != 4);
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
