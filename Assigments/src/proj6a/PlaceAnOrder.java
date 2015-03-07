package proj6a;

/*
Program: PlaceAnOrder.java
Author: Mike
Date: 2-25-2015
Purpose: Allow the user to select how many items they wish to order. Once selected, they can input
whatever they wish to order in the text field blocks. When they click Place Order, their order will
be echoed back to them.
*/

import javax.swing.*;
import java.awt.event.*;

public class PlaceAnOrder extends JFrame implements ActionListener, ItemListener
{
	JLabel orderL = new JLabel("Items to Order");
	JTextField orderOne = new JTextField("");
	JTextField orderTwo = new JTextField("");
	JTextField orderThree = new JTextField("");
	JTextField orderFour = new JTextField("");
	JTextField orderFive = new JTextField("");
	JComboBox orderNum = new JComboBox();
	JButton order = new JButton("Place Order");
	JButton reset = new JButton("Reset");
	
	
	static JFrame frame = null;
	
	PlaceAnOrder()
	{
		this.setSize(300, 400);
		this.setLocation(300, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Place An Order");
		
		this.setLayout(null);
		
		orderL.setSize(100, 35);
		orderL.setLocation(10, 10);
		this.add(orderL);
		
		orderOne.setSize(100, 35);
		orderOne.setLocation(10, 50);
		orderOne.setEditable(false);
		this.add(orderOne);
		
		orderTwo.setSize(100, 35);
		orderTwo.setLocation(10, 90);
		orderTwo.setEditable(false);
		this.add(orderTwo);
		
		orderThree.setSize(100, 35);
		orderThree.setLocation(10, 130);
		orderThree.setEditable(false);
		this.add(orderThree);
				
		orderFour.setSize(100, 35);
		orderFour.setLocation(10, 170);
		orderFour.setEditable(false);
		this.add(orderFour);
		
		orderFive.setSize(100, 35);
		orderFive.setLocation(10, 210);
		orderFive.setEditable(false);
		this.add(orderFive);
		
		orderNum.setSize(100, 35);
		orderNum.setLocation(150, 50);
		orderNum.addItem("Num of Items");
		orderNum.addItem("1");
		orderNum.addItem("2");
		orderNum.addItem("3");
		orderNum.addItem("4");
		orderNum.addItem("5");
		orderNum.addItemListener(this);
		this.add(orderNum);
		
		order.setSize(120, 35);
		order.setLocation(10, 260);
		order.addActionListener(this);
		this.add(order);
		
		reset.setSize(100, 35);
		reset.setLocation(150, 260);
		reset.addActionListener(this);
		this.add(reset);
		
	}
	
	public static void main(String[] args) 
	{
		frame = new PlaceAnOrder();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == order)
		{
			String order = orderOne.getText() + '\n' +
					orderTwo.getText() + '\n' +
					orderThree.getText() + '\n' +
					orderFour.getText() + '\n' +
					orderFive.getText();
			
			JOptionPane.showMessageDialog(null, "Your order has been placed. Below is your order:" + '\n' + order);
		}
		else if(ae.getSource() == reset)
		{
			orderOne.setText("");
			orderTwo.setText("");
			orderThree.setText("");
			orderFour.setText("");
			orderFive.setText("");
		}
	}

	public void itemStateChanged(ItemEvent ie) 
	{
		if(ie.getSource() == orderNum)
		{
			if(orderNum.getSelectedIndex() == 0)
			{
				orderOne.setEditable(false);
				orderTwo.setEditable(false);
				orderThree.setEditable(false);
				orderFour.setEditable(false);
				orderFive.setEditable(false);
				
				orderOne.setText("");
				orderTwo.setText("");
				orderThree.setText("");
				orderFour.setText("");
				orderFive.setText("");
			}
			else if(orderNum.getSelectedIndex() == 1)
			{
				orderOne.setEditable(true);
				orderTwo.setEditable(false);
				orderThree.setEditable(false);
				orderFour.setEditable(false);
				orderFive.setEditable(false);
				
				orderTwo.setText("");
				orderThree.setText("");
				orderFour.setText("");
				orderFive.setText("");
			}
			else if(orderNum.getSelectedIndex() == 2)
			{
				orderOne.setEditable(true);
				orderTwo.setEditable(true);
				orderThree.setEditable(false);
				orderFour.setEditable(false);
				orderFive.setEditable(false);
				
				orderThree.setText("");
				orderFour.setText("");
				orderFive.setText("");
			}
			else if(orderNum.getSelectedIndex() == 3)
			{
				orderOne.setEditable(true);
				orderTwo.setEditable(true);
				orderThree.setEditable(true);
				orderFour.setEditable(false);
				orderFive.setEditable(false);
				
				orderFour.setText("");
				orderFive.setText("");
			}
			else if(orderNum.getSelectedIndex() == 4)
			{
				orderOne.setEditable(true);
				orderTwo.setEditable(true);
				orderThree.setEditable(true);
				orderFour.setEditable(true);
				orderFive.setEditable(false);
				
				orderFive.setText("");
			}
			else if(orderNum.getSelectedIndex() == 5)
			{
				orderOne.setEditable(true);
				orderTwo.setEditable(true);
				orderThree.setEditable(true);
				orderFour.setEditable(true);
				orderFive.setEditable(true);
			}
		}
	}
}
