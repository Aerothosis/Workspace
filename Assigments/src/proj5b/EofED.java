package proj5b;

/*
Program: EofED.java
Author: Mike
Date: 2-11-2015
Purpose: PROJECT 5B  Calculate weekly gross pay for each employee 
and display in a meaningful way.
*/

import java.io.*;
import java.text.*;
import java.util.*;

public class EofED 
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
		double grossPay = 0.0;
		String output = "";
		DecimalFormat money = new DecimalFormat("$#0.00");
		DecimalFormat hoursF = new DecimalFormat("#00.00");
		DecimalFormat exmp = new DecimalFormat("00");
		Scanner inFile = null;
		//Scanner inFilePay = null;
		//PrintWriter outFile = null;
		
		try
		{
			inFile = new Scanner(new FileReader("employeeData.dat"));
			//outFile = new PrintWriter("employeePay.dat");
			//inFile = new Scanner(new FileReader("employeePay.dar"));
			
			System.out.println("The entirety of the employeeData.dat file is below:\n");
			System.out.println("Employee  Filing  Exemptions  Classification  Hours  Pay       Salary   Gross\n" +
					   "Number    Status                                     Rate               Pay");
			
			while(inFile.hasNext())
			{
				empNum = inFile.nextInt();
				status = inFile.next().charAt(0);
				exemption = inFile.nextInt();
				classification = inFile.next().toLowerCase().charAt(0);
				hours = inFile.nextDouble();
				payRate = inFile.nextDouble();
				salary = inFile.nextInt();
				
				if(classification == 'h')
				{
					if(hours > 40)
					{
						grossPay = (hours-40) * (payRate * 1.5) + (40 * payRate);
						//System.out.println(grossPay);
					}
					else
					{
						grossPay = hours * payRate;
						//System.out.println(grossPay);
					}
				}
				else if (classification == 's')
				{
					grossPay = salary;
					//System.out.println(grossPay);
				}
				
				output = empNum + "        " + status + "         " + exmp.format(exemption) + "            " + classification + 
						"         " + hoursF.format(hours) + "  " + money.format(payRate) + "    " + money.format(salary) +
						"   " + money.format(grossPay);
				System.out.println(output);
			}
		}
		catch(FileNotFoundException nffe)
		{
			System.out.println("Employee file not found. Please make sure your file is in the correct location.");
		}
	}
}

/*
The entirety of the employeeData.dat file is below:

Employee  Filing  Exemptions  Classification  Hours  Pay       Salary   Gross
Number    Status                                     Rate               Pay
1001        s         11            h         40.00  $15.35    $0.00   $614.00
1002        s         10            h         38.00  $15.00    $0.00   $570.00
1003        s         09            h         26.45  $45.00    $0.00   $1190.25
1004        s         08            h         20.00  $39.15    $0.00   $783.00
1005        s         07            h         37.15  $20.00    $0.00   $743.00
1006        s         06            h         55.35  $20.00    $0.00   $1260.50
1007        s         05            h         53.30  $20.00    $0.00   $1199.00
1008        s         04            s         00.00  $0.00    $1430.00   $1430.00
1009        s         03            s         00.00  $0.00    $1389.00   $1389.00
1010        s         02            s         00.00  $0.00    $1777.00   $1777.00
*/
