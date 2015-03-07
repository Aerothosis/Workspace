package lab6aDue12FEB;

/*
 Program: NameEcho.java
 Author: Mike
 Date: 2-9-2015
 Purpose: Receive input from user of names, then echo names back at the end. Program
 will end if user inputs "quit".
 */

import javax.swing.*;

public class NameEcho 
{
	public static void main(String[] args) 
	{
		final String END = "quit";
		String welcome = "Please enter a name. If you wish to quit, please type QUIT";
		String input = "";
		int tester = 0;
		
		
		while(!(input.equalsIgnoreCase(END)))
		{
			input = JOptionPane.showInputDialog(null, welcome, "Enter a Name", JOptionPane.QUESTION_MESSAGE);
			tester = input.charAt(0);
			if(tester <= 0)
				break;
			if(input.equalsIgnoreCase(END))
				break;
			JOptionPane.showMessageDialog(null, "You entered " + input);
		}
	}
}