package proj5d;

/*
Program: LoanPayoff.java
Author: Mike
Date: 2-13-2015
Purpose: PROJECT 5D  Allow user to input loan total, interest rate per year, and monthly payment. Program will
calculate number of months it will take to repay the loan. If monthly payments is not sufficient enough
to pay of loan ever, inform user an increase of monthly payments might be required.
 */

import java.awt.event.*;

import javax.swing.*;


public class LoanPayoff extends JFrame implements ActionListener, ItemListener
{
	private JLabel loanLabel = new JLabel("Loan Amount:");
	private JTextField loanInput = new JTextField("");
	private JButton loanHelp = new JButton("?");
	private JLabel interestLabel = new JLabel("Yearly Interest %");
	private JTextField interestInput = new JTextField("");
	private JButton interestHelp = new JButton("?");
	private JLabel monthlyLabel = new JLabel("Monthly Payments:");
	private JTextField monthlyInput = new JTextField("");
	private JButton monthlyHelp = new JButton("?");
	private JLabel monthsLabel = new JLabel("Time to Payoff:");
	private JLabel monthsOutput = new JLabel("Months");
	private JButton calculate = new JButton("Calculate");
	private JButton reset = new JButton("Reset");
	private JButton exit = new JButton("Exit");
	private JLabel termLabel = new JLabel("Term Length (Years)");
	private JComboBox termInput = new JComboBox();
	private JButton termHelp = new JButton("?");
	private JCheckBox termCheck = new JCheckBox("Open Term");

	static JFrame frame = null;

	int months = 0;
	boolean openLoan = false;
	int termLength = 0;
	int year = 0;
	int monthsOut = 0;
	boolean loanValid = true;
	boolean interestValid = true;
	boolean monthlyValid = true;
	int termLengthM = 0;
	
	LoanPayoff()
	{
		this.setSize(450, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(400, 200);
		this.setTitle("Loan Payoff Calculator");
		
		this.setLayout(null);
		
		loanLabel.setSize(80, 35);
		loanLabel.setLocation(10, 20);
		this.add(loanLabel);
		
		loanInput.setSize(100, 35);
		loanInput.setLocation(10, 60);
		this.add(loanInput);
		
		loanHelp.setSize(45, 35);
		loanHelp.setLocation(111,60);
		loanHelp.addActionListener(this);
		this.add(loanHelp);
		
		interestLabel.setSize(100, 35);
		interestLabel.setLocation(190, 20);
		this.add(interestLabel);
		
		interestInput.setSize(100, 35);
		interestInput.setLocation(190, 60);
		this.add(interestInput);
		
		interestHelp.setSize(45, 35);
		interestHelp.setLocation(291, 60);
		interestHelp.addActionListener(this);
		this.add(interestHelp);
		
		monthlyLabel.setSize(110, 35);
		monthlyLabel.setLocation(10, 110);
		this.add(monthlyLabel);
		
		monthlyInput.setSize(100, 35);
		monthlyInput.setLocation(10, 150);
		this.add(monthlyInput);
		
		monthlyHelp.setSize(45, 35);
		monthlyHelp.setLocation(111, 150);
		monthlyHelp.addActionListener(this);
		this.add(monthlyHelp);
		
		termLabel.setSize(140, 35);
		termLabel.setLocation(190, 110);
		this.add(termLabel);
		
		termInput.addItem("1");
		termInput.addItem("2");
		termInput.addItem("3");
		termInput.addItem("4");
		termInput.addItem("5");
		termInput.addItem("6");
		termInput.addItem("7");
		termInput.addItem("8");
		termInput.addItem("9");
		termInput.addItem("10");
		termInput.addItem("11");
		termInput.addItem("12");
		termInput.addItem("13");
		termInput.addItem("14");
		termInput.addItem("15");
		termInput.addItem("16");
		termInput.addItem("17");
		termInput.addItem("18");
		termInput.addItem("19");
		termInput.addItem("20");
		termInput.addItem("21");
		termInput.addItem("22");
		termInput.addItem("23");
		termInput.addItem("24");
		termInput.addItem("25");
		termInput.addItem("26");
		termInput.addItem("27");
		termInput.addItem("28");
		termInput.addItem("29");
		termInput.addItem("30");
		termInput.setSize(80, 35);
		termInput.setLocation(190, 150);
		termInput.addItemListener(this);
		this.add(termInput);
				
		termHelp.setSize(45, 35);
		termHelp.setLocation(271, 150);
		termHelp.addActionListener(this);
		this.add(termHelp);

		termCheck.setSize(100, 35);
		termCheck.setLocation(330, 150);
		termCheck.addItemListener(this);
		this.add(termCheck);
		
		monthsLabel.setSize(110, 35);
		monthsLabel.setLocation(10, 200);
		this.add(monthsLabel);
		
		monthsOutput.setSize(250, 35);
		monthsOutput.setLocation(130, 200);
		this.add(monthsOutput);
		
		calculate.setSize(100, 35);
		calculate.setLocation(100, 245);
		calculate.addActionListener(this);
		this.add(calculate);
		
		reset.setSize(75, 35);
		reset.setLocation(70, 290);
		reset.addActionListener(this);
		this.add(reset);
		
		exit.setSize(75, 35);
		exit.setLocation(150, 290);
		exit.addActionListener(this);
		this.add(exit);
	}
	
	public static void main(String[] args) 
	{
		frame = new LoanPayoff();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		try
		{
			if(ae.getSource() == loanHelp)
			{
				String loanHelpD = "Please enter your loan total. \n" +
						"Your loan amount MUST be greater than 0. \n" +
						"Please do NOT use any special characters. \n" +
						"Example good: 1000.45 \n" +
						"Example bad: $1,000.45";
				JOptionPane.showMessageDialog(null, loanHelpD, "Loan Help", JOptionPane.QUESTION_MESSAGE);
			}
			else if(ae.getSource() == interestHelp)
			{
				String interestHelpD = "Please enter your interest rate as a normal number. \n" +
						"Your interest rate MUST be between 5.6 and 10. \n" +
						"Please do NOT use special characters. \n" +
						"Example good: 7.2 \n" +
						"Example bad: 7.2%";
				JOptionPane.showMessageDialog(null, interestHelpD, "Interest Help", JOptionPane.QUESTION_MESSAGE);
			}
			else if(ae.getSource() == monthlyHelp)
			{
				String monthlyHelpD = "Please enter your monthly payment amount. \n" +
						"Your monthly payment MUST be greater than 0. \n" +
						"Please do NOT use any special characters. \n" +
						"Example good: 24.95 \n" +
						"Exampe bad: $24.95";
				JOptionPane.showMessageDialog(null, monthlyHelpD, "Monthly Payements Help", JOptionPane.QUESTION_MESSAGE);
			}
			else if(ae.getSource() == termHelp)
			{
				String termHelpD = "Please select your desired loan term. \n" +
						"This will determine if your monthly payment is \n" +
						"sufficient enough to meet the term length assigned. \n" +
						"If it isn't, you will be asked to either assign a new \n" +
						"length, or enter a larger monthly payment. \n" +
						"Please select the 'Open Term' checkbox if you wish \n" +
						"to calculate term length with your current loan \n" +
						"information rather then restrict your term length.";
				JOptionPane.showMessageDialog(null, termHelpD, "Term Length Help", JOptionPane.QUESTION_MESSAGE);
			}
			else if(ae.getSource() == calculate)
			{
				String loanS = loanInput.getText();
				double loan = Double.parseDouble(loanS);
				String interestS = interestInput.getText();
				double interest = Double.parseDouble(interestS);
				String monthlyS = monthlyInput.getText();
				double monthly = Double.parseDouble(monthlyS);
				months = 0;
				loanValid = true;
				interestValid = true;
				monthlyValid = true;
				
				termLengthM = termLength * 12;
				
				if (loan <= 0)
				{
					JOptionPane.showMessageDialog(null, "You entered a negative number for your loan amount.\n Please enter a positive number.", "Loan Amount Error", JOptionPane.WARNING_MESSAGE);
					loanValid = false;
				}
				
				if (interest <5.6 || interest > 10)
				{
					JOptionPane.showMessageDialog(null, "Your interest percentage must be between 5.6 and 10. Please try again.", "Interest Percentage Error", JOptionPane.WARNING_MESSAGE);
					interestValid = false;
				}
				
				if (monthly <= 0)
				{
					JOptionPane.showMessageDialog(null, "Your monthly payment must be higher than 0.", "Monthly Payment Error", JOptionPane.WARNING_MESSAGE);
					monthlyValid = false;
				}
				
				while(loan > 0 && loanValid == true && interestValid == true && monthlyValid == true)
				{
					if(openLoan == true)
					{
						double loanT = loan;
						double interestM = (interest / 12) / 100;
						double interestMM = loan * interestM;
						double monthlyM = monthly - interestMM;
						loan -= monthlyM;
						
						months++;
						
						if (loanT < loan)
						{
							String minPayErr = "Your minimum payment is not enough to \n" +
									"payoff your loan. Please adjust your monthly \n" +
									"payment amount.";
							JOptionPane.showMessageDialog(null, minPayErr, "Minimum Payment Error", JOptionPane.WARNING_MESSAGE);
							months = 0;
							break;
						}
					}
					else
					{
						double loanT = loan;
						double interestM = (interest / 12) / 100;
						double interestMM = loan * interestM;
						double monthlyM = monthly - interestMM;
						loan -= monthlyM;
						
						months++;
						
						if(months > termLengthM)
						{
							String termLengthErr = "Your monthly payment is not enough to \n" +
									"payoff your loan in the length specified. Please \n" +
									"adjust your monthly payment amount or term length.";
							JOptionPane.showMessageDialog(null, termLengthErr, "Term Length Error", JOptionPane.WARNING_MESSAGE);
							months = 0;
							monthlyValid = false;
							break;
						}
						
						if (loanT < loan)
						{
							String minPayErr = "Your monthly payment is not enough to \n" +
									"payoff your loan. Please adjust your monthly \n" +
									"payment amount.";
							JOptionPane.showMessageDialog(null, minPayErr, "Minimum Payment Error", JOptionPane.WARNING_MESSAGE);
							months = 0;
							break;
						}
					}
				}
				year = months / 12;
				monthsOut = months % 12;
				String monthsS = year + " year(s) and " + monthsOut + " month(s)" + " (" + months + " months)";
				if(loanValid == true && interestValid == true && monthlyValid == true)
				{
					monthsOutput.setText(monthsS);
				}
				else
				{
					monthsOutput.setText("Months");
				}
			}
			
			else if(ae.getSource() == reset)
			{
				loanInput.setText("");
				interestInput.setText("");
				monthlyInput.setText("");
				monthsOutput.setText("Months");
				months = 0;
				termInput.setEnabled(true);
			}
			
			else if(ae.getSource() == exit)
			{
				System.exit(0);
			}
		}
		catch(NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null, "Please enter a value into all fields before clicking Calculate.", "Input Error", JOptionPane.WARNING_MESSAGE);
		}
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == termInput)
		{
			if(termInput.getSelectedIndex() == 0)
			{
				termLength = 1;
			}
			else if(termInput.getSelectedIndex() == 1)
			{
				termLength = 2;
			}
			else if(termInput.getSelectedIndex() == 2)
			{
				termLength = 3;
			}
			else if(termInput.getSelectedIndex() == 3)
			{
				termLength = 4;
			}
			else if(termInput.getSelectedIndex() == 4)
			{
				termLength = 5;
			}
			else if(termInput.getSelectedIndex() == 5)
			{
				termLength = 6;
			}
			else if(termInput.getSelectedIndex() == 6)
			{
				termLength = 7;
			}
			else if(termInput.getSelectedIndex() == 7)
			{
				termLength = 8;
			}
			else if(termInput.getSelectedIndex() == 8)
			{
				termLength = 9;
			}
			else if(termInput.getSelectedIndex() == 9)
			{
				termLength = 10;
			}
			else if(termInput.getSelectedIndex() == 10)
			{
				termLength = 11;
			}
			else if(termInput.getSelectedIndex() == 11)
			{
				termLength = 12;
			}
			else if(termInput.getSelectedIndex() == 12)
			{
				termLength = 13;
			}
			else if(termInput.getSelectedIndex() == 13)
			{
				termLength = 14;
			}
			else if(termInput.getSelectedIndex() == 14)
			{
				termLength = 15;
			}
			else if(termInput.getSelectedIndex() == 15)
			{
				termLength = 16;
			}
			else if(termInput.getSelectedIndex() == 16)
			{
				termLength = 17;
			}
			else if(termInput.getSelectedIndex() == 17)
			{
				termLength = 18;
			}
			else if(termInput.getSelectedIndex() == 18)
			{
				termLength = 19;
			}
			else if(termInput.getSelectedIndex() == 19)
			{
				termLength = 20;
			}
			else if(termInput.getSelectedIndex() == 20)
			{
				termLength = 21;
			}
			else if(termInput.getSelectedIndex() == 21)
			{
				termLength = 22;
			}
			else if(termInput.getSelectedIndex() == 22)
			{
				termLength = 23;
			}
			else if(termInput.getSelectedIndex() == 23)
			{
				termLength = 24;
			}
			else if(termInput.getSelectedIndex() == 24)
			{
				termLength = 25;
			}
			else if(termInput.getSelectedIndex() == 25)
			{
				termLength = 26;
			}
			else if(termInput.getSelectedIndex() == 26)
			{
				termLength = 27;
			}
			else if(termInput.getSelectedIndex() == 27)
			{
				termLength = 28;
			}
			else if(termInput.getSelectedIndex() == 28)
			{
				termLength = 29;
			}
			else if(termInput.getSelectedIndex() == 29)
			{
				termLength = 30;
			}
		}
		else if (ie.getSource() == termCheck)
		{
			if(openLoan == false)
			{
				openLoan = true;
				termInput.setEnabled(false);
			}
			else
			{
				openLoan = false;
				termInput.setEnabled(true);
			}
		}
	}

}
