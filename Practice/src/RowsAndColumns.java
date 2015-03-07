

/*
This program allows the user to select number of rows and columns and
generate code for a table.
 */

import javax.swing.*;

import java.awt.event.*;
import java.io.*;

public class RowsAndColumns extends JFrame implements ActionListener
{
	JLabel rowL = new JLabel("Rows:");
	JTextField rowIn = new JTextField("");
	JLabel colL = new JLabel("Columns:");
	JTextField colIn = new JTextField("");
	JLabel fileL = new JLabel("Save As:");
	JTextField fileName = new JTextField("");
	JButton generate = new JButton("Generate");
	JButton reset = new JButton("Reset");
	
	PrintWriter outFile = null;
	
	static JFrame frame = null;
	
	RowsAndColumns()
	{
		this.setSize(300, 300);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Rows & Columns");
		
		this.setLayout(null);
		
		rowL.setSize(100, 30);
		rowL.setLocation(10, 10);
		this.add(rowL);
		
		rowIn.setSize(100, 30);
		rowIn.setLocation(10, 40);
		this.add(rowIn);
		
		colL.setSize(100, 30);
		colL.setLocation(115, 10);
		this.add(colL);
		
		colIn.setSize(100, 30);
		colIn.setLocation(115, 40);
		this.add(colIn);
		
		fileL.setSize(60, 30);
		fileL.setLocation(10, 80);
		this.add(fileL);
		
		fileName.setSize(100, 30);
		fileName.setLocation(70, 80);
		this.add(fileName);
		
		generate.setSize(100, 30);
		generate.setLocation(10, 120);
		generate.addActionListener(this);
		this.add(generate);
		
		reset.setSize(100, 30);
		reset.setLocation(115, 120);
		reset.addActionListener(this);
		this.add(reset);
	}
	
	public static void main(String[] args) 
	{
		frame = new RowsAndColumns();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == generate)
		{
			try
			{
				outFile = new PrintWriter(fileName.getText() + ".txt");
			}
			catch(FileNotFoundException fnfe)
			{
				JOptionPane.showMessageDialog(null, "File creation failed. Please try again.");
			}
			
			String rowsS = rowIn.getText();
			int rows = Integer.parseInt(rowsS);
			String colsS = colIn.getText();
			int cols = Integer.parseInt(colsS);
			int cellNum = rows * cols;
			
			outFile.print("String[] cellName = new String[" + cellNum + "];");
			/*for(int counter = 0; counter < rows * cols; counter++)
			{
				
				if(counter % 5 == 0 && cellNum != 0)
				{
					outFile.println("cell" + cellNum + "=null,");
				}
				else if((rows * cols) - counter == 1)
				{
					outFile.println("cell" + cellNum + "=null;");
				}
				else
				{
					outFile.print("cell" + cellNum + "=null, ");
				}
				cellNum++;
				
			}*/
			
			cellNum = 0;
			
			outFile.println();
			outFile.println();
			for(int counter = 0; counter < rows; counter++)
			{
				for(int counts = 0; counts < cols; counts++)
				{
					if(counts == 0)
						outFile.print("{cellName[" + cellNum +"], ");
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
			
			outFile.flush();
		}
		else if(ae.getSource() == reset)
		{
			rowIn.setText("");
			colIn.setText("");
			fileName.setText("");
		}
	}

}
