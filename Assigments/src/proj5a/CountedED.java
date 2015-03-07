package proj5a;

/*
Program: CountedED.java
Author: Mike
Date: 2-11-2015
Purpose: PROJECT 5A  Use a file and pull information on the first 5 employees from the file. Display
the information pulled in an easy to read format.
*/

import java.io.*;
import java.util.*;
import java.text.*;

public class CountedED 
{
	public static void main(String[] args) 
	{
		int empNum = 0;
		char status = 'z'; //S for single is only option
		int exemption = 0;
		char classification = 'z';  // either h for hourly or s for salary
		double hours = 0.0; //only used for hourly
		double payRate = 0.0; //only used for hourly 
		int salary = 0; //only used for salary
		String output = "";
		DecimalFormat money = new DecimalFormat("#0.00");
		DecimalFormat exmp = new DecimalFormat("00");
		Scanner inFile = null;
		
		try 
		{
			inFile = new Scanner(new FileReader("employeeData.dat"));
			
			System.out.println("The data for the first five employees is below.\n");
			System.out.println("Employee  Filing  Exemptions  Classification  Hours  Pay   Salary \n" +
							   "Number    Status                                     Rate");
			 
			for(int count = 1; count <= 5; count++)
			{
				empNum = inFile.nextInt();
				status = inFile.next().charAt(0);
				exemption = inFile.nextInt();
				classification = inFile.next().toLowerCase().charAt(0);
				hours = inFile.nextDouble();
				payRate = inFile.nextDouble();
				salary = inFile.nextInt();

				output = empNum + "        " + status + "         " + exmp.format(exemption) + "            " + classification + 
						"         " + money.format(hours) + "  " + money.format(payRate) + "    " + salary;
				
				System.out.println(output);
			}
		}
		catch (FileNotFoundException fnfe) 
		{
			System.out.println("FNFE");
		}
		finally
		{
			inFile.close();
		}
	}
}


/*
The data for the first five employees is below.

Employee  Filing  Exemptions  Classification  Hours  Pay   Salary 
Number    Status                                     Rate
1001        s         11            h         40.00  15.35    0
1002        s         10            h         38.00  15.00    0
1003        s         09            h         26.45  45.00    0
1004        s         08            h         20.00  39.15    0
1005        s         07            h         37.15  20.00    0
*/