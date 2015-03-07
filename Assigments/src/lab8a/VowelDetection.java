package lab8a;

/*
Program: VowelDetection.java
Author: Mike
Date: 2-25-2015
Purpose: Allow the user to input a string. Once the user presses Calculate, the program will display how many
vowels were preset in the string. The user can press the reset button to test a new string.
*/


import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;


public class VowelDetection extends JFrame implements ActionListener
{
	JLabel inputL = new JLabel("Input");
	static JTextField input = new JTextField("");
	JLabel outputL = new JLabel("Output");
	static JTextField output = new JTextField("");
	JButton calculate = new JButton("Calculate");
	JButton reset = new JButton("Reset");
	
	static JFrame frame = null;
	
	VowelDetection()
	{
		this.setSize(250, 200);
		this.setLocation(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Vowel Detection");
		
		this.setLayout(null);
		
		inputL.setSize(100, 35);
		inputL.setLocation(10, 10);
		this.add(inputL);
		
		input.setSize(100, 35);
		input.setLocation(10, 45);
		this.add(input);
		
		outputL.setSize(100, 35);
		outputL.setLocation(120, 10);
		this.add(outputL);
		
		output.setSize(100, 35);
		output.setLocation(120, 45);
		output.setEditable(false);
		output.setBackground(Color.white);
		this.add(output);
		
		calculate.setSize(100, 35);
		calculate.setLocation(10, 90);
		calculate.addActionListener(this);
		this.add(calculate);
		
		reset.setSize(100, 35);
		reset.setLocation(120, 90);
		reset.addActionListener(this);
		this.add(reset);
	}
	
	public static void main(String[] args) 
	{
		frame = new VowelDetection();
		frame.setVisible(true);
	}
	
	static boolean isVowel(char letter)
	{
		switch(letter)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
			default:
				return false;
		}
	}
	//

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == calculate)
		{
			int count = 0;
			int vowelCount = 0;
			String inputS = input.getText();
			
			while(count < inputS.length())
			{
				if (isVowel(inputS.charAt(count)))
				{
					vowelCount++;
				}
				
				count++;
			}
			
			output.setText("" + vowelCount);
		}
		else if(ae.getSource() == reset)
		{
			input.setText("");
			output.setText("");
		}
	}
}
