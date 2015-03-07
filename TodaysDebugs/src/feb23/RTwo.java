package feb23;

import java.awt.*;
import javax.swing.*;


public class  RTwo extends  JFrame
{
	private JLabel  length,  width,  area;
	
	public  RTwo()
	{
		setTitle("Good  day  Area");
		
		length  = new JLabel("Enter  the  length");
		width  = new JLabel("Enter  the  width");
		area  = new JLabel("Area:  ");
		
		Container pane  = this.getContentPane();
		this.setContentPane(pane);
		
		pane.setLayout(new GridLayout(4,1));
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void  main(String  args[])
	{
		RTwo  R2  = new  RTwo();
	}
}