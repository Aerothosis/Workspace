package lab8b;

/*
Program: TaxConsulting.java
Author: Mike
Date: 2-25-2015
Purpose: Allow user to input consulting duration, consulting cost per hour, and if
user is low income or not. Provide user the cost of the consulting time.
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;

public class TaxConsulting extends JFrame implements ActionListener, ItemListener
{
	JLabel rate = new JLabel("Hourly Rate");
	static JTextField rateInput = new JTextField("");
	JLabel time = new JLabel("Consulting Duration");
	static JTextField timeInput = new JTextField("");
	JLabel lowIncome = new JLabel("Check if low income");
	static JCheckBox lowIncomeC = new JCheckBox("");
	JLabel totalCosts = new JLabel("Total Costs");
	static JTextField totalOutput = new JTextField("");
	JButton calculate = new JButton("Calculate");
	JButton reset = new JButton("Reset");
	
	static JFrame frame = null;
	
	static boolean checkBox = false;
	static boolean lowIn = false;
	DecimalFormat money = new DecimalFormat("$#,##0.00");
	
	TaxConsulting()
	{
		this.setSize(400, 250);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Tax Consulting Costs");
		
		this.setLayout(null);
		
		rate.setSize(100, 35);
		rate.setLocation(10, 10);
		this.add(rate);
		
		rateInput.setSize(100, 35);
		rateInput.setLocation(10, 50);
		this.add(rateInput);
		
		time.setSize(120, 35);
		time.setLocation(120, 10);
		this.add(time);
		
		timeInput.setSize(120, 35);
		timeInput.setLocation(120, 50);
		this.add(timeInput);
		
		lowIncome.setSize(140, 35);
		lowIncome.setLocation(250, 10);
		this.add(lowIncome);
		
		lowIncomeC.setSize(35, 35);
		lowIncomeC.setLocation(295, 40);
		lowIncomeC.addItemListener(this);
		this.add(lowIncomeC);
		
		calculate.setSize(100, 35);
		calculate.setLocation(10, 100);
		calculate.addActionListener(this);
		this.add(calculate);
		
		reset.setSize(100, 30);
		reset.setLocation(10, 140);
		reset.addActionListener(this);
		this.add(reset);
		
		totalCosts.setSize(100, 35);
		totalCosts.setLocation(180, 100);
		this.add(totalCosts);
		
		totalOutput.setSize(100, 35);
		totalOutput.setLocation(180, 130);
		totalOutput.setEditable(false);
		totalOutput.setBackground(Color.white);
		this.add(totalOutput);
	}
	
	public static void main(String[] args) 
	{
		frame = new TaxConsulting();
		frame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(checkBox)
		{
			lowIn = false;
			checkBox = false;
		}
		else
		{
			lowIn = true;
			checkBox = true;
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == calculate)
		{
			double time = 0;
			double hourlyRate = 0;
			double charges = 0;
			
			try
			{
				if(lowIn)
				{
					String rateIn = rateInput.getText();
					hourlyRate = Double.parseDouble(rateIn);
					String timeIn = timeInput.getText();
					time = Double.parseDouble(timeIn);
					
					charges = hourlyRate * 0.40 * ((time - 30) / 60);
					totalOutput.setText("" + money.format(charges));
				}
				else
				{
					String rateIn = rateInput.getText();
					hourlyRate = Double.parseDouble(rateIn);
					String timeIn = timeInput.getText();
					time = Double.parseDouble(timeIn);
					
					charges = hourlyRate * 0.70 * ((time - 20) / 60);
					totalOutput.setText("" + money.format(charges));
				}
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "Please enter valid numbers into both \nHourly Rate and Consulation Duration.");
				
				rateInput.setText("");
				timeInput.setText("");
				totalOutput.setText("");
				
				checkBox = false;
				lowIn = false;
				lowIncomeC.setSelected(false);
			}
		}
		else if(ae.getSource() == reset)
		{
			rateInput.setText("");
			timeInput.setText("");
			totalOutput.setText("");
			
			checkBox = false;
			lowIn = false;
			lowIncomeC.setSelected(false);
		}
	}

}
