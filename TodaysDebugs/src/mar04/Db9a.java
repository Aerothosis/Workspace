public class Db9a
// Sum and average
// an array of integers
  {
   public static void main(String args[])
    {
		int[] someNums = {4,17,22,8,35};
		int tot = 0;
		int x;

		for(x = 0; x < 4; ++x)
			tot+=someNums[x];
			System.out.println("Sum is " + tot);
			System.out.println("Average is " + tot/4);
    }
}