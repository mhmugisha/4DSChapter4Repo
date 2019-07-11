


package chapter4Examples;

import java.util.Scanner;

public class ForLoopSumAverage {
	
	static Scanner console = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int i;
		int sum;
		int newNum;
		int average;
		
		sum = 0;
		for (i = 0; i < 20; i++)
		{
		sum = sum + i;
		}
		average = sum / 5;
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + average);
		
		
		
	}

}
