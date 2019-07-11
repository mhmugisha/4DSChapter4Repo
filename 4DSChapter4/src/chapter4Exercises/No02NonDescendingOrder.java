//DS MALIK: Java Prog - Prob. Analysis to Prog. Design
//Chapter 4 Qn. 2 Page 221.

/*Write a program that prompts the user to input three numbers.
The program should then output the numbers in non-descending 
order*/

package chapter4Exercises;

import java.util.Scanner;

public class No02NonDescendingOrder {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
		System.out.println("Enter three integers: ");
		x = console.nextInt();
		y = console.nextInt();
		z = console.nextInt();
		
		int max1 = Math.max(x, y);
		int max2 = Math.max(max1, z);
		int min1 = Math.min(x, y);
		int min2 = Math.min(min1, z);
		int mid = (x+y+z) - (min2 + max2);
		
		System.out.println("Nos. Entered in non-descending "
				+ "order are: " + min2 + "\t" + mid + "\t" + max2);
		System.out.println();
		
		
	}

}
