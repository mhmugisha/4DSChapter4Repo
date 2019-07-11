package chapter4Examples;

import java.util.Scanner;

public class ClassifyNumbersMalik {
	static Scanner console = new Scanner(System.in);
	static final int N = 20;

	public static void main(String[] args) {
		
		// Declare the variables
		int counter; // loop control variable
		int number; 
		int zeros = 0; 
		int odds = 0; 
		int evens = 0; 
		System.out.println("Please enter " + N + " integers, positive, " + "negative, or zeros."); // Step 2
		for (counter = 1; counter <= N; counter++) 
		{
			number = console.nextInt(); 
			System.out.print(number + " "); 
			
			switch (number % 2) {
			case 0:
				evens++;
				if (number == 0)
					zeros++;
				break;
			case 1:
			case -1:
				odds++;
			}// end switch
		}

		System.out.println();
		System.out.println("There are " + evens + " evens, " + "which also includes " + zeros + " zeros");
		System.out.println("Total number of odds is: " + odds);
	}

}
