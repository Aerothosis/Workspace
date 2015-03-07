

/*
This program allows the user to select number of rows and columns and
generate code for a table.
 */

import javax.swing.*;

import java.awt.Dimension;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class TableMethodGen extends JFrame implements ActionListener
{
	JLabel methodL = new JLabel("Method Name:");
	JTextField methodIn = new JTextField("");
	JLabel panelL = new JLabel("Panel Name:");
	JTextField panelIn = new JTextField("");
	JLabel inFileL = new JLabel("Scanner File Name:");
	JTextField inFileIn = new JTextField("");
	JLabel visL = new JLabel("Is.Visible Int:");
	JTextField visIn = new JTextField("");
	JLabel titleL = new JLabel("Table Header(s):");
	JTextField titleIn = new JTextField("");
	JLabel rowL = new JLabel("Rows:");
	JTextField rowIn = new JTextField("");
	JLabel colL = new JLabel("Columns:");
	JTextField colIn = new JTextField("");
	JLabel fileL = new JLabel("Save As:");
	JTextField fileName = new JTextField("");
	JLabel priL = new JLabel("Priority:");
	JTextField priIn = new JTextField("");
	JButton generate = new JButton("Generate");
	JButton reset = new JButton("Reset");
	JButton example = new JButton("Example");
	
	PrintWriter outFile = null;
	
	static JFrame frame = null;
	
	TableMethodGen()
	{
		this.setSize(450, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Rows & Columns");
		
		this.setLayout(null);
		
		methodL.setSize(100, 30);
		methodL.setLocation(10, 10);
		this.add(methodL);
		
		methodIn.setSize(100, 30);
		methodIn.setLocation(100, 10);
		this.add(methodIn);
		
		panelL.setSize(100, 30);
		panelL.setLocation(210, 10);
		this.add(panelL);
		
		panelIn.setSize(80, 30);
		panelIn.setLocation(290, 10);
		this.add(panelIn);
		
		inFileL.setSize(120, 30);
		inFileL.setLocation(10, 50);
		this.add(inFileL);
		
		inFileIn.setSize(100, 30);
		inFileIn.setLocation(130, 50);
		this.add(inFileIn);
		
		visL.setSize(80, 30);
		visL.setLocation(240, 50);
		this.add(visL);
		
		visIn.setSize(100, 30);
		visIn.setLocation(320, 50);
		this.add(visIn);
		
		titleL.setSize(100, 30);
		titleL.setLocation(10, 90);
		this.add(titleL);
		
		titleIn.setSize(300, 30);
		titleIn.setLocation(110, 90);
		this.add(titleIn);
		
		rowL.setSize(50, 30);
		rowL.setLocation(10, 130);
		this.add(rowL);
		
		rowIn.setSize(50, 30);
		rowIn.setLocation(50, 130);
		this.add(rowIn);
		
		colL.setSize(70, 30);
		colL.setLocation(110, 130);
		this.add(colL);
		
		colIn.setSize(50, 30);
		colIn.setLocation(170, 130);
		this.add(colIn);
		
		fileL.setSize(60, 30);
		fileL.setLocation(230, 130);
		this.add(fileL);
		
		fileName.setSize(100, 30);
		fileName.setLocation(285, 130);
		this.add(fileName);
		
		priL.setSize(60, 30);
		priL.setLocation(10, 170);
		this.add(priL);
		
		priIn.setSize(50, 30);
		priIn.setLocation(60, 170);
		this.add(priIn);
		
		generate.setSize(100, 30);
		generate.setLocation(140, 170);
		generate.addActionListener(this);
		generate.setMnemonic(KeyEvent.VK_G);
		this.add(generate);
		
		reset.setSize(100, 30);
		reset.setLocation(250, 170);
		reset.addActionListener(this);
		reset.setMnemonic(KeyEvent.VK_R);
		this.add(reset);
		
		example.setSize(100, 30);
		example.setLocation(195, 205);
		example.addActionListener(this);
		example.setMnemonic(KeyEvent.VK_E);
		this.add(example);
	}
	
	public static void main(String[] args) 
	{
		frame = new TableMethodGen();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == generate)
		{
			
			GenTable();
		}
		
		else if(ae.getSource() == reset)
		{
			methodIn.setText("");
			panelIn.setText("");
			inFileIn.setText("");
			visIn.setText("");
			titleIn.setText("");
			rowIn.setText("");
			colIn.setText("");
			fileName.setText("");
			priIn.setText("");
		}
		
		else if(ae.getSource() == example)
		{
			methodIn.setText("Seven2210B()");
			panelIn.setText("sev2210B");
			inFileIn.setText("722.10B");
			visIn.setText("722.102");
			titleIn.setText("One,Two,Three");
			rowIn.setText("12");
			colIn.setText("3");
			fileName.setText("722.10B");
			priIn.setText("2");
		}
	}
	
	public void GenTable()
	{
		String titleWhole = "";
		int titleParts = 1;
		char titleChar = 'z';
		char quotes = '"';
		String[] titleOut = null;
		
		String methodName = "";
		String panelName = "";
		String labelName = "";
		String inFileName = "";
		String visNUM = "";
		String noFile = "";
		String priInput = "";
		int priNum = 0;
		
		try
		{
			titleWhole = titleIn.getText();
			methodName = methodIn.getText();
			panelName = panelIn.getText();
			labelName = panelName + "L";
			inFileName = inFileIn.getText();
			visNUM = visIn.getText();
			noFile = "File not found for " + inFileName;
			priInput = priIn.getText();
			priNum = Integer.parseInt(priInput);
			
			for(int counter = 0; counter < titleWhole.length(); counter++)
			{
				titleChar = titleWhole.charAt(counter);
				if(titleChar == ',')
				{
					titleParts += 1;
				}
			}
		
			
			titleOut = new String[titleParts];
			int titleIndex = 0;
			
		
			for(int counter = 0; counter < titleOut.length; counter++)
			{
				titleOut[counter] = "";
			}
			
			for(int counter = 0; counter < titleWhole.length(); counter++)
			{
				titleChar = titleWhole.charAt(counter);
				if(titleChar == ',')
				{
					titleIndex++;
					continue;
				}
				else
				{
					titleOut[titleIndex] += titleChar;
				}
			}
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, "Nothing entered into Title field.\n Please enter at least one title and try again.");
		}
		
		
		String rowsS = "";
		int rows = 0;
		String colsS = "";
		int cols = 0;
		int cellNum = 0;
		
		try
		{
			rowsS = rowIn.getText();
			rows = Integer.parseInt(rowsS);
			colsS = colIn.getText();
			cols = Integer.parseInt(colsS);
			cellNum = rows * cols;
			
			outFile = new PrintWriter(fileName.getText() + ".txt");
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File creation failed. Please try again.");
		}
		catch(NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null, "Error parsing rows/columns.\n Please input data and try again.");
		}
		
		
		
		try
		{
			outFile.println("public static JPanel " + methodName);
			outFile.println("{");
			outFile.println("	JPanel " + panelName +" = new JPanel();");
			outFile.println("	JLabel " + labelName +" = new JLabel(" +quotes+ inFileName + quotes+");");
			outFile.println();
			outFile.println();
			outFile.println("	" +panelName + ".setSize(new Dimension(550, 200));");
			outFile.println("	" +panelName + ".setLayout(null);");
			outFile.println();	
			outFile.println("	" +labelName +".setSize(100, 30);");
			outFile.println("	" +labelName +".setLocation(0,0);");
			outFile.println("	" +panelName + ".add("+labelName+");");
			outFile.println();
			outFile.println("	try");
			outFile.println("	{");
			outFile.println("		inFile = new Scanner(new FileReader("+quotes+inFileName+".txt"+quotes+"));");
			outFile.println("	}");
			outFile.println("	catch(FileNotFoundException fnfe)");
			outFile.println("	{");
			outFile.println("		JOptionPane.showMessageDialog(null, "+quotes+noFile+quotes+");");
			outFile.println("	}");
			outFile.println();
			outFile.print("	String[] title ={");
			for(int counter = 0; counter < titleOut.length; counter++)
			{
				if(titleOut.length - counter != 1)
					outFile.print(quotes+titleOut[counter] + quotes+",");
				else
					outFile.println(quotes+titleOut[counter] + quotes+"};");
			}
			outFile.println("	String[] cellName = new String[" + cellNum + "];");
			outFile.println("	int counter = 0;");
			outFile.println();
			outFile.println("	while(inFile.hasNext())");
			outFile.println("	{");
			outFile.println("		cellName[counter] = inFile.nextLine();");
			outFile.println("		counter++;");
			outFile.println("	}");
			outFile.println();
			outFile.println("	Object[][] content = {");
			cellNum = 0;
			for(int counter = 0; counter < rows; counter++)
			{
				for(int counts = 0; counts < cols; counts++)
				{
					if(counts == 0)
						outFile.print("		{cellName[" + cellNum +"], ");
					else if(cols - counts == 1 && rows - counter != 1)
					{
						outFile.print("cellName[" + cellNum +"]},");
					}
					else if(cols - counts == 1 && rows - counter == 1)
					{
						outFile.print("cellName[" + cellNum +"]}");
					}
					else
					{
						outFile.print("cellName[" + cellNum +"], ");
					}
					cellNum++;
				}
				outFile.println();
			}			
			outFile.println("		};");
			outFile.println();
			outFile.println("	JTable table = new JTable(content, title);");
			outFile.println("	JScrollPane scrollPane = new JScrollPane(table);");
			outFile.println("	scrollPane.setSize(500, 150);");
			outFile.println("	scrollPane.setLocation(10,30);");
			outFile.println("	" +panelName+".add(scrollPane);");
			outFile.println();
			outFile.println("	if(inputOne == "+visNUM+" || inputTwo == "+visNUM+")");
			outFile.println("	{");
			outFile.println("		"+panelName+".setVisible(true);");
			outFile.println("		if(!"+panelName+"bool)");
			outFile.println("		{");
			outFile.println("			numOfTabs += 1;");
			outFile.println("			"+panelName+"bool = true;");
			outFile.println("		}");
			outFile.println("	}");
			outFile.println("	else if(inputOne == "+visNUM+"999 || inputTwo == "+visNUM+"999)");
			outFile.println("	{");
			outFile.println("		" +panelName+".setVisible(false);");
			outFile.println("		if("+panelName+"bool)");
			outFile.println("		{");
			outFile.println("			numOfTabs -= 1;");
			outFile.println("			"+panelName+"bool = false;");
			outFile.println("		}");
			outFile.println("	}");
			outFile.println();
			outFile.println();
			outFile.println("	if(numOfTabs > "+priInput+")");
			outFile.println("	{");
			outFile.println("		" +panelName+".setLocation(10, "+((priNum-1) * 220)+");");
			outFile.println("	}");
			outFile.println("	else if (numOfTabs <= "+priInput+" && numOfTabs > 0)");
			outFile.println("	{");
			outFile.println("		"+panelName+".setLocation(10, ((numOfTabs - 1) * 220));");
			outFile.println("	}");
			outFile.println("	else");
			outFile.println("	{");
			outFile.println("		"+panelName+".setLocation(10, 0);");
			outFile.println("	}");
			outFile.println("	return "+panelName+";");
			outFile.println("}");
			outFile.flush();
		}
		catch(NullPointerException npe)
		{
			JOptionPane.showMessageDialog(null, "Entry error. Please try again.");
		}
		//catch(NumberFormatException nfe)
		//{
		//	JOptionPane.showMesage
		//}
	}
}

