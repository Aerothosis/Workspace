package feb18;

/*
Program: FirstApplet.java
Author: Mike
Date: 2-18-2015
Purpose: 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstApplet extends JApplet implements ActionListener
{
	int[] xPoints = {50,150,100};
	int[] yPoints = {10,50,150};
	
	JButton change = new JButton("Change Things");
	
	int counter = 1;
			
	public void init()
	{
		this.setSize(500, 400);
		//this.setBackground(Color.gray);
		
		this.setLayout(new BorderLayout());
		
		change.addActionListener(this);
		this.add(change, BorderLayout.SOUTH);
	}
	
	public void paint(Graphics gr)
	{
		counter++;
		
		if(counter %2 == 0)
		{
			Font arial = new Font("Arial", Font.BOLD, 24);
			gr.setColor(Color.red);
			gr.setFont(arial);
			gr.drawString("Hello, World!", 25, 50);
			
			gr.setColor(Color.blue);
			gr.fillRect(25, 100, 100, 100);
			gr.clearRect(35, 110, 80, 80);
			gr.fillRect(45, 120, 60, 60);
			gr.clearRect(55, 130, 40, 40);
			//gr.fill3DRect(25, 220, 100, 100, true);
			//gr.fillOval(25, 220, 100, 100);
			
			gr.fillArc(25, 220, 100, 100, 0, 270);
			gr.setColor(Color.red);
			gr.fillArc(25, 220, 100, 100, 270, 90);
			
			gr.fillPolygon(xPoints, yPoints, 3);
			
			gr.setColor(Color.green);
			gr.drawLine(200, 20, 300, 75);
		}
		else
		{
			Font arial = new Font("Arial", Font.BOLD, 24);
			gr.setColor(Color.blue);
			gr.setFont(arial);
			gr.drawString("Hello, World!", 25, 50);
			
			gr.setColor(Color.red);
			gr.fillRect(25, 100, 100, 100);
			gr.clearRect(35, 110, 80, 80);
			//gr.fill3DRect(25, 220, 100, 100, true);
			//gr.fillOval(25, 220, 100, 100);
			
			gr.fillArc(25, 220, 100, 100, 0, 270);
			gr.setColor(Color.green);
			gr.fillArc(25, 220, 100, 100, 270, 90);
			
			gr.fillPolygon(xPoints, yPoints, 3);
			
			gr.setColor(Color.blue);
			gr.drawLine(200, 20, 300, 75);
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		repaint();
	}
}
