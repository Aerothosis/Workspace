package forms;

import java.awt.event.*;
import javax.swing.*;

import java.io.*;
import java.awt.*;

public class StandardFormOne extends JFrame implements ActionListener, ItemListener
{
	public static JTextArea form = new JTextArea(25, 40);
	
	static JFrame frame = null;
	
	StandardFormOne()
	{
		this.setSize(600, 300);
		//this.setDefaultCloseOperation(JFrame.ABORT);
		this.setLocation(300, 100);
		this.setTitle("Form Preview");
		
		this.setLayout(null);
		
		form.setSize(500, 200);
		form.setLocation(10, 10);
		this.add(form);
	}
	
	public static void main(String[] args)
	{
		frame = new StandardFormOne();
		form.setText("Standard Form One");
		frame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

}
