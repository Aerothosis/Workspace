package proj6b;

/*
Program: SkyLine.java
Author: Mike
Date: 2-25-2015
Purpose: PROEJCT 6B: Display a JApplet of a city skyline. Allow the user
to toggle between a day and night scene.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkyLine extends JApplet implements ActionListener
{
	JButton shift = new JButton("Day/Night Shift");
	
	int counter = 0;
	
	public void init()
	{
		this.setSize(500, 300);
		this.setLayout(new BorderLayout());
		
		shift.addActionListener(this);
		this.add(shift, BorderLayout.SOUTH);
	}
	
	public void paint(Graphics gr)
	{
		counter++;
		
		if(counter %2 == 0)
		{
			gr.setColor(Color.blue);
			gr.fillRect(0, 0, 500, 500);
			
			gr.setColor(Color.LIGHT_GRAY);
			gr.fillRect(25, 100, 50, 100);
			gr.fillRect(80, 90, 50, 110);
			gr.fillRect(135, 120, 50, 80);
			gr.fillRect(190, 70, 50, 130);
			
			gr.setColor(Color.yellow);
			gr.fillOval(300, 30, 50, 50);
			
			gr.setColor(Color.black);
			gr.fillRect(0, 200, 500, 100);
		}
		else
		{
			gr.setColor(Color.darkGray);
			gr.fillRect(0, 0, 500, 500);
			
			gr.setColor(Color.LIGHT_GRAY);
			gr.fillRect(25, 100, 50, 100);
			gr.fillRect(80, 90, 50, 110);
			gr.fillRect(135, 120, 50, 80);
			gr.fillRect(190, 70, 50, 130);
			
			gr.setColor(Color.lightGray);
			gr.fillOval(300, 30, 50, 50);
			gr.setColor(Color.darkGray);
			gr.fillOval(285, 25, 50, 50);
			
			gr.setColor(Color.black);
			gr.fillRect(0, 200, 500, 100);
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		repaint();
	}

}
