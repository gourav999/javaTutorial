package Basics;

public class TrueFalsePrinting {
	public void TrueFalsePrinting() {

		int a = 4;
		int b = 5;
		boolean result;
		{
			if (a == b) {
				System.out.println("This is equal");
			} else
				System.out.println("This is not equal");

		}
	}

	public static void main(String[] args) {

		// calling the function
		TrueFalsePrinting TF = new TrueFalsePrinting();
		TF.TrueFalsePrinting();

	}

}
