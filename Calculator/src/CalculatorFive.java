
/*
Fifth attempt for Calculator. This attempt will utilize a fully functional GUI system, with
key-enabled button clicking "press number 1 will click button 1".
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class CalculatorFive extends JFrame implements ActionListener, KeyListener
{
	JTextField display = new JTextField("");
	JButton one, two, three, four, five, six, seven, eight, nine, zero,
		plus, minus, mult, div, equals, clear, decimal;
	JPanel window = new JPanel();
	
	static JFrame frame = null;
	
	String inputOne = "";
	String inputTwo = "";
	char inputC = 'z';
	char sign = 'z';
	int calcs = 0;
	int addN = 0;
	int subN = 0;
	int multN = 0;
	int divN = 0;
	
	CalculatorFive()
	{
		this.setSize(215, 315);
		this.setLocation(200, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		this.setLayout(new BorderLayout());
		
		window.setLayout(null);
		
		
		display.setSize(180, 30);
		display.setLocation(10, 10);
		display.setEditable(false);
		display.setBackground(Color.white);
		window.add(display);
		
		one = new JButton("1");
		one.setSize(45, 45);
		one.setLocation(10, 40);
		one.addActionListener(this);
		window.add(one);
		
		two = new JButton("2");
		two.setSize(45, 45);
		two.setLocation(55, 40);
		two.addActionListener(this);
		window.add(two);
		
		three = new JButton("3");
		three.setSize(45, 45);
		three.setLocation(100, 40);
		three.addActionListener(this);
		window.add(three);
		
		plus = new JButton("+");
		plus.setSize(45, 45);
		plus.setLocation(145, 40);
		plus.addActionListener(this);
		window.add(plus);
		
		four = new JButton("4");
		four.setSize(45, 45);
		four.setLocation(10, 85);
		four.addActionListener(this);
		window.add(four);
		
		five = new JButton("5");
		five.setSize(45, 45);
		five.setLocation(55, 85);
		five.addActionListener(this);
		window.add(five);
		
		six = new JButton("6");
		six.setSize(45, 45);
		six.setLocation(100, 85);
		six.addActionListener(this);
		window.add(six);
		
		minus = new JButton("-");
		minus.setSize(45, 45);
		minus.setLocation(145, 85);
		minus.addActionListener(this);
		window.add(minus);
		
		seven = new JButton("7");
		seven.setSize(45, 45);
		seven.setLocation(10, 130);
		seven.addActionListener(this);
		window.add(seven);
		
		eight = new JButton("8");
		eight.setSize(45, 45);
		eight.setLocation(55, 130);
		eight.addActionListener(this);
		window.add(eight);
		
		nine = new JButton("9");
		nine.setSize(45, 45);
		nine.setLocation(100, 130);
		nine.addActionListener(this);
		window.add(nine);
		
		mult = new JButton("*");
		mult.setSize(45, 45);
		mult.setLocation(145, 130);
		mult.addActionListener(this);
		window.add(mult);
		
		zero = new JButton("0");
		zero.setSize(90, 45);
		zero.setLocation(10, 175);
		zero.addActionListener(this);
		window.add(zero);
		
		decimal = new JButton(".");
		decimal.setSize(45, 45);
		decimal.setLocation(100, 175);
		decimal.addActionListener(this);
		window.add(decimal);
		
		div = new JButton("/");
		div.setSize(45, 45);
		div.setLocation(145, 175);
		div.addActionListener(this);
		window.add(div);
		
		clear = new JButton("CE");
		clear.setSize(90, 45);
		clear.setLocation(10, 220);
		clear.addActionListener(this);
		window.add(clear);
		
		equals = new JButton("=");
		equals.setSize(90, 45);
		equals.setLocation(100, 220);
		equals.addActionListener(this);
		window.add(equals);
		
		window.addKeyListener(this);
		window.setFocusable(true);
		
		this.add(window, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) 
	{
		frame = new CalculatorFive();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) 
	{
		if(ae.getSource() == one)
		{
			display.setText("1");
		}
		else if(ae.getSource() == two)
		{}
		else if(ae.getSource() == three)
		{}
		else if(ae.getSource() == four)
		{}
		else if(ae.getSource() == five)
		{}
		else if(ae.getSource() == six)
		{}
		else if(ae.getSource() == seven)
		{}
		else if(ae.getSource() == eight)
		{}
		else if(ae.getSource() == nine)
		{}
		else if(ae.getSource() == zero)
		{}
		else if(ae.getSource() == decimal)
		{}
		else if(ae.getSource() == plus)
		{}
		else if(ae.getSource() == minus)
		{}
		else if(ae.getSource() == mult)
		{}
		else if(ae.getSource() == div)
		{}
		else if(ae.getSource() == clear)
		{
			display.setText("");
		}
		else if(ae.getSource() == equals)
		{}
	}

	public void keyPressed(KeyEvent kp) 
	{
		
	}

	public void keyReleased(KeyEvent kr) 
	{
		
	}

	public void keyTyped(KeyEvent kt) 
	{
		if(kt.getSource() == window)
		{
			 inputC = kt.getKeyChar();
			 
			 if(inputC == '1')
			 {
				 one.isSelected();
				 display.setText("1");
			 }
			 else if(inputC == '2')
			 {}
			 else if(inputC == '3')
			 {}
			 else if(inputC == '4')
			 {}
			 else if(inputC == '5')
			 {}
			 else if(inputC == '6')
			 {}
			 else if(inputC == '7')
			 {}
			 else if(inputC == '8')
			 {}
			 else if(inputC == '9')
			 {}
			 else if(inputC == '0')
			 {}
			 else if(inputC == '.')
			 {}
			 else if(inputC == '+')
			 {}
			 else if(inputC == '-')
			 {}
			 else if(inputC == '*')
			 {}
			 else if(inputC == '/')
			 {}
			 else if(inputC == 'c')
			 {}
			
			
		}
	}

}


/*
 inputC = kt.getKeyChar();
			
			if(inputC >= '0' && inputC <= '9')
			{
				if(calcs == 0)
				{
					if(addN < 1 && subN < 1 && multN < 1 && divN < 1)
					{
						inputOne = inputOne + inputC;
					
						display.setText(inputOne);
					}
					else
					{
						inputTwo = inputTwo + inputC;
						if(addN == 1)
							sign = '+';
						else if(subN == 1)
							sign = '-';
						else if(multN == 1)
							sign = '*';
						else if(divN == 1)
							sign = '/';
						display.setText(inputOne + " " + sign + " " + inputTwo);
					}
				}
				else
				{
					
				}
			}
			else if(inputC == '+')
			{
				addN++;
			}
			else if(inputC == '-')
			{
				subN++;
			}
			else if(inputC == '*')
			{
				multN++;
			}
			else if(inputC == '/')
			{
				divN++;
			}
			*/
