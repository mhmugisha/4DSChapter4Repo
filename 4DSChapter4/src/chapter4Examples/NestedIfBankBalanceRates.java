package chapter4Examples;

import java.util.Scanner;

public class NestedIfBankBalanceRates {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double BankBalance;
		double interestRate1 = 0.05;
		double interestRate2 = 0.04;
		double interestRate3 = 0.03;
		double interestRate4 = 0.00;
		
		System.out.println("Enter Bank Balance:");
		BankBalance = console.nextDouble();
		
		if (BankBalance >= 50000.00) 
			System.out.println("Interest earned: " + BankBalance*interestRate1);
			
			else if (BankBalance >= 25000.00)//This evaluates ONLY when the first evaluates to
					//false. So if balance is greater than 50k the first is true and this
					//is not evaluated. So this is for the region greater than 25k but <50k.
					System.out.println("Interest earned: " + BankBalance*interestRate2); 
			else if (BankBalance >= 1000.00) 
					System.out.println("Interest earned: " + BankBalance*interestRate3); 
			else 
					System.out.println("Interest earned: " + BankBalance*interestRate4); 
		
	}
}
