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
		changeCollege();

		StaticMethod SM = new StaticMethod();
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
