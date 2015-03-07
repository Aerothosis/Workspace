import javax.swing.JOptionPane;

public class Db9b
// program looks up home price
// for different floor plans
// allows upper or lowercase data entry
{
  public static void main(String args[]) throws Exception
  {
     char[] floorPlan = {'A','B','C','a','b','c'};		
     int[] price = {85000, 110000, 135000};
     char plan;
     int x,fp=99;
     System.out.println("Our floorplans are");
     System.out.println("A - Augusta");
     System.out.println("B - Brittany");
     System.out.println("C - Colonial");
     System.out.println("Enter floorplan letter");
     plan = JOptionPane.showInputDialog("Which floor plan would you like?).charAt(0);
     for(x = 0; x < floorPlan.length; ++x)
	if (plan==floorPlan[x])
          fp = x;
     if(fp==99)
       System.out.println("Invalid floor plan code entered");
     else
      if (fp>2)
        fp = fp - 2;
     System.out.println("Model " + plan +
         " is priced at only " + price[fp]);
      
  }
}
  	