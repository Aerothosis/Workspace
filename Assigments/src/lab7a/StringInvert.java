package lab7a;

/*
Program: StringInvert.java
Author: Mike
Date: 2-12-2015
Purpose: "Write a GUI program to convert all lower case letters in a string to upper case letters,
and vice-versa. For example, Alb34eRt will be converted to aLB34ErT."
Convert letters in a string to upper or lower case (opposite of current case).
*/

import java.awt.event.*;
import javax.swing.*;


public class StringInvert extends JFrame implements ActionListener, ItemListener
{
	private JLabel output = new JLabel("Output");
	private JTextField input = new JTextField("Enter string to be converted");
	private JButton reset = new JButton("Reset");
	private JButton exit = new JButton("Exit");
	private JRadioButton upper = new JRadioButton("To Upper");
	private JRadioButton lower = new JRadioButton("To Lower");
	private JRadioButton invert = new JRadioButton("Invert All");
	private ButtonGroup group = new ButtonGroup();
	
	static JFrame frame = null;
	
	String orig = "";
	String origF = "";
	char origC = 'z';
	int origL = 0;
	int count = 0;
	
	
	StringInvert()
	{
		this.setSize(510, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 200);
		this.setTitle("String Inversion");
		
		this.setLayout(null);
		
		input.setSize(170, 50);
		input.setLocation(10, 20);
		this.add(input);
		
		output.setSize(300, 50);
		output.setLocation(200, 20);
		this.add(output);
		
		upper.setSize(80, 50);
		upper.setLocation(100, 80);
		upper.addItemListener(this);
		this.add(upper);
		group.add(upper);
		
		lower.setSize(80, 50);
		lower.setLocation(185, 80);
		lower.addItemListener(this);
		this.add(lower);
		group.add(lower);
		
		invert.setSize(80, 50);
		invert.setLocation(270, 80);
		invert.addItemListener(this);
		this.add(invert);
		group.add(invert);
		
		reset.setSize(80, 40);
		reset.setLocation(150, 150);
		reset.addActionListener(this);
		this.add(reset);
		
		exit.setSize(80, 40);
		exit.setLocation(240, 150);
		exit.addActionListener(this);
		this.add(exit);
	}
	
	
	public static void main(String[] args) 
	{
		frame = new StringInvert();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == reset)
		{
			input.setText("");
			output.setText("");
		}
		else if (ae.getSource() == exit)
		{
			System.exit(0);
		}
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == upper)
		{
			orig = input.getText();
			origL = orig.length();
			while (count < origL)
			{
				origC = orig.charAt(count);
				
				if(origC >= 'a' && origC <= 'z')
				{
					origC = Character.toUpperCase(origC);
					origF += origC;
				}
				else
				{
					origF += origC;
				}
				
				count++;
			}
			output.setText(origF);
			count = 0;
			origF = "";
		}
		else if(ie.getSource() == lower)
		{
			orig = input.getText();
			origL = orig.length();
			while (count < origL)
			{
				origC = orig.charAt(count);
				
				if (origC >= 'A' && origC <= 'Z')
				{
					origC = Character.toLowerCase(origC);
					origF += origC;
				}
				else
				{
					origF += origC;
				}
				
				count++;
			}
			output.setText(origF);
			count = 0;
			origF = "";
		}
		else if(ie.getSource() == invert)
		{
			orig = input.getText();
			origL = orig.length();
			
			while (count < origL)
			{
				origC = orig.charAt(count);
				
				if(origC >= 'a' && origC <= 'z')
				{
					origC = Character.toUpperCase(origC);
					origF += origC;
				}
				else if (origC >= 'A' && origC <= 'Z')
				{
					origC = Character.toLowerCase(origC);
					origF += origC;
				}
				else
				{
					origF += origC;
				}
				
				count++;
			}
			output.setText(origF);
			count = 0;
			origF = "";
		}
	}

}
