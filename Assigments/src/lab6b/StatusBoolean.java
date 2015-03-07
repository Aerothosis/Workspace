package lab6b;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StatusBoolean extends JFrame implements ActionListener
{
	JLabel statusLabel = new JLabel("Filing Status");
	JTextField statusInput = new JTextField();
	static JTextArea instructions = new JTextArea();
	JButton submit = new JButton("Submit");
	
	static JFrame frame = null;
	
	static char status = 'z';
	static String statusOut = "";
	static boolean statusBool = true;
	
	static String instructionsS = "Please enter your filing status into the field \n" +
			"provided above. Please enter only one of\n" +
			"the following options:\n" +
			"M   = Married\n" +
			"S   = Single\n" +
			"H   = Head of Household\n" +
			"E   = Exempt";
	
	StatusBoolean()
	{
		this.setSize(350, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 100);
		this.setTitle("Filing Status");
		
		this.setLayout(null);
		
		statusLabel.setSize(100, 35);
		statusLabel.setLocation(120, 10);
		this.add(statusLabel);
		
		statusInput.setSize(50, 35);
		statusInput.setLocation(90, 55);
		this.add(statusInput);
		
		submit.setSize(100, 35);
		submit.setLocation(150, 55);
		submit.addActionListener(this);
		this.add(submit);
		
		instructions.setSize(250, 120);
		instructions.setLocation(40, 100);
		instructions.setEditable(false);
		this.add(instructions);
	}
	
	public static void main(String[] args) 
	{
		frame = new StatusBoolean();
		instructions.setText(instructionsS);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		statusBool = true;
		
		while(statusBool)
		{
			//statusBool = false;
			status = statusInput.getText().charAt(0);
			status = Character.toLowerCase(status);

			if(status == 'm')
			{
				statusOut = "You have entered your status as:\n" +
						"Married";
				instructions.setText(statusOut);
				statusBool = false;
			}
			else if(status == 's')
			{
				statusOut = "You have entered your status as:\n" +
						"Single";
				instructions.setText(statusOut);
				statusBool = false;
			}
			else if(status == 'h')
			{
				statusOut = "You have entered your status as:\n" +
						"Head of Household";
				instructions.setText(statusOut);
				statusBool = false;
			}
			else if(status == 'e')
			{
				statusOut = "You have entered your status as:\n" +
						"Exempt";
				instructions.setText(statusOut);
				statusBool = false;
			}
			else
			{
				statusOut = "You have not entered an allowed value.\n" +
						"Please enter only one of\n" +
						"the following options:\n" +
						"M   = Married\n" +
						"S   = Single\n" +
						"H   = Head of Household\n" +
						"E   = Exempt";
				instructions.setText(statusOut);
				statusBool = false;
			}
		}
	}

}
