/*
Program: Calculator.java
Author: Mike
Date: 1-29-2015
Purpose: This program creates a simple calculator that will allow the user to enter two numbers and
	an arithmetic operation. It will perform that operation and report the result. In the case of
	division, it will check for division by 0 and report an error if divide by zero is attempted.
*/

import javax.swing.JOptionPane;

public class Calculator 
{
	public static void main(String[] args) 
	{
		String welcome = "This application is a simple calculator. You will be prompted to \n" +
				"enter two numbers and an operation. You will be prompted a for add, s for subtract \n" +
				"m for multiply, or d for division. For division, the program will check for \n" +
				"division by zero which is impossible.";
		JOptionPane.showMessageDialog(null,  welcome);
		
		double num1 = 0.0;
		double num2 = 0.0;
		double result = 0.0;
		char operation = 'z';
		
		try
		{
			String input = JOptionPane.showInputDialog("Enter a number.");
			num1 = Double.parseDouble(input);
			
			input = JOptionPane.showInputDialog("Enter a number.");
			num2 = Double.parseDouble(input);
			
			operation = JOptionPane.showInputDialog(null, "Enter a for add, s for subtract, d for divide, m for multiplication.", 
					"Operation Entry", JOptionPane.QUESTION_MESSAGE).charAt(0);
			
			switch(operation)
			{
				case 'a':
				case 'A':
					result = num1 + num2;
					break;
				case 's':
				case 'S':
					result = num1 - num2;
					break;
				case 'm':
				case 'M':
					result = num1 * num2;
					break;
				case 'd':
				case 'D':	
					if (num2 == 0)
					{
						JOptionPane.showMessageDialog(null, "You cannot divide by zero, the program will now close.", "Error", JOptionPane.ERROR_MESSAGE);
						System.exit(0);
					}
					else
					{
						result = num1 / num2;
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "You have entered something that is not allowed. \n Please try again.", "Error", JOptionPane.WARNING_MESSAGE);
			}
			
			JOptionPane.showMessageDialog(null, "Your result is: " + result, "Result", JOptionPane.INFORMATION_MESSAGE);
		}
		
		catch (NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null, "Please report " + nfe.toString());
		}
		
		finally
		{
			System.exit(0);
		}
	}
}
