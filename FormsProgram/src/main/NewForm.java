package main;

/*
This frame will be used to initialize a new form. Users will plug in
new project information here and that information will be carried over
onto the form in the correct location.
*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class NewForm extends JFrame implements ActionListener
{
	static JLabel inst = new JLabel("Installation:");
	static JTextField instInput = new JTextField("");
	static JLabel instUIC = new JLabel("Installation UIC:");
	static JTextField instUICInput = new JTextField("");
	static JLabel user = new JLabel("User:");
	static JTextField userInput = new JTextField("");
	static JLabel userUIC = new JLabel("User UIC:");
	static JTextField userUICInput = new JTextField("");
	static JLabel siteArea = new JLabel("Site(Special Area):");
	static JTextField siteAreaInput = new JTextField("");
	static JLabel planArea = new JLabel("Planning Area:");
	static JTextField planAreaInput = new JTextField("");
	static JLabel ccn = new JLabel("CCN:");
	static JTextField ccnInput = new JTextField("");
	static JLabel nomen = new JLabel("Nomenclature:");
	static JTextField nomenInput = new JTextField("");
	JButton start = new JButton("Start");
	JButton reset = new JButton("Reset");
	JButton help = new JButton("Help?");
	
	static JFrame frame = null;
	
	static String errorStr = "";
	static int errors = 0;
	
	NewForm()
	{
		this.setSize(620, 230);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("New Form");
		
		this.setLayout(null);
		
		inst.setSize(78, 30);
		inst.setLocation(32, 10);
		this.add(inst);
		
		instInput.setSize(100, 30);
		instInput.setLocation(100, 10);
		instInput.addActionListener(this);
		this.add(instInput);
		
		instUIC.setSize(100, 30);
		instUIC.setLocation(10, 45);
		this.add(instUIC);
		
		instUICInput.setSize(100, 30);
		instUICInput.setLocation(100, 45);
		instUICInput.addActionListener(this);
		this.add(instUICInput);
		
		user.setSize(58, 30);
		user.setLocation(242, 10);
		this.add(user);
		
		userInput.setSize(100, 30);
		userInput.setLocation(275, 10);
		userInput.addActionListener(this);
		this.add(userInput);
		
		userUIC.setSize(80, 30);
		userUIC.setLocation(220, 45);
		this.add(userUIC);
		
		userUICInput.setSize(100, 30);
		userUICInput.setLocation(275, 45);
		userUICInput.addActionListener(this);
		this.add(userUICInput);
		
		siteArea.setSize(105, 30);
		siteArea.setLocation(385, 10);
		this.add(siteArea);
		
		siteAreaInput.setSize(100, 30);
		siteAreaInput.setLocation(493, 10);
		siteAreaInput.addActionListener(this);
		this.add(siteAreaInput);
		
		planArea.setSize(82, 30);
		planArea.setLocation(408, 45);
		this.add(planArea);
		
		planAreaInput.setSize(100, 30);
		planAreaInput.setLocation(493, 45);
		planAreaInput.addActionListener(this);
		this.add(planAreaInput);
		
		ccn.setSize(40, 30);
		ccn.setLocation(70, 80);
		this.add(ccn);
		
		ccnInput.setSize(100, 30);
		ccnInput.setLocation(100, 80);
		ccnInput.addActionListener(this);
		this.add(ccnInput);
		
		nomen.setSize(83, 30);
		nomen.setLocation(407, 80);
		this.add(nomen);
		
		nomenInput.setSize(100, 30);
		nomenInput.setLocation(493, 80);
		nomenInput.addActionListener(this);
		this.add(nomenInput);
		
		start.setSize(200, 30);
		start.setLocation(220, 115);
		start.setMnemonic(KeyEvent.VK_S);
		start.addActionListener(this);
		this.add(start);
		
		reset.setSize(200, 30);
		reset.setLocation(220, 150);
		reset.setMnemonic(KeyEvent.VK_R);
		reset.addActionListener(this);
		this.add(reset);
		
		help.setSize(70, 30);
		help.setLocation(10, 150);
		help.addActionListener(this);
		this.add(help);
	}
	
	public static void main(String[] args) 
	{
		CreateGUI();
	}
	
	public static void CreateGUI()
	{
		frame = new NewForm();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == start || ae.getSource() == instInput || ae.getSource() == userInput || ae.getSource() == userUICInput || 
				ae.getSource() == siteAreaInput || ae.getSource() == planAreaInput || ae.getSource() == ccnInput || ae.getSource() == nomenInput)
		{
			inst.setForeground(Color.black);
			instUIC.setForeground(Color.black);
			user.setForeground(Color.black);
			userUIC.setForeground(Color.black);
			siteArea.setForeground(Color.black);
			planArea.setForeground(Color.black);
			ccn.setForeground(Color.black);
			nomen.setForeground(Color.black);
			
			errors = 0;
			errorStr = "";
			
			String install = instInput.getText();
			String installUIC = instUICInput.getText();
			String usr = userInput.getText();
			String usrUIC = userUICInput.getText();
			String site = siteAreaInput.getText();
			String plan = planAreaInput.getText();
			String ccnIn = ccnInput.getText();
			String nomenIn = nomenInput.getText();
			
			
			if(install.length() < 1)
			{
				inst.setForeground(Color.red);
				errorStr += "Please enter an installation name." + '\n';
				errors++;
			}
			if(installUIC.length() < 1)
			{
				instUIC.setForeground(Color.red);
				errorStr += "Please enter an instalation UIC." + '\n';
				errors++;
			}
			if(usr.length() < 1)
			{
				user.setForeground(Color.red);
				errorStr += "Please enter a user." + '\n';
				errors++;
			}
			if(usrUIC.length() < 1)
			{
				userUIC.setForeground(Color.red);
				errorStr += "Please enter a user UIC." + '\n';
				errors++;
			}
			if(site.length() < 1)
			{
				siteArea.setForeground(Color.red);
				errorStr += "Please enter a site (special area)." + '\n';
				errors++;
			}
			if(plan.length() < 1)
			{
				planArea.setForeground(Color.red);
				errorStr += "Please enter a planning area." + '\n';
				errors++;
			}
			if(ccnIn.length() < 1)
			{
				ccn.setForeground(Color.red);
				errorStr += "Please enter a CCN." + '\n';
				errors++;
			}
			if(nomenIn.length() < 1)
			{
				nomen.setForeground(Color.red);
				errorStr += "Please enter a nomenclature." + '\n';
				errors++;
			}
			
			if(install.equalsIgnoreCase("f"))
			{
				errors = 0;
			}
			
			
			if(errors == 0)
			{
				frame.setVisible(false);
				MainWindow.CreateGUI(install, installUIC, usr, usrUIC, site, plan, ccnIn, nomenIn);
			}
			else
			{
				JOptionPane.showMessageDialog(null, errorStr, "New Form Errors", JOptionPane.WARNING_MESSAGE);
			}
		}
									
		else if(ae.getSource() == reset)
		{
			inst.setForeground(Color.black);
			instInput.setText("");
			instUIC.setForeground(Color.black);
			instUICInput.setText("");
			user.setForeground(Color.black);
			userInput.setText("");
			userUIC.setForeground(Color.black);
			userUICInput.setText("");
			siteArea.setForeground(Color.black);
			siteAreaInput.setText("");
			planArea.setForeground(Color.black);
			planAreaInput.setText("");
			ccn.setForeground(Color.black);
			ccnInput.setText("");
			nomen.setForeground(Color.black);
			nomenInput.setText("");
			
			errors = 0;
			errorStr = "";
		}
		
		else if(ae.getSource() == help)
		{
			String helpPrompt = 
					"Please enter information into all of the areas." +'\n' +
					"If you try to continue without filling in all of the" +'\n' +
					"fields, you will be shown an error message and" +'\n' +
					"not be allowed to continue to the main window.";
			JOptionPane.showMessageDialog(null, helpPrompt);
		}
	}
}
