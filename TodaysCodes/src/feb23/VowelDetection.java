package feb23;

/*
Write a value-returning method, isVowel, that returns the value true if a given
character is a vowel, and otherwise returns false. Also write a program to
test your method.
*/


public class VowelDetection 
{
	/*public static void main(String[] args) 
	{
		/*A call to a method is done using the name of the method and passing in
		actual parameters that satisfy the formal parameter list. If nothing is
		done with a value that is returned, what happened? Not much!
		
		
		char character = 'r';
		boolean vowel = isVowel(character);
		
		System.out.println("" + character + " is vowel returns " + vowel);
	}*/

	/*Method header: access modification is public and static, public so that
	others can use it, static so that a main method could see it. boolean is the
	return type. The return type can be any primitive or abstract data type. If
	the method does not return a value the return type is void. If the return
	type is not void, the method must have a return statement. The return
	statement acts like a break statement. Any variables declared within the
	parenthesis are termed the formal parameter list. Those are the things the 
	method must have to do it's job. A method can only return one value.
	*/
	public static boolean isVowel(char letter) //method header/declaration
	{
		switch(letter)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				return true;
			default:
				return false;
		}
	}
	//The area between the curly braces is called the method body.
}
