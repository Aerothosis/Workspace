package feb11;

import javax.swing.*;

public class DebugSix4
{
  public static void main(String[] args)
  {
	  double bankBal = 1000;
      double intRate = 0.04;
      char response;

      JOptionPane.showMessageDialog(null, "We will now display your bank balance.");
      
      do
      {
    	  JOptionPane.showMessageDialog(null, "Bank balance is " + bankBal);
    	  bankBal = bankBal + bankBal * intRate;
    	  while(true)
    	  {
	    	  try
	    	  {
	    		  response = JOptionPane.showInputDialog(null, "Do you want to see next years balance? Y or N").toUpperCase().charAt(0);
	    		  break;
	    	  }
		      catch(StringIndexOutOfBoundsException sioobe)
		      {
		    	  JOptionPane.showMessageDialog(null, "Error.");
		      }
	    	  catch(NullPointerException npe)
		      {
		    	  JOptionPane.showMessageDialog(null, "Error.");
		      }
    	  }
      } while (response == 'Y');
    	  
    	  System.exit(0);
      
        
  }
}








