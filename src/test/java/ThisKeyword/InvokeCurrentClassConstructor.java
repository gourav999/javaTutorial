package ThisKeyword;

public class InvokeCurrentClassConstructor {

	//Created default constructor
	InvokeCurrentClassConstructor() {
		this(5);
		System.out.println("This is current class constructor");
		
	}

	//Parameterized constructor
	InvokeCurrentClassConstructor(int x) {
		// This will call the default constuctor.
		//this();
		System.out.println("This is current class constructor with one parameter");
	}

	public void method1() {
		System.out.println("Message fro Method1 This is Nice");

	}

	public void method2() {
		System.out.println("Message from Method2 This is bad");
		method1();

		// Note: on line no. 11, we can use the below also
		this.method1();
	}

	public static void main(String[] args) {
		// Calling constructor
		InvokeCurrentClassConstructor ICC = new InvokeCurrentClassConstructor();

		// calling constructor with one parameter. On this, also default constructor will be called.
		InvokeCurrentClassConstructor ICC1 = new InvokeCurrentClassConstructor(5);

	}

}
