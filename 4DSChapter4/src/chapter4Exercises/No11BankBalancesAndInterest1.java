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

import java.util.*;

public class No11BankBalancesAndInterest1 {
	
	static Scanner console = new Scanner(System.in);
	static final int MINIMUM_BALANCE_SAVING = 200;
	static final int MINIMUM_BALANCE_CHECKING = 300;
	static final int SERVICE_CHARGE_SAVING = 10;
	static final int SERVICE_CHARGE_CHECKING = 25;

	public static void main(String[] args) {
		
		int balanceSavingAccount;
		int balanceCheckingAccount;
		int accountNumber;

		char accountType;
		
		
		
		System.out.println("Enter Account Type");
		accountType = console.next().charAt(0);
		
		switch(accountType) {
		
		case 's':
		case 'S':
			
			System.out.println("Enter Account Number: ");
			accountNumber = console.nextInt();
			
			System.out.println("Minimum Balance: " + MINIMUM_BALANCE_SAVING);
			System.out.println("Enter Current balance: ");
			balanceSavingAccount = console.nextInt();
			
			if (balanceSavingAccount < MINIMUM_BALANCE_SAVING)
				System.out.println("Service Charge:" +"$" + SERVICE_CHARGE_SAVING );
			if(balanceSavingAccount < MINIMUM_BALANCE_CHECKING)
				System.out.println("Interest Earned: " + "$" + balanceSavingAccount*0);
			
			if(balanceSavingAccount>=MINIMUM_BALANCE_SAVING)
				System.out.println("Interest Earned: " + "$" + balanceSavingAccount*0.04);
				System.out.println();
			
			System.out.println("Account Number: " + accountNumber);
			System.out.println("Account Type: " + accountType);
			System.out.println("Current Balance: " + balanceSavingAccount);
			
			
			
		case 'c':
		case 'C':
			System.out.println("Enter Account Number: ");
			accountNumber = console.nextInt();
			
			System.out.println("Minimum Balance: " + MINIMUM_BALANCE_CHECKING);
			System.out.println("Enter Current balance: ");
			balanceCheckingAccount = console.nextInt();
			
			if (balanceCheckingAccount < MINIMUM_BALANCE_CHECKING)
				System.out.println("Service Charge:" +"$" + SERVICE_CHARGE_CHECKING);
		
			if(balanceCheckingAccount < MINIMUM_BALANCE_CHECKING)
				System.out.println("Interest Earned: " + "$" + balanceCheckingAccount*0);
			
			else if(balanceCheckingAccount >= MINIMUM_BALANCE_CHECKING && balanceCheckingAccount <=(MINIMUM_BALANCE_CHECKING + 5000))
				System.out.println("Interest Earned: " + "$" + balanceCheckingAccount*0.03);
			
			else System.out.println("Interest Earned: " +  balanceCheckingAccount*0.05);
			System.out.println();
			
			System.out.println("Account Number: "+ accountNumber);
			System.out.println("Account Type: " + accountType);
			System.out.println("Current Balance: " + balanceCheckingAccount);
			
		}
		
		
	}
	
}
