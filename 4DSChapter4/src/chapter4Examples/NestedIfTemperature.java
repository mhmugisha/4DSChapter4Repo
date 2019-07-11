package chapter4Examples;

import java.util.Scanner;

public class NestedIfTemperature {

static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double temperature;
			System.out.println("Enter Temperature:");
			temperature = console.nextDouble();
		
		if (temperature >= 50) 
			if (temperature >= 80)// Note that this line and the one that follows are the  
			System.out.println("Good day for swimming.");//statement part of if in line 14.
			
			else //This else is paired with immediate if above in line 15. 
			System.out.println("Good day for golfing."); 
		else //This else is paired with the first if in line 14.
			System.out.println("Good day to play tennis."); 
	}
}
