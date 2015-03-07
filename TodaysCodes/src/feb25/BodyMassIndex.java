package feb25;

import java.util.*;

public class BodyMassIndex 
{
	public static void main(String[] args) 
	{
		double weight = 0;
		double height = 0;
		double bmi = 0;
		Scanner console= new Scanner(System.in);
		
		System.out.println("Please enter you weight.");
		weight = console.nextDouble();
		System.out.println("Please enter your height in inches.");
		height = console.nextDouble();
		
		bmi = bmIndex(weight, height);
		System.out.println("Your BMI is: " + bmi);
	}
	
	public static double bmIndex(double w, double h)
	{
		return w * 703/(h * h);
	}
}
