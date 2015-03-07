package feb12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JFrameInherit extends JFrame implements ActionListener, ItemListener
{
	private JLabel label1 = new JLabel("First Label");
	private JButton button1 = new JButton("Push Me");
	//private JTextField text1 = new JTextField(50);
	private JTextField name = new JTextField("Type your name here");
	private JButton button2 = new JButton("Window Reset");
	private JButton exit = new JButton("Exit");
	private JCheckBox check = new JCheckBox("Check Me");
	
	private JRadioButton rb1 = new JRadioButton("First");
	private JRadioButton rb2 = new JRadioButton("Second");
	private JRadioButton rb3 = new JRadioButton("Third");
	private ButtonGroup group = new ButtonGroup();
	
	JTextArea area = new JTextArea(25, 40);
	
	static JFrame frame = null;
	
	JComboBox combo = new JComboBox();
	
	int countB1 = 0;
	int countB2 = 0;
	
	JFrameInherit()
	{
		this.setSize(700, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(300, 200);
		this.setTitle("New Title");
			
		this.setLayout(null);
		
		label1.setSize(150, 50);
		label1.setLocation(10, 20);
		this.add(label1);
		
		button1.setSize(150, 50);
		button1.setLocation(10, 90);
		button1.addActionListener(this);
		this.add(button1);
		
		check.setSize(150, 50);
		check.setLocation(180, 20);
		check.addItemListener(this);
		this.add(check);
		
		name.setSize(150, 50);
		name.setLocation(180, 90);
		name.addActionListener(this);
		this.add(name);
		
		rb1.setSize(100, 25);
		rb1.setLocation(350, 10);
		rb1.addItemListener(this);
		this.add(rb1);
		group.add(rb1);
		
		rb2.setSize(100, 25);
		rb2.setLocation(350, 35);
		rb2.addItemListener(this);
		this.add(rb2);
		group.add(rb2);
		
		rb3.setSize(100, 25);
		rb3.setLocation(350, 60);
		rb3.addItemListener(this);
		this.add(rb3);
		group.add(rb3);
		
		
		button2.setSize(330, 50);
		button2.setLocation(10, 160);
		button2.addActionListener(this);
		this.add(button2);
		
		exit.setSize(330, 50);
		exit.setLocation(10, 230);
		exit.addActionListener(this);
		this.add(exit);
		
		combo.addItem("Red");
		combo.addItem("Green");
		combo.addItem("Blue");
		combo.setSize(80, 35);
		combo.setLocation(10, 290);
		combo.addItemListener(this);
		this.add(combo);
		
		area.setSize(200, 150);
		area.setLocation(10,350);
		area.setLineWrap(true);
		this.add(area);
	}
	
	public static void main(String[] args) 
	{
		frame = new JFrameInherit();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if (ae.getSource() == button1)
		{
			name.setEditable(true);
			countB1++;
			if (countB1 %2 != 0)
			{
				button1.setBackground(Color.red);
			}
			else
			{
				button1.setBackground(this.getBackground());
			}
			
		}
		else if (ae.getSource() == name)
		{
			String nameIt = name.getText();
			label1.setText(nameIt);
			name.setEditable(false);
		}
		else if (ae.getSource() == button2)
		{
			frame.setVisible(false);
			frame = new JFrameInherit();
			frame.setVisible(true);
		}
		else if (ae.getSource() == exit)
		{
			JOptionPane.showMessageDialog(null, "Good-Bye");
			System.exit(0);
		}
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == check)
		{
			check.setBackground(Color.green);
			check.setForeground(Color.red);
		}
		else if(ie.getSource() == rb1)
		{
			rb1.setText("Chosen 1");
			rb1.setBackground(Color.cyan);
			rb2.setText("Second");
			rb2.setBackground(this.getBackground());
			rb3.setText("Third");
			rb3.setBackground(this.getBackground());
		}
		else if(ie.getSource() == rb2)
		{
			rb2.setText("Chosen 2");
			rb2.setBackground(Color.yellow);
			rb1.setText("First");
			rb1.setBackground(this.getBackground());
			rb3.setText("Third");
			rb3.setBackground(this.getBackground());
		}
		else if(ie.getSource() == rb3)
		{
			rb3.setText("Chosen 3");
			rb3.setBackground(Color.orange);
			rb1.setText("First");
			rb1.setBackground(this.getBackground());
			rb2.setText("Second");
			rb2.setBackground(this.getBackground());
		}
		else
		{
			if(combo.getSelectedIndex() == 0)
			{
				combo.setBackground(Color.red);
			}
			else if(combo.getSelectedIndex() == 1)
			{
				combo.setBackground(Color.green);
			}
			if(combo.getSelectedIndex() == 2)
			{
				combo.setBackground(Color.blue);
			}
		}
	}

}
