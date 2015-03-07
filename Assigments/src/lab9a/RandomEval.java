package lab9a;

/*
Program: RandomEval.java
Author: Mike
Date: 3-2-2015
Purpose: User clicks the GENERATE NUMBERS key to generate 1000 random numbers between
0-9. The program will keep track how many times each number is generate and display
the results in a text field on the bottom of the window.
*/

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class RandomEval extends JFrame implements ActionListener
{
	JButton generate = new JButton("GENERATE NUMBERS!");
	JButton reset = new JButton("Reset");
	static JTextArea output = new JTextArea("");
	JScrollPane outputScrl = null;
	JButton exit = new JButton("Exit");
	
	static JFrame frame = null;
	
	int[] nums = new int[1000];
	int randomNum = 0;
	
	RandomEval()
	{
		this.setSize(400, 400);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Random Number Evaluation");
		
		this.setLayout(null);
		
		generate.setSize(200, 30);
		generate.setLocation(85, 10);
		generate.setMnemonic(KeyEvent.VK_G);
		generate.addActionListener(this);
		this.add(generate);
		
		reset.setSize(100, 30);
		reset.setLocation(135, 45);
		reset.setMnemonic(KeyEvent.VK_R);
		reset.addActionListener(this);
		this.add(reset);
		
		output.setEditable(false);
		output.setBackground(Color.white);
		outputScrl = new JScrollPane(output);
		outputScrl.setSize(200, 200);
		outputScrl.setLocation(85, 85);
		this.add(outputScrl);
		
		exit.setSize(100, 30);
		exit.setLocation(135, 295);
		exit.setMnemonic(KeyEvent.VK_X);
		exit.addActionListener(this);
		this.add(exit);
	}
	
	public static void main(String[] args)
	{
		frame = new RandomEval();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == generate)
		{
			for(int count = 0; count < nums.length; count++)
			{
				nums[count] = 0;
			}
			
			for(int counter = 0; counter < nums.length; counter++)
			{
				randomNum = (int)(Math.random() * 10);
				nums[randomNum]++;
			}
			
			output.setText(
					"0's generated: " + nums[0] +'\n'+
					"1's generated: " + nums[1] +'\n'+
					"2's generated: " + nums[2] +'\n'+
					"3's generated: " + nums[3] +'\n'+
					"4's generated: " + nums[4] +'\n'+
					"5's generated: " + nums[5] +'\n'+
					"6's generated: " + nums[6] +'\n'+
					"7's generated: " + nums[7] +'\n'+
					"8's generated: " + nums[8] +'\n'+
					"9's generated: " + nums[9]);
		}
		else if(ae.getSource() == reset)
		{
			output.setText("");
		}
		else if(ae.getSource() == exit)
		{
			System.exit(0);
		}
	}
}
