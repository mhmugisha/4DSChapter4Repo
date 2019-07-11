//CHAPTER 4 NUMBER 14 PAGE 223-224 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK

/*Write a program that calculates and prints the bill for a cellular telephone
company. The company offers two types of service: regular and premium. Rates vary based on 
the type of service and are computed as follows:

Regular service: $10.00 plus first 50 minutes are free. Charges for over 50
				 minutes are $0.20 per minute.

Premium service: $25.00 plus:
a. For calls made from 6:00 a.m. to 6:00 p.m., the first 75 minutes are free;
   charges for over 75 minutes are $0.10 per minute.
b. For calls made from 6:00 p.m. to 6:00 a.m., the first 100 minutes are
   free; charges for over 100 minutes are $0.05 per minute.

Your program should prompt the user to enter an account number, a service code (type char), 
and the number of minutes the service was used. A service code of r or R means regular 
service; a service code of p or P means premium service. Treat any other character as an 
error.

Your program should output the account number, type of service,number of minutes the 
telephone service was used, and the amount due from the user. For the premium service, 
the customer may be using the service during the day and the night. Therefore, to calculate 
the bill, you must ask the user to input the number of minutes the service was used during 
the day and the number of minutes the service was used during the night.*/




package chapter4Exercises;

import java.util.*;

public class No14PhoneMonthlyBill {

	static Scanner console = new Scanner (System.in);
	
	//The Named Constants.
	static final double BASE_RATE_REGULAR = 10;
	static final double BASE_RATE_PREMIUM = 25;
	static final double INITIAL_FREE_MINUTES_REGULAR = 50;
	static final double INITIAL_FREE_MINUTES_PREMIUM_DAY = 75;
	static final double INITIAL_FREE_MINUTES_PREMIUM_NIGHT = 100;
	static final double RATE_PER_MINUTE_REGULAR = 0.2;
	static final double RATE_PER_MINUTE_PREMIUM_DAY = 0.1;
	static final double RATE_PER_MINUTE_PREMIUM_NIGHT = 0.05;
	
	
	public static void main(String[] args) {
	
		//Declaring the Variable.
		int accountNumber;
		double numberOfMinutesRegular;
		double callCostRegular;
		double numberOfMinutesPremiumDay;
		double numberOfMinutesPremiumNight;
		double callCostPremiumDay;
		double callCostPremiumNight;
		
		char serviceCode;
		char dayOrNight;
		
		System.out.println("Enter Account No.:");
		accountNumber = console.nextInt();
		
		System.out.println("Enter Service Code (R/P):");
		serviceCode = console.next().charAt(0);
		
		switch(serviceCode) {
		
			//Regular:
		case 'r':
		case 'R':
			System.out.println("Enter Minutes Called:");
			numberOfMinutesRegular = console.nextDouble();
			
			if (numberOfMinutesRegular <= INITIAL_FREE_MINUTES_REGULAR)
				callCostRegular = 0;
			else 
				callCostRegular = RATE_PER_MINUTE_REGULAR * (numberOfMinutesRegular -INITIAL_FREE_MINUTES_REGULAR);
		
			System.out.println("Total Monthly Bill: " + "$" + (BASE_RATE_REGULAR + callCostRegular));
		    break;
		
			//Premium:
		case 'p':
		case 'P':
			//Day time billing.
				System.out.println("Enter Daytime Minutes: ");
				numberOfMinutesPremiumDay = console.nextDouble();
				
				if(numberOfMinutesPremiumDay <= INITIAL_FREE_MINUTES_PREMIUM_DAY)
				   callCostPremiumDay = 0;
				else
					callCostPremiumDay = RATE_PER_MINUTE_PREMIUM_DAY*(numberOfMinutesPremiumDay-INITIAL_FREE_MINUTES_PREMIUM_DAY);
			
				
				
				
			//Night time billing
				System.out.println("Enter Nighttime Minutes: ");
				numberOfMinutesPremiumNight = console.nextDouble();
				
				if(numberOfMinutesPremiumNight <= INITIAL_FREE_MINUTES_PREMIUM_NIGHT)
				   callCostPremiumNight = 0;
				else
					callCostPremiumNight = RATE_PER_MINUTE_PREMIUM_NIGHT * (numberOfMinutesPremiumNight-INITIAL_FREE_MINUTES_PREMIUM_NIGHT);
				
				System.out.println("Monthly Base Rate: " + "$" + BASE_RATE_PREMIUM);
				System.out.println();
				System.out.println("Daytime Bill:" + "$"+ callCostPremiumDay);
				System.out.println();
				System.out.println("Nighttime Bill:" + "$" + callCostPremiumNight);
				System.out.println();
				System.out.println("Total Monthly Bill: " + "$" + (BASE_RATE_PREMIUM + callCostPremiumDay + callCostPremiumNight));
			}
		}
		
		
		
	}
	

