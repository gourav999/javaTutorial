package SimpleJavaPrograms;

public class Pallindrom {
	public static void main(String args[]) {

		String s = "454";

		// First approach of palindrome
		for (int i = 0; i < s.length(); i++) {
			// System.out.println("value at " + i + " = " + s.charAt(i));
			// System.out.println("from last value at " + i + "=" + s.charAt(s.length() -
			// ++i));
			if (s.charAt(i) == s.charAt(s.length() - ++i) && i == s.length()) {
				System.out.println("Pallindrome");
			}

		}

		// Second approach of pallindrome
		int r, sum = 0, temp;
		int n = 4554;// It is the number variable to be checked for palindrome
		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");

		// THird appaorach of pallindrome
		String value = "madam";
		String reverse = new StringBuffer(value).reverse().toString();
		{
			if (value.equals(reverse)) {
				System.out.println("Yes, it is a palindrome");
			} else {
				System.out.println("No, it is not a palindrome");
			}
		}
	}
}
