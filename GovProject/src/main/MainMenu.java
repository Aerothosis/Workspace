package main;

import javax.swing.*;

import forms.PreviewWindow;

import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener, ItemListener
{
	private JButton open = new JButton("Open");
	private JComboBox forms = new JComboBox();
	
	static int formSelected = 0;	
	
	static JFrame frame = null;
	static JFrame frame2 = null;
	
	MainMenu()
	{
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 100);
		this.setTitle("Opening Menu");
		
		this.setLayout(null);
		
		forms.addItem("Forms Available");
		forms.addItem("Standard");
		forms.addItem("Standard 2");
		forms.addItem("Standard 3");
		forms.addItem("Standard 4");
		forms.setSize(150, 35);
		forms.setLocation(10, 10);
		forms.addItemListener(this);
		this.add(forms);
		
		open.setSize(85, 35);
		open.setLocation(170, 10);
		open.addActionListener(this);
		this.add(open);
	}

	public static void main(String[] args) 
	{
		frame = new MainMenu();
		frame.setVisible(true);
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == forms)
		{
			if(forms.getSelectedIndex() == 0)
			{
				
			}
			else if(forms.getSelectedIndex() == 1)
			{
				formSelected = 1;
			}
			else if(forms.getSelectedIndex() == 2)
			{
				formSelected = 2;
			}
			else if(forms.getSelectedIndex() == 3)
			{
				
			}
			else if(forms.getSelectedIndex() == 4)
			{
				
			}
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == open)
		{
			frame2 = new MainWindow();
			frame2.setVisible(true);
			frame.setVisible(false);
		}
	}

}
