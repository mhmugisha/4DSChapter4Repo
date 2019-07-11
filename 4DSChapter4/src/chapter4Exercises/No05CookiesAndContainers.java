
//CHAPTER 4 NUMBER 5 PAGE 221 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK

/*A box of cookies can hold 24 cookies and a container can hold 75 boxes
of cookies. Write a program that prompts the user to enter the total
number of cookies. The program then outputs the number of boxes and
the number of containers to ship the cookies. Note that each box must
contain the specified number of cookies and each container must contain
the specified number of boxes. If the last box of cookies contains less
than the number of specified cookies, you can discard it, and output
the number of leftover cookies. Similarly, if the last container contains
less than the number of specified boxes, you can discard it, and output
the number of leftover boxes.*/


package chapter4Exercises;

import java.util.*;

public class No05CookiesAndContainers {

	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numberOfCookies;
		int numberOfBoxes;
		int numberOfContainers;
		int leftOverCookies;
		int leftOverBoxes;
		
		System.out.println("Enter number of cookies:");
		numberOfCookies = console.nextInt();
		System.out.println();
		
		numberOfBoxes = numberOfCookies/24;
		numberOfContainers = numberOfBoxes/75;
		leftOverCookies = numberOfCookies%24;
		leftOverBoxes = numberOfBoxes%75;
		
		System.out.println("Number of Boxes: " + numberOfBoxes);
		System.out.println();
		System.out.println("Number of Containers: " + numberOfContainers);
		System.out.println();
		System.out.println("Number of Leftover Cookies: " + leftOverCookies);
		System.out.println();
		System.out.println("Number of Leftover Boxes: " + leftOverBoxes);
		System.out.println();
	}
	
}
