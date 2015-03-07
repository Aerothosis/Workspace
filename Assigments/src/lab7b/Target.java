package lab7b;

/*
Program: Target.java
Author: Mike
Date: 2-18-2015
Purpose: Create a JApplet that displays a target with alternating color circles.
 */

import javax.swing.*;
import java.awt.*;

public class Target extends JApplet 
{
	public void init()
	{
		this.setSize(150, 150);
	}
	
	public void paint(Graphics gr)
	{
		gr.setColor(Color.red);
		gr.fillOval(10, 10, 120, 120);
		gr.setColor(Color.white);
		gr.fillOval(20, 20, 100, 100);
		gr.setColor(Color.red);
		gr.fillOval(30, 30, 80, 80);
		gr.setColor(Color.white);
		gr.fillOval(40, 40, 60, 60);
		gr.setColor(Color.red);
		gr.fillOval(50, 50, 40, 40);
		gr.setColor(Color.white);
		gr.fillOval(60, 60, 20, 20);
	}
}
