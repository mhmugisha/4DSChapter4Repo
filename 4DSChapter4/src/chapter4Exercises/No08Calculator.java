
//CHAPTER 4 NUMBER 8 PAGE 222 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK

//Write a program that mimics a calculator. The program should take as input
//two integers and an arithmetic operation (+, -, *, or /) to be performed. It
//should then output the numbers, the operator, and the result. (For division,
//if the denominator is zero, output an appropriate message.) Some sample
//outputs follow:
//3 + 4 = 7
//13 * 5 = 65
//WE WILL NEED TO USE PARSING NUMERIC STRINGS (This is Mark's thinking).

package chapter4Exercises;

import java.util.Scanner;

public class No08Calculator {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter First Number: " );
		String num1 = console.next();
		
		double z = Double.parseDouble(num1);
		
		System.out.println("Enter Second Number: ");
		String num2 = console.next();
		
		double y = Double.parseDouble(num2);
		
		System.out.println( num1 +" "+ "+" +" " + num2 +" "+ "="+" " + (z+y));
		System.out.println( num1 +" "+ "/" +" " + num2 +" "+ "="+" " + (z/y));
		
		
		
		
		
	}
	
}
