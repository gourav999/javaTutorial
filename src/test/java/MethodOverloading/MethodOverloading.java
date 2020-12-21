/*In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.

In this example, we are creating static methods so that we don't need to create instance for calling methods.
*/package MethodOverloading;

public class MethodOverloading {

	public void multiply(int a, int b) {
		int mulitploye = a * b;
		System.out.println(mulitploye);
	}

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	// This will provide compile time error.
	// static double add (int a, int b, int c) {
	//
	// }

	// Changing data type of arguments
	static double add(double a, int b, int c) {
		return a + b + c;
	}

	//we cant override the main method
	// public static void main(String[] args){System.out.println("main with
	// String[]");}
	// public static void main(String args){System.out.println("main with String");}
	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		MO.multiply(10, 5);

		int sumofTwoNumber = add(1, 2);
		int sumofThreeNumbers = add(1, 2, 3);
		double sumofThreeNumbersWithDouble = add(1, 2, 3);

		MethodOverloading.add(2, 4);
		System.out.println(MethodOverloading.add(2, 66));
		System.out.println(sumofTwoNumber);
		System.out.println(sumofThreeNumbers);
		System.out.println(sumofThreeNumbersWithDouble);

	}

}
