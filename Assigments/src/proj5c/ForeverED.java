package proj5c;

/*
Program: ForeverED.java
Author: Mike
Date: 2-11-2015
Purpose: PROJECT 5C WITH FILE 'empData.dat'
Receive input from user of employee data and print it to a file. Must use a forever loop with
user having the option to break the loop using the keyword "quit".
*/

import java.io.*;
import javax.swing.*;


public class ForeverED 
{
	public static void main(String[] args) 
	{
		String empNum = "";
		String nameFirst = "";
		String nameLast = "";
		String department = "";
		String job = "";
		String salLvl = "";
		String welcome = "";
		
		String output = "";
		PrintWriter outFile = null;
		
		try
		{
			outFile = new PrintWriter("empData.dat");
			
			while(true)
			{
				try
				{
					welcome = "Please enter the information to be entered into the file. The information being requested \n" +
							"in order is: Employee ID Number, Employee First Name, Employee Last Name, \n" +
							"Employee's Department, Employee's Job Title, and Employee's Salary Level. \n" +
							"If you wish to quit, type QUIT at any time.";
					JOptionPane.showMessageDialog(null, welcome);
					
					empNum = JOptionPane.showInputDialog(null, "Please enter the employee's ID number.", "Employee's ID Number", JOptionPane.QUESTION_MESSAGE);
					if(empNum.equalsIgnoreCase("quit"))
						break;
					nameFirst = JOptionPane.showInputDialog("Please enter the employee's first name.");
					if(nameFirst.equalsIgnoreCase("quit"))
						break;
					nameLast = JOptionPane.showInputDialog("Please enter the employee's last name.");
					if(nameLast.equalsIgnoreCase("quit"))
						break;
					department = JOptionPane.showInputDialog("Please enter the employee's department.");
					if(department.equalsIgnoreCase("quit"))
						break;
					job = JOptionPane.showInputDialog("Please enter the employee's job title.");
					if(job.equalsIgnoreCase("quit"))
						break;
					salLvl = JOptionPane.showInputDialog("Please enter the employee's salary level.");
					if(salLvl.equalsIgnoreCase("quit"))
						break;
					
					output = empNum + " " + nameFirst + " " + nameLast + " " + department + " " + job + " " + salLvl;
					outFile.println(output);
					outFile.flush();
				}
				
				catch(NullPointerException npe)
				{
					JOptionPane.showMessageDialog(null, "Please type QUIT to exit. Please do not use the cancel button.");
				}
			}
		}
		
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File was not found. Please try again.");
		}
		
		finally
		{
			outFile.close();
		}
	}

}
