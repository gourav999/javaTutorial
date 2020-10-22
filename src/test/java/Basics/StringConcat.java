package Basics;

public class StringConcat {

	public void stringAdd() {
		// String creation
		String s1 = "Gourav";
		String s2 = "Sourabh";

		// Adding the string
		String s3 = s1 + s2;

		// Printing the String of addition
		System.out.println(s3);
	}

	public static void main(String[] args) {

		// calling the function
		StringConcat sc = new StringConcat();
		sc.stringAdd();

	}

}
