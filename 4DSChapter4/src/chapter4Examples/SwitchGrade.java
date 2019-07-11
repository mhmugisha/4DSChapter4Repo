package chapter4Examples;
//Note that entering 5 will output all the case outputs. Similarly inputting 4, will output 
// all the subsequent outputs. The problem is lack of break statements after each case. 
//This is corrected in the next example.

import java.util.*;

public class SwitchGrade {

	static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int Grade;
		System.out.println("Enter Grade: ");
		Grade = console.nextInt();
		
		switch (Grade){
		case 5:
		System.out.println("The grade is A.");
		case 4:
		System.out.println("The grade is B.");
		case 3:
		System.out.println("The grade is C.");
		case 2:
		System.out.println("The grade is D.");
		case 1:
		System.out.println("The grade is F.");
		default:
		System.out.println("The grade is invalid.");
		}
		
		
		
		
	}
}
