package main;


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;


public class MainWindow extends JFrame implements ActionListener, ItemListener
{
	private JButton saveB = new JButton("Save");
	private JTextField saveN = new JTextField("");
	private JLabel desks = new JLabel("Desks");
	private JComboBox deskInput = new JComboBox();
	private JLabel offices = new JLabel("Offices");
	private JComboBox officeInput = new JComboBox();
	private JButton calculate = new JButton("Calculate");
	private JButton preview = new JButton("Preview");
	private JLabel totalFeet = new JLabel("");
	JTextArea area = new JTextArea(25, 40);
	JComboBox fileType = new JComboBox();
	private JButton saveLocation = new JButton("...");
	JFileChooser fc = new JFileChooser();
	JMenuBar menuBar = new JMenuBar();
	JMenu menuOne = new JMenu("File");
	JMenu menuTwo = new JMenu("Form");
	JMenuItem menuFile, menuSave, menuOpen, menuExit, menuPreview;
	
	public int menuSel = 0;
	String fileTypeS = "";
	public int deskNum = 0;
	public int officeNum = 0;
	//private static String fileName = "";
	//private static PrintWriter saveOut = null;
	
	static JFrame frame = null;
	static JFrame frame2 = null;
	
	MainWindow()
	{
		this.setSize(600, 600);
		//this.setSize(getPreferredSize());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 100);
		//this.setLocation(0,0);
		this.setTitle("Main Menu");
		
		this.setLayout(null);
		
		//saveB.setSize(80, 35);
		//saveB.setLocation(10, 10);
		//saveB.addActionListener(this);
		//this.add(saveB);
		
		//saveN.setSize(180, 35);
		//saveN.setLocation(100, 10);
		//this.add(saveN);
		
		//saveLocation.setSize(25, 35);
		//saveLocation.setLocation(280, 10);
		//saveLocation.addActionListener(this);
		//this.add(saveLocation);
		
		//fileType.addItem("File Type");
		//fileType.addItem(".doc");
		//fileType.addItem(".pdf");
		//fileType.addItem(".txt");
		//fileType.setSize(80, 35);
		//fileType.setLocation(320, 10);
		//fileType.addItemListener(this);
		//this.add(fileType);
		
		preview.setSize(80, 35);
		preview.setLocation(410, 10);
		preview.addActionListener(this);
		this.add(preview);
		
		area.setSize(200, 200);
		area.setLocation(10,300);
		area.setLineWrap(true);
		this.add(area);
		
		desks.setSize(80, 35);
		desks.setLocation(10, 60);
		this.add(desks);
		
		deskInput.addItem("0");
		deskInput.addItem("1");
		deskInput.addItem("2");
		deskInput.addItem("3");
		deskInput.addItem("4");
		deskInput.addItem("5");
		deskInput.setSize(80, 35);
		deskInput.setLocation(10, 105);
		deskInput.addItemListener(this);
		this.add(deskInput);
		
		offices.setSize(80, 35);
		offices.setLocation(100, 60);
		this.add(offices);
		
		officeInput.addItem("0");
		officeInput.addItem("1");
		officeInput.addItem("2");
		officeInput.addItem("3");
		officeInput.addItem("4");
		officeInput.addItem("5");
		officeInput.setSize(80, 35);
		officeInput.setLocation(100, 105);
		officeInput.addItemListener(this);
		this.add(officeInput);
		
		calculate.setSize(120, 35);
		calculate.setLocation(200, 60);
		calculate.addActionListener(this);
		this.add(calculate);
		
		totalFeet.setSize(100, 35);
		totalFeet.setLocation(200, 105);
		this.add(totalFeet);
		}
	
	public JMenuBar createMenuBar()
	{
		menuOne.getAccessibleContext().setAccessibleDescription("File Menu");
		menuBar.add(menuOne);
		
		menuFile = new JMenuItem("New Form", KeyEvent.VK_N);
		menuFile.addActionListener(this);
		menuOne.add(menuFile);
		
		menuSave = new JMenuItem("Save Form", KeyEvent.VK_S);
		menuSave.addActionListener(this);
		menuOne.add(menuSave);
		
		menuOpen = new JMenuItem("Open Form", KeyEvent.VK_O);
		menuOpen.addActionListener(this);
		menuOne.add(menuOpen);
		
		menuExit = new JMenuItem("Exit", KeyEvent.VK_X);
		menuExit.addActionListener(this);
		menuOne.add(menuExit);
		
		
		menuTwo.getAccessibleContext().setAccessibleDescription("Form Menu");
		menuBar.add(menuTwo);
		
		menuPreview = new JMenuItem("Preview", KeyEvent.VK_P);
		menuPreview.addActionListener(this);
		menuTwo.add(menuPreview);
		
		return menuBar;
	}
	
	public static void main(String[] args) 
	{
		MainWindow demo = new MainWindow();
		frame = new MainWindow();
		frame.setJMenuBar(demo.createMenuBar());
		frame.setVisible(true);
		
		
		//frame.setContentPane(demo.MainWindow());
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == fileType)
		{
			if(fileType.getSelectedIndex() == 0)
			{
				fileTypeS = ".doc";
			}
			else if(fileType.getSelectedIndex() == 1)
			{
				fileTypeS = ".doc";
			}
			else if(fileType.getSelectedIndex() == 2)
			{
				fileTypeS = ".pdf";
			}
			else if(fileType.getSelectedIndex() == 3)
			{
				fileTypeS = ".txt";
			}
		}
		else if(ie.getSource() == deskInput)
		{
			if(deskInput.getSelectedIndex() == 0)
			{
				deskNum = 0;
			}
			else if(deskInput.getSelectedIndex() == 1)
			{
				deskNum = 1;
			}
			else if(deskInput.getSelectedIndex() == 2)
			{
				deskNum = 2;
			}
			else if(deskInput.getSelectedIndex() == 3)
			{
				deskNum = 3;
			}
			else if(deskInput.getSelectedIndex() == 4)
			{
				deskNum = 4;
			}
			else if(deskInput.getSelectedIndex() == 5)
			{
				deskNum = 5;
			}
		}
		else if(ie.getSource() == officeInput)
		{
			if(officeInput.getSelectedIndex() == 0)
			{
				officeNum = 0;
			}
			else if(officeInput.getSelectedIndex() == 1)
			{
				officeNum = 1;
			}
			else if(officeInput.getSelectedIndex() == 2)
			{
				officeNum = 2;
			}
			else if(officeInput.getSelectedIndex() == 3)
			{
				officeNum = 3;
			}
			else if(officeInput.getSelectedIndex() == 4)
			{
				officeNum = 4;
			}
			else if(officeInput.getSelectedIndex() == 5)
			{
				officeNum = 5;
			}
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		/*if(ae.getSource() == saveB)
		{
			PrintWriter saveOut = null;
			
			try
			{
				//String areaA = area.getText();
				String fileName = saveN.getText() + fileTypeS;
				saveOut = new PrintWriter(fileName);
				saveOut.print(area.getText());
				saveOut.flush();
			}
			catch(NullPointerException npe)
			{
				JOptionPane.showMessageDialog(null, "NPE");
			}
			catch(FileNotFoundException fnfe)
			{
				JOptionPane.showMessageDialog(null, "FNFE");
			}
			finally
			{
				saveOut.close();
			}
		}*/
		if(ae.getSource() == calculate)
		{
			totalFeet.setText("");
			int deskT = 0;
			int officeT = 0;
			int total = 0;
			
			deskT = deskNum * 8;
			officeT = officeNum * 12;
			total = deskT + officeT;
			totalFeet.setText(total + " SQR Feet");
		}
		else if(ae.getSource() == preview || ae.getSource() == menuPreview)
		{
			if(MainMenu.formSelected == 1)
			{
				forms.StandardFormOne.main(null);
			}
			else if(MainMenu.formSelected == 2)
			{
				forms.StandardFormTwo.main(null);
			}
			else
			{
				forms.StandardFormOne.main(null);
			}
		}
		else if (ae.getSource() == saveLocation || ae.getSource() == menuSave) 
		{
            int returnVal = fc.showSaveDialog(MainWindow.this);
            
            if (returnVal == JFileChooser.APPROVE_OPTION) 
            {
            	File file = fc.getSelectedFile();
            	//This is where a real application would save the file.
            	//log.append("Saving: " + file.getName() + "." + newline);
            	PrintWriter saveOut = null;
            	
            	File currentLoc = fc.getCurrentDirectory();
            	String currentName = fc.getName();
    			System.out.println(currentName);
            	
    			try
    			{
    				//String areaA = area.getText();
    				String fileName = saveN.getText() + fileTypeS;
    				saveOut = new PrintWriter(currentLoc);
    				saveOut.print(area.getText());
    				saveOut.flush();
    			}
    			catch(NullPointerException npe)
    			{
    				JOptionPane.showMessageDialog(null, "NPE");
    			}
    			catch(FileNotFoundException fnfe)
    			{
    				JOptionPane.showMessageDialog(null, "FNFE");
    			}
    			finally
    			{
    				saveOut.close();
    			}
            } 
            else 
            {
            	//log.append("Save command cancelled by user." + newline);
            }
            //log.setCaretPosition(log.getDocument().getLength());
        }
		else if(ae.getSource() == menuOpen)
		{
			 int returnVal = fc.showOpenDialog(MainWindow.this);

	            if (returnVal == JFileChooser.APPROVE_OPTION) {
	                File file = fc.getSelectedFile();
	                //This is where a real application would open the file.
	               // log.append("Opening: " + file.getName() + "." + newline);
	            } else {
	                //log.append("Open command cancelled by user." + newline);
	            }
		}
		else if(ae.getSource() == menuExit)
		{
			System.exit(0);
		}
	}
}
