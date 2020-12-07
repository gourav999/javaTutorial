package controlStatements.SwitchCase;

public class switchCaseWithoutbreak {

	// default consturctor
	public switchCaseWithoutbreak() {
		System.out.println("This is default constructor");
		int number = 20;
		switch (number) {
		case 10:
			System.out.println("The value is 10");

		case 20:
			System.out.println("The value is 20");

		case 30:
			System.out.println("The value is 30");

		case 40:
			System.out.println("The value is 40");

		default:
			System.out.println("The value is not 10 or 20");

		}

	}

	public static void main(String[] args) {
		// default constuctor will be called
		switchCaseWithoutbreak c = new switchCaseWithoutbreak();

	}

}
