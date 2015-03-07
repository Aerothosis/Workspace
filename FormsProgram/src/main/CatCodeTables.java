package main;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class CatCodeTables extends JPanel 
{
	static JPanel tables = new JPanel();
	
	static JPanel sev2210A = new JPanel();
	static JLabel sev2210AL = new JLabel("722.10A");
	static JPanel sev2210B = new JPanel();
	static JLabel sev2210BL = new JLabel("722.10B");
	static JPanel sev2121 = new JPanel();
	static JPanel sev3010A = new JPanel();
	static JPanel sev3010B = new JPanel();
	
	static boolean sev2210Abool = false;
	static boolean sev2210Bbool = false;
	static boolean sev2121bool = false;
	static boolean sev3010Abool = false;
	static boolean sev3010Bbool = false;
	static double inputOne = 0, inputTwo = 0;
	
	static int numOfTabs = 0;
	static int currentBottom = 0;
	static int[] curBtm = new int[5];
	
	static Scanner inFile = null;
	
	public static JPanel CreateGUI(double oneI, double twoI)
	{
		tables.setPreferredSize(new Dimension(550, (int)((numOfTabs + 1) * 220)));
		tables.setLayout(null);
		inputOne = oneI;
		inputTwo = twoI;
		
		tables.add(Seven2210A());
		if(!sev2210Abool)
			sev2210A.setVisible(false);
		tables.add(Seven2210B());
		if(!sev2210Bbool)
			sev2210B.setVisible(false);
		tables.add(Seven2121());
		if(!sev2121bool)
			sev2121.setVisible(false);
		tables.add(Seven3010A());
		if(!sev3010Abool)
			sev3010A.setVisible(false);
		tables.add(Seven3010B());
		if(!sev3010Bbool)
			sev3010B.setVisible(false);
		
		CenterStuff.desc.setText("" + numOfTabs);
		
		
		return tables;
	}

	public static JPanel Seven2210A()
	{
		sev2210A.setSize(new Dimension(550, 200));
		sev2210A.setLayout(null);
		//seven2210A.setLocation(0,0);
		sev2210AL.setSize(100, 30);
		sev2210AL.setLocation(0,0);
		sev2210A.add(sev2210AL);
		
		try
		{
			inFile = new Scanner(new FileReader("722.10A.txt"));
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File not found for 722.10A.");
		}
		
		String[] title ={"Type of Mission/Operation", "Percentage to be Served"};
		String[] cellName = new String[22];
		int counter = 0;
		while(inFile.hasNext())
		{
			cellName[counter] = inFile.nextLine();
			counter++;
		}

		Object[][] content = {
			{cellName[0], cellName[1]},
			{cellName[2], cellName[3]},
			{cellName[4], cellName[5]},
			{cellName[6], cellName[7]},
			{cellName[8], cellName[9]},
			{cellName[10], cellName[11]},
			{cellName[12], cellName[13]},
			{cellName[14], cellName[15]},
			{cellName[16], cellName[17]},
			{cellName[18], cellName[19]},
			{cellName[20], cellName[21]}
			};
		
		JTable table = new JTable(content, title);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(500, 150);
		scrollPane.setLocation(0,30);
		sev2210A.add(scrollPane);
		
		if(inputOne == 722.101 || inputTwo == 722.101)
		{
			sev2210A.setVisible(true);
			if(!sev2210Abool)
			{
				numOfTabs += 1;
				sev2210Abool = true;
				curBtm[0] = 1;
			}
			CenterStuff.desc.setText("" + numOfTabs);
		}
		else if(inputOne == 722.101999 || inputTwo == 722.101999)
		{
			sev2210A.setVisible(false);
			if(sev2210Abool)
			{
				numOfTabs -= 1;
				sev2210Abool = false;
				curBtm[0] = 0;
			}
			CenterStuff.desc.setText("" + numOfTabs);
		}
		//else
		//{
		//	sev2210A.setVisible(false);
		//}
			
		sev2210A.setLocation(10,0);
		return sev2210A;
	}
	
	public static JPanel Seven2210B()
	{
		sev2210B.setSize(new Dimension(550, 200));
		sev2210B.setLayout(null);
		//seven2210A.setLocation(0,0);
		sev2210BL.setSize(100, 30);
		sev2210BL.setLocation(0,0);
		sev2210B.add(sev2210BL);
		
		
		
		try
		{
			inFile = new Scanner(new FileReader("722.10B.txt"));
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File not found for 722.10B.");
		}
		
		String[] title ={"Number of Enlisted Personnel to be Served", "Gross Square Foot Area"};
		String[] cellName = new String[24];
		int counter = 0;
		while(inFile.hasNext())
		{
			cellName[counter] = inFile.nextLine();
			counter++;
		}

		Object[][] content = {
				{cellName[0], cellName[1]},
				{cellName[2], cellName[3]},
				{cellName[4], cellName[5]},
				{cellName[6], cellName[7]},
				{cellName[8], cellName[9]},
				{cellName[10], cellName[11]},
				{cellName[12], cellName[13]},
				{cellName[14], cellName[15]},
				{cellName[16], cellName[17]},
				{cellName[18], cellName[19]},
				{cellName[20], cellName[21]},
				{cellName[22], cellName[23]}
			};
		
		JTable table = new JTable(content, title);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(500, 150);
		scrollPane.setLocation(10,30);
		sev2210B.add(scrollPane);
		
		
		if(inputOne == 722.102 || inputTwo == 722.102)
		{
			sev2210B.setVisible(true);
			if(!sev2210Bbool)
			{
				numOfTabs += 1;
				sev2210Bbool = true;
				curBtm[1] = 1;
			}
			CenterStuff.desc.setText("" + numOfTabs);
		}
		else if(inputOne == 722.102999 || inputTwo == 722.102999)
		{
			sev2210B.setVisible(false);
			if(sev2210Bbool)
			{
				numOfTabs -= 1;
				sev2210Bbool = false;
				curBtm[1] = 0;
			}
			CenterStuff.desc.setText("" + numOfTabs);			
		}

		int setBtm = 0;
		for(int counts = 0; counts < 2; counts++)
			setBtm += curBtm[counts];
		sev2210B.setLocation(10, ((setBtm - 1) * 210));			
		
		return sev2210B;
	}
	
	public static JPanel Seven2121()
	{
		JLabel sev2121L = new JLabel("721.21");


		sev2121.setSize(new Dimension(550, 200));
		sev2121.setLayout(null);

		sev2121L.setSize(100, 30);
		sev2121L.setLocation(0,0);
		sev2121.add(sev2121L);

		try
		{
			inFile = new Scanner(new FileReader("721.21.txt"));
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File not found for 721.21");
		}

		String[] title ={"(2+2) module","3 Stories or Less","More than 3 Stories"};
		String[] cellName = new String[9];
		int counter = 0;

		while(inFile.hasNext())
		{
			cellName[counter] = inFile.nextLine();
			counter++;
		}

		Object[][] content = {
			{cellName[0], cellName[1], cellName[2]},
			{cellName[3], cellName[4], cellName[5]},
			{cellName[6], cellName[7], cellName[8]}
			};

		JTable table = new JTable(content, title);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(500, 150);
		scrollPane.setLocation(10,30);
		sev2121.add(scrollPane);

		if(inputOne == 721.21 || inputTwo == 721.21)
		{
			sev2121.setVisible(true);
			if(!sev2121bool)
			{
				numOfTabs += 1;
				sev2121bool = true;
				curBtm[2] = 1;
			}
		}
		else if(inputOne == 721.21999 || inputTwo == 721.21999)
		{
			sev2121.setVisible(false);
			if(sev2121bool)
			{
				numOfTabs -= 1;
				sev2121bool = false;
				curBtm[2] = 0;
			}
		}

		int setBtm = 0;
		for(int counts = 0; counts < 3; counts++)
			setBtm += curBtm[counts];
		sev2121.setLocation(10, ((setBtm - 1) * 210));
		
		return sev2121;
	}
	
	public static JPanel Seven3010A()
	{
		JLabel sev3010AL = new JLabel("730.10A");


		sev3010A.setSize(new Dimension(550, 200));
		sev3010A.setLayout(null);

		sev3010AL.setSize(100, 30);
		sev3010AL.setLocation(0,0);
		sev3010A.add(sev3010AL);

		try
		{
			inFile = new Scanner(new FileReader("730.10A.txt"));
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File not found for 730.10A");
		}

		String[] title ={"Component","Net Area HQ Station (m2)","Net Area HQ Station (SF)"};
		String[] cellName = new String[225];
		int counter = 0;

		while(inFile.hasNext())
		{
			cellName[counter] = inFile.nextLine();
			counter++;
		}

		Object[][] content = {
				{cellName[0], cellName[1], cellName[2]},
				{cellName[3], cellName[4], cellName[5]},
				{cellName[6], cellName[7], cellName[8]},
				{cellName[9], cellName[10], cellName[11]},
				{cellName[12], cellName[13], cellName[14]},
				{cellName[15], cellName[16], cellName[17]},
				{cellName[18], cellName[19], cellName[20]},
				{cellName[21], cellName[22], cellName[23]},
				{cellName[24], cellName[25], cellName[26]},
				{cellName[27], cellName[28], cellName[29]},
				{cellName[30], cellName[31], cellName[32]},
				{cellName[33], cellName[34], cellName[35]},
				{cellName[36], cellName[37], cellName[38]},
				{cellName[39], cellName[40], cellName[41]},
				{cellName[42], cellName[43], cellName[44]},
				{cellName[45], cellName[46], cellName[47]},
				{cellName[48], cellName[49], cellName[50]},
				{cellName[51], cellName[52], cellName[53]},
				{cellName[54], cellName[55], cellName[56]},
				{cellName[57], cellName[58], cellName[59]},
				{cellName[60], cellName[61], cellName[62]},
				{cellName[63], cellName[64], cellName[65]},
				{cellName[66], cellName[67], cellName[68]},
				{cellName[69], cellName[70], cellName[71]},
				{cellName[72], cellName[73], cellName[74]},
				{cellName[75], cellName[76], cellName[77]},
				{cellName[78], cellName[79], cellName[80]},
				{cellName[81], cellName[82], cellName[83]},
				{cellName[84], cellName[85], cellName[86]},
				{cellName[87], cellName[88], cellName[89]},
				{cellName[90], cellName[91], cellName[92]},
				{cellName[93], cellName[94], cellName[95]},
				{cellName[96], cellName[97], cellName[98]},
				{cellName[99], cellName[100], cellName[101]},
				{cellName[102], cellName[103], cellName[104]},
				{cellName[105], cellName[106], cellName[107]},
				{cellName[108], cellName[109], cellName[110]},
				{cellName[111], cellName[112], cellName[113]},
				{cellName[114], cellName[115], cellName[116]},
				{cellName[117], cellName[118], cellName[119]},
				{cellName[120], cellName[121], cellName[122]},
				{cellName[123], cellName[124], cellName[125]},
				{cellName[126], cellName[127], cellName[128]},
				{cellName[129], cellName[130], cellName[131]},
				{cellName[132], cellName[133], cellName[134]},
				{cellName[135], cellName[136], cellName[137]},
				{cellName[138], cellName[139], cellName[140]},
				{cellName[141], cellName[142], cellName[143]},
				{cellName[144], cellName[145], cellName[146]},
				{cellName[147], cellName[148], cellName[149]},
				{cellName[150], cellName[151], cellName[152]},
				{cellName[153], cellName[154], cellName[155]},
				{cellName[156], cellName[157], cellName[158]},
				{cellName[159], cellName[160], cellName[161]},
				{cellName[162], cellName[163], cellName[164]},
				{cellName[165], cellName[166], cellName[167]},
				{cellName[168], cellName[169], cellName[170]},
				{cellName[171], cellName[172], cellName[173]},
				{cellName[174], cellName[175], cellName[176]},
				{cellName[177], cellName[178], cellName[179]},
				{cellName[180], cellName[181], cellName[182]},
				{cellName[183], cellName[184], cellName[185]},
				{cellName[186], cellName[187], cellName[188]},
				{cellName[189], cellName[190], cellName[191]},
				{cellName[192], cellName[193], cellName[194]},
				{cellName[195], cellName[196], cellName[197]},
				{cellName[198], cellName[199], cellName[200]},
				{cellName[201], cellName[202], cellName[203]},
				{cellName[204], cellName[205], cellName[206]},
				{cellName[207], cellName[208], cellName[209]},
				{cellName[210], cellName[211], cellName[212]},
				{cellName[213], cellName[214], cellName[215]},
				{cellName[216], cellName[217], cellName[218]},
				{cellName[219], cellName[220], cellName[221]},
				{cellName[222], cellName[223], cellName[224]}
			};

		JTable table = new JTable(content, title);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(500, 150);
		scrollPane.setLocation(10,30);
		sev3010A.add(scrollPane);

		if(inputOne == 730.101 || inputTwo == 730.101)
		{
			sev3010A.setVisible(true);
			if(!sev3010Abool)
			{
				numOfTabs += 1;
				sev3010Abool = true;
				curBtm[3] = 1;
			}
		}
		else if(inputOne == 730.101999 || inputTwo == 730.101999)
		{
			sev3010A.setVisible(false);
			if(sev3010Abool)
			{
				numOfTabs -= 1;
				sev3010Abool = false;
				curBtm[3] = 0;
			}
		}

		int setBtm = 0;
		for(int counts = 0; counts < 4; counts++)
			setBtm += curBtm[counts];
		sev3010A.setLocation(10, ((setBtm - 1) * 210));
		
		return sev3010A;
	}

	public static JPanel Seven3010B()
	{
		JLabel sev3010BL = new JLabel("730.10B");


		sev3010B.setSize(new Dimension(550, 200));
		sev3010B.setLayout(null);

		sev3010BL.setSize(100, 30);
		sev3010BL.setLocation(0,0);
		sev3010B.add(sev3010BL);

		try
		{
			inFile = new Scanner(new FileReader("730.10B.txt"));
		}
		catch(FileNotFoundException fnfe)
		{
			JOptionPane.showMessageDialog(null, "File not found for 730.10B");
		}

		String[] title ={"Component","Net Area HQ Station (m2)","Net Area HQ Station (SF)"};
		String[] cellName = new String[45];
		int counter = 0;

		while(inFile.hasNext())
		{
			cellName[counter] = inFile.nextLine();
			counter++;
		}

		Object[][] content = {
			{cellName[0], cellName[1], cellName[2]},
			{cellName[3], cellName[4], cellName[5]},
			{cellName[6], cellName[7], cellName[8]},
			{cellName[9], cellName[10], cellName[11]},
			{cellName[12], cellName[13], cellName[14]},
			{cellName[15], cellName[16], cellName[17]},
			{cellName[18], cellName[19], cellName[20]},
			{cellName[21], cellName[22], cellName[23]},
			{cellName[24], cellName[25], cellName[26]},
			{cellName[27], cellName[28], cellName[29]},
			{cellName[30], cellName[31], cellName[32]},
			{cellName[33], cellName[34], cellName[35]},
			{cellName[36], cellName[37], cellName[38]},
			{cellName[39], cellName[40], cellName[41]},
			{cellName[42], cellName[43], cellName[44]}
			};
		
		JTable table = new JTable(content, title);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(500, 150);
		scrollPane.setLocation(10,30);
		sev3010B.add(scrollPane);

		if(inputOne == 730.102 || inputTwo == 730.102)
		{
			sev3010B.setVisible(true);
			if(!sev3010Bbool)
			{
				numOfTabs += 1;
				sev3010Bbool = true;
				curBtm[4] = 1;
			}
		}
		else if(inputOne == 730.102999 || inputTwo == 730.102999)
		{
			sev3010B.setVisible(false);
			if(sev3010Bbool)
			{
				numOfTabs -= 1;
				sev3010Bbool = false;
				curBtm[4] = 0;
			}
		}

		int setBtm = 0;
		for(int counts = 0; counts < 5; counts++)
			setBtm += curBtm[counts];
		sev3010B.setLocation(10, ((setBtm - 1) * 210));
		
		return sev3010B;
	}


}
