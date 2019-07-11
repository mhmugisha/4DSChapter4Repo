//CHAPTER 4 NUMBER 3 PAGE 221 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK
/*Write a program that prompts the user to input an integer between 0 and 35.
If the number is less than or equal to 9, the program should output the
number; otherwise, it should output A for 10, B for 11, C for 12, . . ., and Z
for 35. (Hint: Use the cast operator, (char)( ), for numbers >= 10.)*/


package chapter4Exercises;

import java.util.Scanner;

public class No03FromDigitsToCharacter {
	
	static Scanner console = new Scanner(System.in);
	static final int DIFFERENCE = 55;
	public static void main(String[] args){
		
		int num;
		
		System.out.println("Enter integer between 0 and 100 inclusive: ");
		num = console.nextInt();
		
		if (num<=9)
			System.out.println("The integer you entered is:" + " " + num);
		
		else if (num<=200)
		System.out.println("Collating Sequence Character is:" + " " + (char)(num + DIFFERENCE ));
		
		else 
			System.out.println("Number out of range!!!");
	
	}
	

}
