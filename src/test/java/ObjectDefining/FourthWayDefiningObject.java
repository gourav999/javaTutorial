//By New keyword
//5 ka factoria matalb= 5*4*3*2*1
package ObjectDefining;

public class FourthWayDefiningObject {

	public void factorialByNewKeyword(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;

		}
		System.out.println("This is the factorial of 5 and this is by New keyword " + fact);

	}

	
	//This is the very best for factorial
	public void fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {

			fact = fact * i;

		}
		System.out.println("This is the factorial of 5  " + fact);

	}

	//Method calling itself
	public int factorial(int n) {
		int factorial = 1;
		if (n == 0)
			return 1;
		factorial = n * factorial(n - 1);
		return factorial;

	}

	public static void main(String[] args) {

		FourthWayDefiningObject FW = new FourthWayDefiningObject();
		FW.fact(5);

		int factttt = FW.factorial(5);
		System.out.println("This is factorial of " + 5 + "=" + factttt);

		// By new keyword
		new FourthWayDefiningObject().factorialByNewKeyword(5);

	}

}
