package chapter4Examples;
// Program to evaluate absolute value on page 181 DS Malik

import javax.swing.JOptionPane;

public class AbsoluteValue {
	
	public static void main(String[] args) {
		int number;
		int temp;
		
		String numString;
		numString = JOptionPane.showInputDialog("Enter an Integer");
		
		number = Integer.parseInt(numString);
		temp = number;
		
		if (number<0)
			number = -number;
		
		JOptionPane.showMessageDialog(null, "The absolute value of" +" " + temp + " " + "is" + " " +number, "Absolute Value", JOptionPane.INFORMATION_MESSAGE);
	System.exit(0);	
	}
}
