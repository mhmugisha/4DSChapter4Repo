//CHAPTER 4 NUMBER 9 PAGE 222 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK

//Redo Exercise 8 to handle floating-point numbers. (Format your output to
//two decimal places.)

package chapter4Exercises;

import java.util.Scanner;

public class No09FloatingPoints {

static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String num1;
		String num2;
		
		System.out.println("Enter First Floating point No: " );
		num1 = console.next();
		
		float z = Float.parseFloat(num1);
		
		
		System.out.println("Enter Second Floating point No: ");
		num2 = console.next();
		
		float y = Float.parseFloat(num2);
		
		System.out.printf( num1 +" "+ "+" +" " + num2 +" "+ "="+" " + (z+y));
		System.out.println( num1 +" "+ "/" +" " + num2 +" "+ "="+" " + (z/y));
		
		
	}
	
	
}
