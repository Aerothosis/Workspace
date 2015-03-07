package feb11;
/* This program has a number of errors that will prohibit it from compiling
or providing the correct output*/
public class Exercise22
{
	
	static final int N = 2137;
	
	public static void main(String[] args)
	{
			int a,b,c = 0,d = 0;
			
			a = 3;
			b = 5;
			c = c + d;
			//N = a + N;
			
			for(int i = 3; i <= N; i++)
			{
				//System.out.println("In Loop");
				System.out.print(" " + i);
				if(i % 9 == 0)
					System.out.println();
				i = i + 2;
			}
			System.out.println();
	}
}