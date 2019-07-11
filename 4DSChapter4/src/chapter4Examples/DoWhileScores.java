package chapter4Examples;

import java.util.Scanner;

public class DoWhileScores {

	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {

		int score;
		do {
			System.out.print("Enter a score between 12 and 36: ");
			score = console.nextInt();
			System.out.println();
		} while (score <= 12 || score >= 36);

	}
}
