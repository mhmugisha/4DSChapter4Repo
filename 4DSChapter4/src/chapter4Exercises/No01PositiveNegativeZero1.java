//CHAPTER 4 NUMBER 1 PAGE 221 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK
//Write a program that prompts the user to input a number. The program
//should then output the number and a message saying whether the number is
//positive, negative, or zero.


package chapter4Exercises;

import java.util.Scanner;

public class No01PositiveNegativeZero1 {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		double num;
		
		System.out.println("Enter Number: ");
		num = console.nextDouble();
		
		if(num<0) 
			System.out.println(num +" "+ "Number is Negative");
			
			
		else if(num==0)
			System.out.println(num +" "+ "Number is Zero");
			
			
			else
				System.out.println(num + " "+ "Number is Positive");
	}
	

	
}
