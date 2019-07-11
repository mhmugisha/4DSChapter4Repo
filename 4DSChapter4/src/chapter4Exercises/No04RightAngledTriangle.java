//CHAPTER 4 NUMBER 4 PAGE 221 - FROM PROB. ANALYSIS TO PROG. DESIGN - D.S. MALIK
//In a right triangle, the square of the length of one side is equal to the sum of
//the squares of the lengths of the other two sides. Write a program that
//prompts the user to enter the lengths of three sides of a triangle and then
//outputs a message indicating whether the triangle is a right triangle.

package chapter4Exercises;

import java.util.Scanner;

public class No04RightAngledTriangle {

static Scanner console = new Scanner(System.in);

public static void main(String[] args){
	
	int base;
	int height;
	int hypo;
	int squareSumSides;
	int squareOtherSide;
	
	//Input to console
	System.out.println("Enter base: ");
	base = console.nextInt();
	
	System.out.println("Enter height: ");
	height = console.nextInt();
	
	System.out.println("Enter hypo: ");
	hypo = console.nextInt();
	
	//calculations
	squareSumSides = base*base + height*height;
	squareOtherSide = hypo*hypo;
	
	if (squareSumSides == squareOtherSide)
		System.out.println("Wow!!The Triangle is Right Angled.");
	else System.out.println("Sorry!! The Triangle is not Right Angled.");
	
}



}

