/*If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.*/
//A static method can access static data member and can change the value of it.
package StaticVariable;

public class StaticMethod {

	int rollno;
	String name;
	static String college = "JEC";

	static void changeCollege() {
		college = "BITS";
	}

	public void display(int rollno, String name) {
		System.out.println(rollno + name + college);
	}

	public static void main(String[] args) {
		//Here we are calling static method
		changeCollege();

		//Object creating
		StaticMethod SM = new StaticMethod();
		//Calling display method
		SM.display(1234, "Gourav");
		SM.display(1435, "Sourabh");
		SM.display(3534, "Anubha");

		// THis one will also work
		// SM.rollno = 1234;
		// SM.name = "Gourav";
		// SM.display();
		//
		// SM.name = "Sourabh";
		// SM.display();

	}

}
