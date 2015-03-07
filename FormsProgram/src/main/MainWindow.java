package main;

/*
This frame will serve as the main window that all operations process through.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class MainWindow extends JFrame implements ActionListener, ItemListener
{
	JCheckBox one , two, three, four, five, six, seven, eight, nine,
	ten, eleven, twelve, thirT, fourT, fifT, sixT, sevenT, eightT,
	nineT, twenty, twenty1, twenty2, twenty3, twenty4, twenty5;
	
	JPanel leftPanel = new JPanel(new GridLayout(0,1));
	JScrollPane leftScroll = null;
	JLabel catTitle = new JLabel("Category Codes:     ");
	JButton apply = new JButton("Apply");
	
	JPanel topInfo = new JPanel(new GridLayout(3, 8));
	JScrollPane topScroll = null;
	JMenuBar menuBar = new JMenuBar();
	JMenu menuFile, menuEdit, menuSystem;
	JMenuItem menuNew, menuSave, menuSaveAs, menuOpen, menuExit; //menuFile, in order top to bottom
	JMenuItem menuPreview; //menuEdit, in order top to bottom
	JMenuItem menuLogout; // menuSystem, in order top to bottom
	static JScrollPane centerScroll = null;
	static JPanel centerPanel = new JPanel();
	static JComponent comp = null;
	static JLabel testLabel = new JLabel("Test Label");
	//static JPanel catPanel = new JPanel();
	JEditorPane website = null;
	static JScrollPane rightScroll = null;
	JFileChooser fc = new JFileChooser();
	
	 
	static JFrame frame = null;
	
	static String instG = "";
	JLabel instL = new JLabel("Installation:");
	JLabel instIn = new JLabel("TEST");
	static String instUICG = "";
	JLabel instUICL = new JLabel("Installation UIC:");
	JLabel instUICIn = new JLabel("TEST");
	static String usrG = "";
	JLabel usrL = new JLabel("User:");
	JLabel usrIn = new JLabel("TEST");
	static String usrUICG = "";
	JLabel usrUICL = new JLabel("User UIC:");
	JLabel usrUICIn = new JLabel("TEST");
	static String siteG = "";
	JLabel siteL = new JLabel("Site(Special Area):  ");
	JLabel siteIn = new JLabel("TEST");
	static String planG = "";
	JLabel planL = new JLabel("Planning Area:");
	JLabel planIn = new JLabel("TEST");
	static String ccnG = "";
	JLabel ccnL = new JLabel("CCN:");
	JLabel ccnIn = new JLabel("TEST");
	static String nomenG = "";
	JLabel nomenL = new JLabel("Nomenclature:");
	JLabel nomenIn = new JLabel("TEST");
	JLabel empty = new JLabel("");
	JLabel empty1 = new JLabel("");
	JLabel empty2 = new JLabel("");
	JLabel empty3 = new JLabel("");
	JLabel empty4 = new JLabel("");
	JLabel empty5 = new JLabel("");
	static double oneN = 722.101999,twoN = 722.102999,
			threeN = 721.21999,fourN = 730.101999,fiveN = 730.102999;
	static double[] tableNums = new double[5];
	static int saveVar = 0;
	static int numOfTables = 0;
	static int saveEn = 0;
	static File file = null;
	static String fileName = "";
	static File loc = null;
	static String location = "";
	static String locationNew = "";
	
	MainWindow()
	{		
		this.setLayout(new BorderLayout());
		this.setSize(1000, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Main");

        instIn.setText(instG);
        instUICIn.setText(instUICG);
        usrIn.setText(usrG);
        usrUICIn.setText(usrUICG);
        siteIn.setText(siteG);
        planIn.setText(planG);
        ccnIn.setText(ccnG);
        nomenIn.setText(nomenG);
        topInfo.add(instL);
        topInfo.add(instUICL);
        topInfo.add(usrL);
        topInfo.add(usrUICL);
        topInfo.add(siteL);
        topInfo.add(planL);
        topInfo.add(ccnL);
        topInfo.add(nomenL);
        topInfo.add(instIn);
        topInfo.add(instUICIn);
        topInfo.add(usrIn);
        topInfo.add(usrUICIn);
        topInfo.add(siteIn);
        topInfo.add(planIn);
        topInfo.add(ccnIn);
        topInfo.add(nomenIn);
        topInfo.add(empty);
        topInfo.add(empty1);
        topInfo.add(empty2);
        topInfo.add(empty3);
        topInfo.add(empty4);
        topInfo.add(empty5);
        topScroll = new JScrollPane(topInfo);
        this.add(topScroll, BorderLayout.NORTH);
        
        one = new JCheckBox("722-10A");
		one.addItemListener(this);
		two  = new JCheckBox("722-10B");
		two.addItemListener(this);
		three = new JCheckBox("721-21");
		three.addItemListener(this);
		four  = new JCheckBox("730-10A");
		four.addItemListener(this);
		five  = new JCheckBox("730-10B");
		five.addItemListener(this);
		six  = new JCheckBox("730-13");
		six.addItemListener(this);
		seven = new JCheckBox("730-15A");
		eight = new JCheckBox("730-35");
		nine = new JCheckBox("9");
		ten = new JCheckBox("10");
		eleven = new JCheckBox("11");
		twelve = new JCheckBox("12");
		thirT = new JCheckBox("13");
		fourT = new JCheckBox("14");
		fifT = new JCheckBox("15");
		sixT = new JCheckBox("16");
		sevenT = new JCheckBox("17");
		eightT = new JCheckBox("18");
		nineT = new JCheckBox("19");
		twenty = new JCheckBox("20");
		twenty1 = new JCheckBox("21");
		twenty2 = new JCheckBox("22");
		twenty3 = new JCheckBox("23");
		twenty4 = new JCheckBox("24");
		twenty5 = new JCheckBox("25");
		apply.addActionListener(this);
		apply.setMnemonic(KeyEvent.VK_A);
        
        leftPanel.add(catTitle);
        leftPanel.add(apply);
        leftPanel.add(one);
        leftPanel.add(two);
        leftPanel.add(three);
        leftPanel.add(four);
        leftPanel.add(five);
        leftPanel.add(six);
        leftPanel.add(seven);
        leftPanel.add(eight);
        leftPanel.add(nine);
        leftPanel.add(ten);
        leftPanel.add(eleven);
        leftPanel.add(twelve);
        leftPanel.add(thirT);
        leftPanel.add(fourT);
        leftPanel.add(fifT);
        leftPanel.add(sixT);
        leftPanel.add(sevenT);
        leftPanel.add(eightT);
        leftPanel.add(nineT);
        leftPanel.add(twenty);
        leftPanel.add(twenty1);
        leftPanel.add(twenty2);
        leftPanel.add(twenty3);
        leftPanel.add(twenty4);
        leftPanel.add(twenty5);
        leftScroll = new JScrollPane(leftPanel);
        this.add(leftScroll, BorderLayout.WEST);
        
        centerScroll = new JScrollPane(CenterStuff.CreateGUI());
        this.add(centerScroll, BorderLayout.CENTER);
        
        rightScroll = new JScrollPane(CatCodeTables.CreateGUI(0, 0));
        this.add(rightScroll, BorderLayout.EAST);
	}
	
	public JMenuBar createMenuBar()
	{
		menuFile = new JMenu("File");
		menuFile.getAccessibleContext().setAccessibleDescription("File Menu");
		menuFile.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menuFile);
		
		menuNew = new JMenuItem("New Form");
		menuNew.addActionListener(this);
		menuFile.add(menuNew);
		
		menuSave = new JMenuItem("Save Form");
		menuSave.addActionListener(this);
		//menuSave.setEnabled(false);
		menuFile.add(menuSave);
		
		menuSaveAs = new JMenuItem("Save As");
		menuSaveAs.addActionListener(this);
		menuFile.add(menuSaveAs);
		
		menuOpen = new JMenuItem("Open Form");
		menuOpen.addActionListener(this);
		menuFile.add(menuOpen);
		
		menuExit = new JMenuItem("Exit");
		menuExit.addActionListener(this);
		menuExit.setMnemonic(KeyEvent.VK_E);
		menuFile.add(menuExit);
		
		
		menuEdit = new JMenu("Edit");
		menuEdit.getAccessibleContext().setAccessibleDescription("Edit Menu");
		menuBar.add(menuEdit);
		
		menuPreview = new JMenuItem("Preview");
		menuPreview.addActionListener(this);
		menuEdit.add(menuPreview);
		
		
		menuSystem = new JMenu("System");
		menuSystem.getAccessibleContext().setAccessibleDescription("System Menu");
		menuBar.add(menuSystem);
		
		menuLogout = new JMenuItem("Log Out");
		menuLogout.addActionListener(this);
		menuSystem.add(menuLogout);
		
		return menuBar;
	}

	public static void main(String[] args) 
	{
		CreateGUI(null, null, null, null, null, null, null, null);
		//NewForm.CreateGUI();
	}

	public static void CreateGUI(String inst, String instU, String usr, String usrU, String site, String plan, String ccn, String nomen)
	{
		instG = inst;
		instUICG = instU;
		usrG = usr;
		usrUICG = usrU;
		siteG = site;
		planG = plan;
		ccnG = ccn;
		nomenG = nomen;		
		
		MainWindow menuBarTop = new MainWindow();
		frame = new MainWindow();
		frame.setJMenuBar(menuBarTop.createMenuBar());
		frame.setVisible(true);
		frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == one)
		{
			if(oneN != 722.101)
			{
				oneN = 722.101;
				numOfTables += 1;
			}
			else
			{
				oneN = 722.101999;
				numOfTables -= 1;
			}
		}
		else if(ie.getSource() == two)
		{
			if(twoN != 722.102)
			{
				twoN = 722.102;
				numOfTables += 1;
			}
			else
			{
				twoN = 722.102999;
				numOfTables -= 1;
			}
		}
		else if(ie.getSource() == three)
		{
			if(threeN != 721.21)
			{
				threeN = 721.21;
				numOfTables += 1;
			}
			else
			{
				threeN = 721.21999;
				numOfTables -= 1;
			}
		}
		else if(ie.getSource() == four)
		{
			if(fourN != 730.101)
			{
				fourN = 730.101;
				numOfTables += 1;
			}
			else
			{
				fourN = 730.101999;
				numOfTables -= 1;
			}
		}
		else if(ie.getSource() == five)
		{
			if(fiveN != 730.102)
			{
				fiveN = 730.102;
				numOfTables += 1;
			}
			else
			{
				fiveN = 730.102999;
				numOfTables -= 1;
			}
		}
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == menuExit)
		{
			System.exit(0);
		}
		
		else if(ae.getSource() == apply)
		{
			tableNums[0] = oneN;
			tableNums[1] = twoN;
			tableNums[2] = threeN;
			tableNums[3] = fourN;
			tableNums[4] = fiveN;
			for(int counter = 0; counter < tableNums.length; counter++)
			{
				CatCodeTables.currentBottom = 0;
				CatCodeTables.CreateGUI(tableNums[counter], 0);
			}
		}
		
		else if(ae.getSource() == menuPreview)
		{
			PreviewWindow.CreateGUI();
		}
		
		else if(ae.getSource() == menuSaveAs)
		{
			int returnVal = fc.showSaveDialog(MainWindow.this);
			if (returnVal == JFileChooser.APPROVE_OPTION) 
			{
				file = fc.getSelectedFile();
				fileName = file.toString();
				loc = fc.getCurrentDirectory();
				location = loc.toString();
				for(int counter = 0; counter < location.length(); counter++)
				{
					char testCh = location.charAt(counter);
					char slash = 92;
					if(testCh == slash)
					{
						testCh = '/';
					}
					locationNew += testCh;
				}
				locationNew += "/";
				CenterStuff.purp.setText(location);
				PreviewWindow.DocumentBuild(fileName, location);
				
				if(saveEn == 0)
				{
					menuSave.setEnabled(true);
					saveEn = 1;
				}
			} 
		}
		else if(ae.getSource() == menuSave)
		{
			if(saveEn == 0)
			{
				int returnVal = fc.showSaveDialog(MainWindow.this);
				if (returnVal == JFileChooser.APPROVE_OPTION) 
				{
					file = fc.getSelectedFile();
					fileName = file.toString();
					loc = fc.getCurrentDirectory();
					location = loc.toString();
					for(int counter = 0; counter < location.length(); counter++)
					{
						char testCh = location.charAt(counter);
						char slash = 92;
						if(testCh == slash)
						{
							testCh = '/';
						}
						locationNew += testCh;
					}
					locationNew += "/";
					CenterStuff.purp.setText(location);
					PreviewWindow.DocumentBuild(fileName, location);
					
					saveEn = 1;
				} 
			}
			else
			{
				PreviewWindow.DocumentBuild(fileName, location);
			}
		}
	}
}
