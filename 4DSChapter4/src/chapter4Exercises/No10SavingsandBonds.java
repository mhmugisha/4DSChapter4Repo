//CHAPTER 4 NUMBER 10 PAGE 222 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK



package chapter4Exercises;

import java.util.Scanner;

public class No10SavingsandBonds {

	static Scanner console = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		double ratePerHour;
		int hoursWorked;
		double incomeBeforeTax;
		double taxRate = 0.14;
		double incomeAfterTax;
		double clothes;
		double schoolSupplies = 0.01;
		double savingBonds;
		double savingBondsParents;
		double incomeTax;
		double totalSpent;
		double withholdingTax;
		
		
		System.out.println("Hours Worked: ");
		hoursWorked = console.nextInt();
		
		System.out.println("Rate per Hour: ");
		ratePerHour = console.nextDouble();
		
		//Formulas
		incomeBeforeTax = hoursWorked*ratePerHour;
		incomeTax = incomeBeforeTax*taxRate;
		incomeAfterTax = incomeBeforeTax - incomeTax;
		clothes = 0.1*incomeAfterTax;
		schoolSupplies = schoolSupplies*incomeAfterTax;
		savingBonds = 0.25*(incomeAfterTax - clothes - schoolSupplies);
		savingBondsParents = savingBonds*0.5;
		totalSpent = Math.round(clothes + schoolSupplies+ savingBonds);
		withholdingTax = incomeAfterTax*0.1;
		
		
		System.out.println("Income Before Tax:"+ "$" + incomeBeforeTax);
		System.out.println("Tax:" + "$" + Math.round(incomeTax) );
		System.out.println("Income After Tax:"+ "$" + incomeAfterTax);
		System.out.println("Clothes & Accessories: "+ "$" + Math.round(clothes));
		System.out.println("School Supplies: "+ "$" + Math.round(schoolSupplies));
		System.out.println("Saving Bonds: "+ "$" + Math.round(savingBonds));
		System.out.println("Saving Bonds-Parents: "+ "$." +" " + Math.round(savingBondsParents));
		System.out.println("Total spent:"+ "$"+ totalSpent);
		System.out.println("Balance:" + "$" + Math.round(incomeAfterTax-totalSpent));
		
	}
	
	
	
	
	
	
}
