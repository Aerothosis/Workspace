package feb23;

import  javax.swing.*;

public class  ROne extends  JFrame
{
	static private final int  WIDTH  =  400;
	static private final int  HEIGHT  =  300;
	
	public  ROne()
	{
		this.setTitle("Welcome");
		this.setSize(WIDTH,HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String  args[])
	{
		
		ROne  r1  =  new ROne();
	}
}