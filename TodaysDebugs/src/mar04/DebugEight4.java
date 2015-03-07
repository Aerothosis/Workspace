import java.util.*;

public class FixDebugFive4
// counts letters entered
{
  public static void main(String args[]) throws Exception
  {
    Scanner console = new Scanner(System.in)	
    int[] count = new int[26];
    char letter;
    int x, letterval;
    System.out.println("Enter uppercase letters of the alphabet");
    System.out.println("This program will count each");
    System.out.println("Until you enter an exclamation point");
    System.out.println("Enter letter");
    letter = (console.next()).charAt(0);
    while(letter != '!')
    {
      System.in.read(); System.in.read();
      letterval = (int)letter;

      if(letterval >= 65 && letterval <= 90)
      {
        letterval -= 65;
        ++count[letterval];
      }
        System.out.println("Enter another letter or ! to quit");
        letter = (char)System.in.read();
    }
     for(x = 0; x < count.length; ++x)
     {
       letter = (char)(x+65);
       System.out.print(" Letter " + letter + " count " + count[x]);
       if (x%2==1) System.out.println();
     }
  }
}
