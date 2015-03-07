package feb26;

public class DebugFour4
// This class discounts prices by 10%
{
  public static void main(String args[])
  {
	int price = 100;
	double price2 = 100.00;
	tenPercentOff(price);
	tenPercentOff(price2);
  }
  public static void tenPercentOff(double p)
  {
	double newPrice = p * .90;
	System.out.println("Ten percent off");
	System.out.println("New price is " + newPrice);
  }
}