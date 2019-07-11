//CHAPTER 4 NUMBER 12 PAGE 223 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK

/*Every salesperson has a base salary. The salesperson also receives a bonus at the end of each
month, based on the following criteria: If the salesperson has been with the store for five
years or less, the bonus is $10 for each year that he or she has worked there. If the salesperson
has been with the store for more than five years, the bonus is $20 for each year that he or she
has worked there. The salesperson can earn an additional bonus as follows: If the total sales
made by the salesperson for the month are more than $5,000 but less than $10,000, he or she
receives a 3% commission on the sale. If the total sales made by the salesperson for the month
are at least $10,000, he or she receives a 6% commission on the sale.

Write a program to calculate a salesperson’s monthly paycheck */


package chapter4Exercises;

import java.util.*;

public class No12SalesPersonMonthlyWages {

	//Named constants
	static Scanner console = new Scanner(System.in);
	static final double BASE_SALARY = 1000;
	static final double BONUS_UP_TO_FIVE = 10;
	static final double BONUS_OVER_FIVE_YEARS = 20;
	
	
	public static void main(String[] args) {
		
		//Declaring the variables
		double numberOfServiceYears;
		double serviceBonus;
		double extraBonus;
		double totalSales;
		
		
		System.out.println("Enter Number of Service Years: ");
		numberOfServiceYears = console.nextDouble();
		
		//The conditionals
		if(numberOfServiceYears <= 5)
			serviceBonus = numberOfServiceYears*BONUS_UP_TO_FIVE;
		else serviceBonus= numberOfServiceYears*BONUS_OVER_FIVE_YEARS;
		
		System.out.println("Enter Total Sales: ");
		totalSales = console.nextDouble();
		
		if(totalSales >= 10000)
			extraBonus = totalSales * 0.06;
		else if(totalSales > 5000)
			extraBonus = totalSales * 0.03;
		else extraBonus = 0;
		
		
		//Final Output
		System.out.println("Base Salary: " +"$" + BASE_SALARY);
		System.out.println();
		System.out.println("Service Bonus: " + "$" + serviceBonus);
		System.out.println();
		System.out.println("Extra Bonus: " +"$" + extraBonus);
		System.out.println();
		System.out.println("Paycheck for the Month is: " +"$" + (BASE_SALARY + serviceBonus + extraBonus));
		
		
	}
	
}
