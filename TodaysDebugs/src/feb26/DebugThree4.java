package feb26;

public class DebugThree4
// This program calculates tuition bills
  {
    public static void main(String args[])
	  {
		int myCredits = 15;
		double yourCredits = 16.5;
		double rate = 75.84;
		tuitionBill(myCredits,rate);
		tuitionBill(yourCredits,rate);
	  }
    public static void tuitionBill(int c,double r)
	{
	 System.out.println("Total due with whole units " + (r*c));
	}
   public static void tuitionBill(double c, double r)
	{
	 System.out.println("Total due " + (r*c));
	}
}
