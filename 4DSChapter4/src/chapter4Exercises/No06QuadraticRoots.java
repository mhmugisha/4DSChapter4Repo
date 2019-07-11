
//CHAPTER 4 NUMBER 1 PAGE 221 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK
//has characters which cannot be copied here like the square root sign. 

package chapter4Exercises;

import java.util.Scanner;

public class No06QuadraticRoots {

static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int a, b, c;
		int discriminant;
		double root1;
		double root2;
		
		System.out.println("Enter the value of a: ");
		a = console.nextInt();
		System.out.println();
		
		System.out.println("Enter the value of b: ");
		b = console.nextInt();
		System.out.println();
		
		System.out.println("Enter the value of c: ");
		c = console.nextInt();
		System.out.println();
		 
		discriminant = b*b - 4*a*c;
		root1 = (-b + Math.sqrt(discriminant))/(2*a);
		root2 = (-b- Math.sqrt(discriminant))/(2*a);
		
		if(discriminant == 0)
			System.out.println("The equation has a single, repeated root.");
		else 
			if (discriminant < 0)
				System.out.println("The equation has two complex roots.");
			else if (discriminant >= 0)
				System.out.println("The equation has two real roots.\n" + "The roots are:\n" +
			       "First Root = " + root1  +"," + "\n" + "Second Root = "  + root2);

	}
	
	
}
