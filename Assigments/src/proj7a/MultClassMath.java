package proj7a;

/*
Program: MultClassMath.java
Author: Mike
Date: 2-23-2015
Purpose: Create a program with multiple methods of varying type to receive
input from a user and perform a calculation with the input provided.
*/

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class MultClassMath extends JFrame implements ActionListener
{
	JLabel num1LBL = new JLabel("Number 1");
	JLabel num2LBL = new JLabel("Number 2");
	static JTextField num1Input = new JTextField("");
	static JTextField num2Input = new JTextField("");
	JButton addB = new JButton("Add");
	static JTextField addOut = new JTextField("");
	JButton subB = new JButton("Subtraction");
	static JTextField subOut = new JTextField("");
	JButton multB = new JButton("Multiply");
	static JTextField multOut = new JTextField("");
	JButton quotB = new JButton("Quotient");
	static JTextField quotOut = new JTextField("");
	JButton modB = new JButton("Modulus");
	static JTextField modOut = new JTextField("");
	JButton reset = new JButton("Reset");
	JButton exit = new JButton("Exit");
	
	
	static JFrame frame = null;
	
	static double num1 = 0.0;
	static double num2 = 0.0;
	static double resultA = 0.0;
	static double resultS = 0.0;
	static double resultM = 0.0;
	static int resultDQ = 0;
	static int resultDM = 0;
	static boolean divZero = false;
	static boolean quot = true;
	
	MultClassMath()
	{
		this.setSize(250, 360);
		this.setLocation(400, 200);
		this.setTitle("Multiple Class Math");
		
		this.setLayout(null);
		
		num1LBL.setSize(100, 30);
		num1LBL.setLocation(10, 10);
		this.add(num1LBL);
		
		num1Input.setSize(100, 30);
		num1Input.setLocation(10, 40);
		this.add(num1Input);
		
		num2LBL.setSize(100, 30);
		num2LBL.setLocation(120, 10);
		this.add(num2LBL);
		
		num2Input.setSize(100, 30);
		num2Input.setLocation(120, 40);
		this.add(num2Input);
		
		addB.setSize(100, 30);
		addB.setLocation(10, 80);
		addB.addActionListener(this);
		this.add(addB);
		
		addOut.setSize(100, 30);
		addOut.setLocation(120, 80);
		addOut.setEditable(false);
		addOut.setBackground(Color.white);
		this.add(addOut);
		
		subB.setSize(100, 30);
		subB.setLocation(10, 120);
		subB.addActionListener(this);
		this.add(subB);
		
		subOut.setSize(100, 30);
		subOut.setLocation(120, 120);
		subOut.setEditable(false);
		subOut.setBackground(Color.white);
		this.add(subOut);
		
		multB.setSize(100, 30);
		multB.setLocation(10, 160);
		multB.addActionListener(this);
		this.add(multB);
		
		multOut.setSize(100, 30);
		multOut.setLocation(120, 160);
		multOut.setEditable(false);
		multOut.setBackground(Color.white);
		this.add(multOut);
		
		quotB.setSize(100, 30);
		quotB.setLocation(10, 200);
		quotB.addActionListener(this);
		this.add(quotB);
		
		quotOut.setSize(100, 30);
		quotOut.setLocation(120, 200);
		quotOut.setEditable(false);
		quotOut.setBackground(Color.white);
		this.add(quotOut);
		
		modB.setSize(100, 30);
		modB.setLocation(10, 240);
		modB.addActionListener(this);
		this.add(modB);
		
		modOut.setSize(100, 30);
		modOut.setLocation(120, 240);
		modOut.setEditable(false);
		modOut.setBackground(Color.white);
		this.add(modOut);
		
		reset.setSize(100, 30);
		reset.setLocation(10, 280);
		reset.addActionListener(this);
		this.add(reset);
		
		exit.setSize(100, 30);
		exit.setLocation(120, 280);
		exit.addActionListener(this);
		this.add(exit);
	}
	
	public static void main(String[] args) 
	{
		frame = new MultClassMath();
		frame.setVisible(true);
	}

	static void add(double one, double two)
	{
		addOut.setText("" + (one + two));
	}
	
	static void subtract(double one, double two)
	{
		if(num2 <= num1)
		{
			subOut.setText("" + (one - two));
		}
		else
		{
			subOut.setText("" + (two - one));
		}
	}
	
	static double multiply(double one, double two)
	{
		return one*two;
	}
	
	static String divide(String one, String two)
	{
		int num1D = Integer.parseInt(one);
		int num2D = Integer.parseInt(two);
		
		if(quot)
		{
			return "" + num1D / num2D;
		}
		else
		{
			return "" + num1D % num2D;
		}
		//resultDQ = num1D / num2D;
		//resultDM = num1D % num2D;
		//return "Quotient: " + resultDQ + '\n' +
				//"Modulus: " + resultDM;
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			if(ae.getSource() == reset)
			{
				num1Input.setText("");
				num2Input.setText("");
				addOut.setText("");
				subOut.setText("");
				multOut.setText("");
				quotOut.setText("");
				modOut.setText("");
				
				divZero = false;
			}
			else if(ae.getSource() == addB)
			{
				String num1In = num1Input.getText();
				num1 = Double.parseDouble(num1In);
				String num2In = num2Input.getText();
				num2 = Double.parseDouble(num2In);
				
				add(num1, num2);
			}
			
			else if(ae.getSource() == subB)
			{
				String num1In = num1Input.getText();
				num1 = Double.parseDouble(num1In);
				String num2In = num2Input.getText();
				num2 = Double.parseDouble(num2In);
				
				subtract(num1, num2);
			}
			
			else if(ae.getSource() == multB)
			{
				String num1In = num1Input.getText();
				num1 = Double.parseDouble(num1In);
				String num2In = num2Input.getText();
				num2 = Double.parseDouble(num2In);
				
				multOut.setText("" + multiply(num1, num2));
			}
			
			else if(ae.getSource() == quotB)
			{
				String num1In = num1Input.getText();
				String num2In = num2Input.getText();
				num2 = Double.parseDouble(num2In);
				
				if(num2 == 0)
					divZero = true;
				
				if(!divZero)
				{
					quot = true;
					quotOut.setText("" + divide(num1In, num2In));
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "You cannot divide by zero. Please try again.");
					quotOut.setText("");
					num2Input.setText("");
					divZero = false;
				}
			}
			
			else if(ae.getSource() == modB)
			{
				String num1In = num1Input.getText();
				String num2In = num2Input.getText();
				num2 = Double.parseDouble(num2In);
				
				if(num2 == 0)
					divZero = true;
				
				if(!divZero)
				{
					quot = false;
					modOut.setText("" + divide(num1In, num2In));
				}
				
				else
				{
					JOptionPane.showMessageDialog(null, "You cannot divide by zero. Please try again.");
					quotOut.setText("");
					num2Input.setText("");
					divZero = false;
				}
			}
			/*else if(ae.getSource() == calculate)
			{
				try
				{
					
					
					add(num1, num2);
					subtract(num1, num2);
					resultM = multiply(num1, num2);
					if(num2 == 0)
						divZero = true;
					
					
					if(!divZero)
					{
						String resultAll = 
								"Results:" + '\n' +
								"Add: " + resultA + '\n' +
								"Subtract: " + resultS + '\n' +
								"Multiply: " + resultM + '\n' +
								divide(num1In, num2In);
						output.setText(resultAll);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "You cannot divide by zero. Please try again.");
						output.setText("Results:");
						num2Input.setText("");
						divZero = false;
					}
				}
			}*/
			else if(ae.getSource() == exit)
			{
				System.exit(0);
			}
		}
		catch(NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null, "Please enter a digit into both fields.");
		}
	}
}
