package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.*;


public class CenterStuff extends JPanel
{
	static JLabel test = new JLabel("");
	static JPanel comp = new JPanel();
	
	static JScrollPane center = null;
	
	static JPanel descC = new JPanel();
	static JLabel descT = new JLabel("Description");
	static JTextArea desc = new JTextArea("");
	static JScrollPane descScrl = new JScrollPane(desc);
	
	static JPanel purpP = new JPanel();
	static JLabel purpT = new JLabel("Planing Criteria");
	static JTextArea purp = new JTextArea("");
	static JScrollPane purpScrl = new JScrollPane(purp);
	
	static JPanel loadP = new JPanel();
	static JLabel loadT = new JLabel("Loading");
	static JTextArea load = new JTextArea("");
	static JScrollPane loadScrl = new JScrollPane(load);
	
	static JPanel analP = new JPanel();
	static JLabel analT = new JLabel("Analysis");
	static JTextArea anal = new JTextArea("");
	static JScrollPane analScrl = new JScrollPane(anal);
	
	static int one = 0;
	static int two = 0;
	static int three = 0;
	static int four = 0;
	static int five = 0;
	
	static int descExists = 0;
	
	
	public static JPanel CreateGUI()
	{	
		comp.setLayout(new GridLayout(4,1));
		
		comp.add(Description());
		comp.add(Purpose());
		comp.add(Loading());
		comp.add(Analysis());
		
		return comp;
	}
	
	public static JPanel Description()
	{
		descC.setPreferredSize(new Dimension(510, 250));
		descC.setLayout(null);
		
		desc.setLineWrap(true);
		
		descT.setSize(100, 30);
		descT.setLocation(0,0);
		descScrl.setSize(507, 200);
		descScrl.setLocation(0, 35);
		//descScrl.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		descC.add(descT);
		descC.add(descScrl);
		
		descC.setVisible(true);
		
		return descC;
		
	}
	
	public static JPanel Purpose()
	{
		purpP.setPreferredSize(new Dimension(510, 250));
		purpP.setLayout(null);
		
		purp.setLineWrap(true);

		purpT.setSize(100, 30);
		purpT.setLocation(0,0);
		purpScrl.setSize(507, 200);
		purpScrl.setLocation(0,35);
		purpP.add(purpT, BorderLayout.NORTH);
		purpP.add(purpScrl, BorderLayout.CENTER);

		purpP.setVisible(true);

		return purpP;
	}
	
	public static JPanel Loading()
	{
		loadP.setPreferredSize(new Dimension(510, 250));
		loadP.setLayout(null);
		
		load.setLineWrap(true);
		
		loadT.setSize(100, 30);
		loadT.setLocation(0,0);
		loadScrl.setSize(507, 200);
		loadScrl.setLocation(0,35);
		loadP.add(loadT, BorderLayout.NORTH);
		loadP.add(loadScrl, BorderLayout.CENTER);

		loadP.setVisible(true);

		return loadP;
	}
	
	public static JPanel Analysis()
	{
		analP.setPreferredSize(new Dimension(510, 250));
		analP.setLayout(null);
		
		anal.setLineWrap(true);
		
		analT.setSize(100, 30);
		analT.setLocation(0,0);
		analScrl.setSize(507, 200);
		analScrl.setLocation(0,35);
		analP.add(analT, BorderLayout.NORTH);
		analP.add(analScrl, BorderLayout.CENTER);

		analP.setVisible(true);
		
		return analP;
	}
}
	
