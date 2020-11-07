package Keywords;

import java.util.Arrays;

public class charactor {

	public static void main(String[] args) {

		// Print the charactoers
		char char1 = 'a';
		char char2 = 'A';

		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);

		// Print the charac
		char char3 = 66;
		char char4 = 99;
		System.out.println(char3);
		System.out.println(char4);

		// Covernt int to char typecase
		int num1 = 97;
		char integertoChar1 = (char) num1;

		int num2 = 65;
		char integertoChar2 = (char) num2;

		System.out.println("integertoChar1: " + integertoChar1);
		System.out.println("integertoChar2: " + integertoChar2);

		// String covertion to aray
		String name = "Gourav";

		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}

		// Let's see an example to break the string in the form of characters.
		char[] ch = name.toCharArray();
		System.out.println("String: " + name);
		System.out.println("char: " + Arrays.toString(ch));
		
		//calling the methods
		charactor c1=new charactor();
		System.out.println(c1.display()); 
		
	}
	
	
	public static char display()
	{
		return 'a';
				
	}
}