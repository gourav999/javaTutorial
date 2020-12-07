package controlStatements.SwitchCase;

public class switchCase {

	// default consturctor
	public switchCase() {
		System.out.println("This is default constructor");
		int number = 40;
		switch (number) {
		case 10:
			System.out.println("The value is 10");

			break;
		case 20:
			System.out.println("The value is 20");
			break;

		default:
			System.out.println("The value is not 10 or 20");

		}

	}

	public static void main(String[] args) {
		// default constuctor will be called
		switchCase c = new switchCase();

	}

}
