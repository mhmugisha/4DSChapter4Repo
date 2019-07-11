package chapter4Examples;

import java.util.*;

public class SwitchGradeBreak {

static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int Grade;
		System.out.println("Enter Grade: ");
		Grade = console.nextInt();
		
		switch (Grade){
		case 5:
		System.out.println("The grade is A.");
			break;
		case 4:
		System.out.println("The grade is B.");
			break;
		case 3:
		System.out.println("The grade is C.");
			break;
		case 2:
		System.out.println("The grade is D.");
			break;
		case 1:
		System.out.println("The grade is F.");
			break;
		default:
		System.out.println("The grade is invalid.");
		}
		
	
	}
	
	
}
