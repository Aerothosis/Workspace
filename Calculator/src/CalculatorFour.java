/*
Fourth attempt with Calculator. This attempt brings in entering all inputs on one line, then calculates
and provides the results.
*/

import java.util.*;
import javax.swing.JOptionPane;

public class CalculatorFour
{
	public static double num1 = 0.0;
	public static double num2 = 0.0;
	public static String num1String = "";
	public static String num2String = "";
	public static int num3 = 0;
	public static double result = 0.0;
	//public static int mMOption = 7;
	public static String mMString = "";
	public static Scanner console = new Scanner (System.in);
	
	public static void main(String[] args)
	{
		mainMenu();
	}
	
	public static void mainMenu()
	{
		String mMStringOne = "Enter your equation. Example: '5*5'" + '\n' +
			"Options are:" + '\n' +
			"*   = Multiply" + '\n' +
			"/   = Divide" + '\n' +
			"+   = Add" + '\n' +
			"-   = Subtract" + '\n' +
			"^   = Squared" + '\n' +
			"@   = Square Root" + '\n' +
			"=   = Reset Calculator" + '\n' +
			";   = Exit Calculator";
		try
		{
			if (result == 0)
			{
				//mMString = "";
				mMString = JOptionPane.showInputDialog(null, mMStringOne, "Math", JOptionPane.QUESTION_MESSAGE);
			}
			else if (result != 0)
			{
				//mMString = "";
				mMString = JOptionPane.showInputDialog(null, mMStringOne + '\n' + "Current result is " + result, "result", JOptionPane.QUESTION_MESSAGE);
			}
			
			if ((mMString.indexOf ('*')) >= 0)
			{
				multiply();
			}
			
			if ((mMString.indexOf ('/')) >= 0)
			{
				divide();
			}
			
			if ((mMString.indexOf ('+')) >= 0)
			{
				addition();
			}
			
			if ((mMString.indexOf ('-')) >= 0)
			{
				subtraction();
			}
			
			if ((mMString.indexOf ('^')) >= 0)
			{
				squared();
			}
			if ((mMString.indexOf ('@')) == 0)
			{
				squareRoot();
			}
			if ((mMString.indexOf ('@')) > 0)
			{
				JOptionPane.showMessageDialog(null, "Please enter square root like: @5 ", "Square Root Error", JOptionPane.WARNING_MESSAGE);
			}
			if ((mMString.indexOf ('=')) == 0)
			{
				reset();
			}
			if ((mMString.indexOf (';')) == 0)
			{
				exitCalc();
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Please enter a valid option.", "Entry Error", JOptionPane.WARNING_MESSAGE);
				mainMenu();
			}
			
			/*	
			if (mMOptionTwo == '8')
			{
				JOptionPane.showMessageDialog(null, "Current results are: " + result,
					"Current Results", JOptionPane.INFORMATION_MESSAGE);
				mMOption = 7;
				mainMenu();				
			}
			
			if (mMOptionTwo < '*' || mMOptionTwo > '9')
			{
				JOptionPane.showMessageDialog(null, "You have entered an incorrect value. Please try again.",
					"Error", JOptionPane.WARNING_MESSAGE);
				mainMenu();
			}*/
		}
		
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "You entered an input that is not allowed. Please try again.",
				"Error Message", JOptionPane.WARNING_MESSAGE);
			mMString = "";
			mainMenu();
		}
	}
	
	public static void reset()
	{
		num1 = 0.0;
		num2 = 0.0;
		num3 = 0;
		result = 0.0;
		JOptionPane.showMessageDialog(null, "Calculator has been reset.", 
			"Calculator Reset", JOptionPane.INFORMATION_MESSAGE);
		mMString = "";
		mainMenu();
	}
	
	public static void exitCalc()
	{
		JOptionPane.showMessageDialog(null, "Calculator will now exit. Good bye.",
			"Calculator Closing...", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
	
	public static void multiply()
	{
		if (result == 0)
		{
			num1String = mMString.substring(0, mMString.indexOf('*'));
			num2String = mMString.substring(mMString.indexOf('*') + 1);
			num1 = Double.parseDouble(num1String);
			num2 = Double.parseDouble(num2String);
			result = num1 * num2;
		}
		else if (result != 0)
		{
			num2String = mMString.substring(mMString.indexOf('*') + 1);
			num1 = result;
			num2 = Double.parseDouble(num2String);
			result = num1 * num2;
		}
		
		mMString = "";
		mainMenu();
	}
	
	public static void divide()
	{
		if (result == 0)
		{
			num1String = mMString.substring(0, mMString.indexOf('/'));
			num2String = mMString.substring(mMString.indexOf('/') + 1);
			num1 = Double.parseDouble(num1String);
			num2 = Double.parseDouble(num2String);
			result = num1 / num2;
		}
		else if (result != 0)
		{
			num2String = mMString.substring(mMString.indexOf('/') + 1);
			num1 = result;
			num2 = Double.parseDouble(num2String);
			result = num1 / num2;
		}
		
		mMString = "";
		mainMenu();
	}
	
	public static void addition()
	{
		if (result == 0)
		{
			num1String = mMString.substring(0, mMString.indexOf('+'));
			num2String = mMString.substring(mMString.indexOf('+') + 1);
			num1 = Double.parseDouble(num1String);
			num2 = Double.parseDouble(num2String);
			result = num1 + num2;
		}
		else if (result != 0)
		{
			num2String = mMString.substring(mMString.indexOf('+') + 1);
			num1 = result;
			num2 = Double.parseDouble(num2String);
			result = num1 + num2;
		}
		
		mMString = "";
		mainMenu();
	}
	
	public static void subtraction()
	{
		if (result == 0)
		{
			num1String = mMString.substring(0, mMString.indexOf('-'));
			num2String = mMString.substring(mMString.indexOf('-') + 1);
			num1 = Double.parseDouble(num1String);
			num2 = Double.parseDouble(num2String);
			result = num1 - num2;
		}
		else if (result != 0)
		{
			num2String = mMString.substring(mMString.indexOf('-') + 1);
			num1 = result;
			num2 = Double.parseDouble(num2String);
			result = num1 - num2;
		}
		
		mMString = "";
		mainMenu();
	}
	
	public static void squared()
	{
		if (result == 0)
		{
			num1String = mMString.substring(0, mMString.indexOf('^'));
			num2String = mMString.substring(mMString.indexOf('^') + 1);
			num1 = Double.parseDouble(num1String);
			num2 = Double.parseDouble(num2String);
			result = Math.pow(num1, num2);
		}
		else if (result != 0)
		{
			num2String = mMString.substring(mMString.indexOf('^') + 1);
			num1 = result;
			num2 = Double.parseDouble(num2String);
			result = Math.pow(num1, num2);
		}
		
		mMString = "";
		mainMenu();
	}
	
	public static void squareRoot()
	{
		if (result == 0)
		{
			num1String = mMString.substring(mMString.indexOf('@') + 1);
			num1 = Double.parseDouble(num1String);
			result = Math.sqrt(num1);
		}
		else if (result != 0)
		{
			num1 = result;
			result = Math.sqrt(num1);
		}
		
		mMString = "";
		mainMenu();
		
	}
}