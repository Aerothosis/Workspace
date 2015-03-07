package feb11;

/*
Write a program that prompts the user to input an integer and then outputs
both the individual digits of the number and the sum of the digits. 
For example, the program should: 
output the individual digits of 3456 as 3 4 5 6 and the sum as 18,
output the individual digits of 8030 as 8 0 3 0 and the sum as 11, 
output the individual digits of 2345526 as 2 3 4 5 5 2 6 and the sum as 27,
output the individual digits of 4000 as 4 0 0 0 and the sum as 4,
output the individual digits of -2345 as 2 3 4 5 and the sum as 14.
 */

import javax.swing.*;

public class DigitsSumDigits 
{
	public static void main(String[] args) 
	{
		String output = "";
		int outputNum = 0;
		
		outer:
		while(true)
		{
			while(true)
			{
				try
				{
					String numberString = JOptionPane.showInputDialog("Enter a whole number or you may click cancel or kill or " +
							"enter the word QUIT to stop.");
					if (numberString == null || numberString.equalsIgnoreCase("quit"))
					{
						break outer;
					}
					int length = numberString.length();
					
					for(int count = 0; count < length; count++)
					{
						char currentChar = numberString.charAt(count);
						
						if (currentChar != '-')
						{
							int currentNumber = Character.getNumericValue(currentChar);
							output += currentNumber + " ";
							outputNum += currentNumber;
						}
					}
				
				JOptionPane.showMessageDialog(null, output + ". Sum is " + outputNum);
				}
				catch(NullPointerException npe)
				{
					JOptionPane.showMessageDialog(null, "Please do not click cancel or kill without entering a value.");
				}
			}
		}
	}
}
