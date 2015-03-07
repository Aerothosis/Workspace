/*
 Program: AccountBalance.java
 Author: Mike
 Date: 2-4-2015
 Purpose: Receive input from user of account number, type of account, and beginning balance of
 account. Then display any interest or fees received based upon balance. 
 */

import javax.swing.*;
import java.text.*;


public class AccountBalance 
{
	public static void main(String[] args) 
	{
		int account = 0;
		char accountType = 'z';
		double beginBal = 0.0;
		double endBal = 0.0;
		String results = "";
		
		DecimalFormat money = new DecimalFormat("$#,##0.00");
		
		
		String welcome = "You will be asked to enter your account number, type of account, \n" +
				"and beginning balance of your account. Please ensure account \n" +
				"number is a whole number, type of account is a single letter, \n" +
				"and beginning balance is accurate.";
		String accountTypeS = "Please enter your account type. Options are: \n" +
				"s  = Savings \n" +
				"c  = Checking";
		
		JOptionPane.showMessageDialog(null, welcome);
		
		try
		{
			String accountS = JOptionPane.showInputDialog(null, "Please enter your account number.", 
					"Account Number", JOptionPane.QUESTION_MESSAGE);
			account = Integer.parseInt(accountS);
		
			accountType = JOptionPane.showInputDialog(null, accountTypeS, "Account Type",
					JOptionPane.QUESTION_MESSAGE).charAt(0);
			accountType = Character.toLowerCase(accountType);
			
			String beginBalS = JOptionPane.showInputDialog(null, "Please enter your beginning balance.",
					"Beginning Balance", JOptionPane.QUESTION_MESSAGE);
			beginBal = Double.parseDouble(beginBalS);
			
			
			if (accountType == 's')
			{
				accountTypeS = "Savings";
				
				if (beginBal >= 1000)
				{
					endBal = beginBal + (beginBal * 0.04);
					results = "You have earned 4% interest.";
				}
				else
				{
					endBal = beginBal - 10;
					results = "You were charged $10.00.";
				}
			}
			
			else if (accountType == 'c')
			{
				accountTypeS = "Checking";
				
				if (beginBal >= 5000)
				{
					endBal = beginBal + (beginBal * 0.05);
					results = "You have earned 5% interest.";
				}
				else if (beginBal >= 1000 && beginBal < 5000)
				{
					endBal = beginBal + (beginBal * 0.03);
					results = "You have earned 3% interest.";
				}
				else
				{
					endBal = beginBal - 25;
					results = "You were charged $25.00";
				}
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "You have entered an invalid account option." +
						"Please try again.", "Error", JOptionPane.WARNING_MESSAGE);
			}
			
			String total = "You have entered " + account + " as your account number.\n" +
					"The selected account is a " + accountTypeS + " account. \n" +
					"You entered " + money.format(beginBal) + " as your beginning balance. \n" +
					results + '\n' + "Your ending balance is " + money.format(endBal);
			
			JOptionPane.showMessageDialog(null, total, "Ending Statement", JOptionPane.INFORMATION_MESSAGE);
		}
		
		catch(NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null, "Your input is invalid. Please try again.");
		}
		catch(IndexOutOfBoundsException ioobe)
		{
			JOptionPane.showMessageDialog(null, "You have entered an invalid option for your account type. Please try again.");
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, "Your input is invalid. Please try again.");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, "Your input is invalid. Please try again.");
		}
	}

}
