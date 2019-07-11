package chapter4Examples;

import java.util.Scanner;

public class NestedIfGPA {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		double GPA;
		
			System.out.println("Enter GPA:");
			GPA = console.nextDouble();
			
			if (GPA >= 2.0) 
				if (GPA >= 3.9) 
				System.out.println("Dean\'s Honor List."); 
				else 
				System.out.println("Current GPA below graduation "
				+ "requirement." +
				"\nSee your academic advisor.");
			
	}
}
