package proj7b;

/*
Program: DumbCircleMath.java
Author: Mike
Date: 2-26-2015
Purpose: ...
 */

import javax.swing.*;
import java.awt.event.*;

public class DumbCircleMath extends JFrame implements ActionListener
{
	JLabel centerL = new JLabel("Center Point:");
	static JTextField centerInput = new JTextField("");
	JLabel outerL = new JLabel("Second Point:");
	static JTextField outerInput = new JTextField("");
	JLabel resultsL = new JLabel("Results:");
	static JTextArea results = new JTextArea("");
	static JScrollPane scrollResults = new JScrollPane(results);
	JButton calculate = new JButton("Calculate");
	JButton reset = new JButton("Reset");
	JButton exampleB = new JButton("Example");
	JButton exit = new JButton("Exit");
	
	static JFrame frame = null;
	
	DumbCircleMath()
	{
		this.setSize(470, 200);
		this.setLocation(400, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Circle Calculation");
		
		this.setLayout(null);
		
		centerL.setSize(100, 30);
		centerL.setLocation(10, 10);
		this.add(centerL);
		
		centerInput.setSize(100, 30);
		centerInput.setLocation(10, 40);
		this.add(centerInput);
		
		outerL.setSize(100, 30);
		outerL.setLocation(120, 10);
		this.add(outerL);
		
		outerInput.setSize(100, 30);
		outerInput.setLocation(120, 40);
		this.add(outerInput);
		
		resultsL.setSize(100, 30);
		resultsL.setLocation(230, 10);
		this.add(resultsL);
		
		results.setEditable(false);
		scrollResults.setSize(200, 105);
		scrollResults.setLocation(230, 40);
		this.add(scrollResults);
		
		calculate.setSize(100, 30);
		calculate.setLocation(10, 80);
		calculate.setMnemonic(KeyEvent.VK_C);
		calculate.addActionListener(this);
		this.add(calculate);
		
		reset.setSize(100, 30);
		reset.setLocation(120, 80);
		reset.setMnemonic(KeyEvent.VK_R);
		reset.addActionListener(this);
		this.add(reset);
		
		exampleB.setSize(100, 30);
		exampleB.setLocation(10, 115);
		exampleB.setMnemonic(KeyEvent.VK_E);
		exampleB.addActionListener(this);
		this.add(exampleB);
		
		exit.setSize(100, 30);
		exit.setLocation(120, 115);
		exit.setMnemonic(KeyEvent.VK_X);
		exit.addActionListener(this);
		this.add(exit);
	}
	
	public static void main(String[] args) 
	{
		frame = new DumbCircleMath();
		frame.setVisible(true);
	}
	
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	public static double radius(double one, double two, double three, double four)
	{
		return distance(one, two, three, four);
	}
	
	public static double circumference(double r)
	{
		
		return (Math.PI * 2) * r;
	}
	
	public static double area(double c)
	{
		return Math.PI * (c * c);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == calculate)
		{
			try
			{
				String input1String = centerInput.getText();
				String input2String = outerInput.getText();
				
				String num1String1 = input1String.substring(0, input1String.indexOf(','));
				String num1String2 = input1String.substring(input1String.indexOf(',') + 1);
				String num2String1 = input2String.substring(0, input2String.indexOf(','));
				String num2String2 = input2String.substring(input2String.indexOf(',') + 1);
				
				double centerOne = Double.parseDouble(num1String1);
				double centerTwo = Double.parseDouble(num1String2);
				double outerOne = Double.parseDouble(num2String1);
				double outerTwo = Double.parseDouble(num2String2);
				
				double distanceR = distance(centerOne, centerTwo, outerOne, outerTwo);
				double radiusR = radius(centerOne, centerTwo, outerOne, outerTwo);
				
				String resultsString = 
						"Distance: " + distanceR + '\n' +
						"Radius: " + radiusR + '\n' +
						"Circumference: " + circumference(radiusR) + '\n' +
						"Area: " + area(radiusR);
				
				results.setText(resultsString);
			}
			catch(StringIndexOutOfBoundsException sioobe)
			{
				JOptionPane.showMessageDialog(null, "Please enter a correct entry for both points." + '\n' +
						"Please press Example for help if needed.");
				centerInput.setText("");
				outerInput.setText("");
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "Please enter a number entry for both points." + '\n' +
						"Please press Example for help if needed.");
				centerInput.setText("");
				outerInput.setText("");
			}
		}
		
		else if(ae.getSource() == reset)
		{
			centerInput.setText("");
			outerInput.setText("");
			results.setText("");
		}
		
		else if(ae.getSource() == exampleB)
		{
			JOptionPane.showMessageDialog(null, "Please enter reference points as display below:" + '\n' +
					"Center Point: 0,0" + '\n' +
					"Second Point: 5,5" + '\n' +
					"You must have 2 values in each space, seperated" + '\n' +
					"by a comma.", "Entry Example", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if(ae.getSource() == exit)
		{
			System.exit(0);
		}
	}
}
