package chapter4Examples;

import java.util.Scanner;

public class ClassifyNumbersOddEvenZero {

	static Scanner console = new Scanner(System.in);
	static final int N = 20;
	
	public static void main(String[] args)
	{
		
		int count;
		int number;
		
		int zeros = 0;
		int evens = 0;
		int odds = 0;
	
		
		System.out.println("Please enter " + N
				+ " integers, positive, "
				+ "negative, or zeros.");
	for(count = 1; count<=20; count++)
	{
		number = console.nextInt();
		System.out.print(number + " ");
		
		if(number%2 == 0)
		 {evens++;
		 if(number == 0)
				zeros++;}
		else
		  odds++;
		}
	System.out.println();
	
	System.out.println("There are " + evens + " evens, "+ "which also includes "
	+ zeros + " zero(s)");
	System.out.println("Total number of odds is: " + odds);
	
	}
		
}
	

