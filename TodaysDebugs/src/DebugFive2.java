// Prints odd numbers
// Prints new line after every 10


public class DebugFive2
{
   public static void main(String[] args)  //throws InterruptedException
   {
     int num, count = 0;
     
     for(num = 1; num <= 100; num += 2)
     {
    	 if (num < 10)
    	 {
    		 System.out.print("   " + num);
    	 }
    	 else
    	 {
    		 System.out.print("  " + num); 
    	 }
    	 
    	 ++count;
    	 if(count == 10)
       {
         count = 0;
         System.out.println();
       }
     }
     //System.out.println("End of odd numbers");

    }

}