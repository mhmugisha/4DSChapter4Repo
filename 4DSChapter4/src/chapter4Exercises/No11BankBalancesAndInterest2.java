//CHAPTER 4 NUMBER 11 PAGE 223 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK


/*A bank in your town updates its customers’ accounts at the end of eachmonth.The bank offers
  two types of accounts: savings and checking. Every customer must maintain a minimum balance. 
  If a customer’s balance falls below the minimum balance, there is a service charge of $10.00 
  for savings accounts and $25.00 for checking accounts. If the balance at the end of the month 
  is at least the minimum balance, the account receives interest as follows:
a. Savings accounts receive 4% interest.
b. Checking accounts with balances of up to $5000 more than the minimum balance receive 3% 
interest; otherwise, the interest is 5%. 
Write a program that reads a customer’s account 
number (int type), account type (char type; s or S for savings, c or C for checking), 
minimum balance that the account should maintain, and current balance. The program should 
then output the account number, account type, current balance, and an appropriate message. 
Test your program by running it five times, using the following data:
46728 S 1000 2700
87324 C 1500 7689
79873 S 1000 800
89832 C 2000 3000
98322 C 1000 750*/



package chapter4Exercises;

//Importing the necessary packages/classes;
import java.util.Scanner;

public class No11BankBalancesAndInterest2 {

	//Named constants
	static Scanner console = new Scanner(System.in);
	static final int SAVINGS_MINIMUM_BALANCE = 300;
	static final int CHECKING_MINIMUM_BALANCE = 400;
	static final int SAVINGS_SERVICE_CHARGE = 10;
	static final int CHECKING_SERVICE_CHARGE = 25;
	static final int TOP_FOR_INTEREST = 5000;
	
	//Method main
	public static void main(String[] args) {
		
		int currentBalanceSavings;
		int currentBalanceChecking;
		int accountNumber;
		
		char accountType;
		
		System.out.println("Enter Account Type: ");
		accountType = console.next().charAt(0);
	
		switch(accountType) {
		case 's':
		case 'S':
			System.out.println("Enter Account No.:");
			accountNumber = console.nextInt();
		
			System.out.println("Enter Current Balance: ");
			currentBalanceSavings = console.nextInt();
			
			if(currentBalanceSavings < SAVINGS_MINIMUM_BALANCE)
				System.out.println("Service Charge = " + "$"+ SAVINGS_SERVICE_CHARGE 
						+ "\n" + "Interest Earned: " + "$" + 0);
			if(currentBalanceSavings >= SAVINGS_MINIMUM_BALANCE)
				System.out.println("Interest Earned: " + "$" + currentBalanceSavings*0.04);
			    System.out.println();
			
		System.out.println("Required Minimum Balance: " + "$"+ SAVINGS_MINIMUM_BALANCE);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Type: " + accountType);
		System.out.println("Current Balance: " + "$"+ currentBalanceSavings);
		
		if(currentBalanceSavings>SAVINGS_MINIMUM_BALANCE)
			System.out.println("Good job! you earned interest of: " + "$" + currentBalanceSavings*0.04);
		else 
			System.out.println("Gyenda oze kurya ebitokye, shashura: " + "$" + SAVINGS_SERVICE_CHARGE);
		break;
		
		case 'c':
		case 'C':
			
			System.out.print("Enter Account No.: ");
			accountNumber = console.nextInt();
			System.out.println();
			
			System.out.println("Enter Current Balance: ");
			currentBalanceChecking = console.nextInt();
			
			if(currentBalanceChecking > (CHECKING_MINIMUM_BALANCE + TOP_FOR_INTEREST))
				System.out.println("Interest Earned: " + "$" + currentBalanceChecking*0.05);
			else if (currentBalanceChecking >= CHECKING_MINIMUM_BALANCE)
				System.out.println("Interest Earned: " + "$" + currentBalanceChecking*0.03);
			else 
				System.out.print("Interest Earned: " + "$" + 0);
				System.out.println();
			
			System.out.println("Required Minimum Balance: " + "$"+ CHECKING_MINIMUM_BALANCE);
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Account Type: " + accountType);
			System.out.println("Current Balance: " + "$" + currentBalanceChecking);
			
			if(currentBalanceChecking > (CHECKING_MINIMUM_BALANCE + TOP_FOR_INTEREST))
				System.out.println("Congraculations you earned interest of: " + "$" + currentBalanceChecking*0.05);
			
			else if(currentBalanceChecking >= CHECKING_MINIMUM_BALANCE)
				System.out.println("Congraculations you earned interest of: " + "$" + currentBalanceChecking*0.03);
			else 
				System.out.println("Save a little more. You didn't earn this time.");
			
		}
		
		
	}
}
