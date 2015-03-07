package feb26;

public class DebugThree1
// This class calculates a waitperson's tip 
{
    public static void main(String args[])
    {
		double myCheck = 50.00;
		double yourCheck = 19.95;
		System.out.println("Tips are");
		calcTip(myCheck);
		calcTip(yourCheck);
	  }
    public static void calcTip(double bill)
	{
		double tip;
		tip = bill * .15;
		System.out.println("The tip should be at least " + tip);
	}
}
