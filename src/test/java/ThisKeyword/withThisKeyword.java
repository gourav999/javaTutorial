package ThisKeyword;


public class withThisKeyword {
	int rollno;
	String name;

	// default constructor
	withThisKeyword(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		System.out.println(rollno);
		System.out.println(name);

	}

	public void display() {
		System.out.println(rollno);
		System.out.println(name);

	}

	public static void main(String[] args) {
		withThisKeyword WTK = new withThisKeyword(1, "gourav");
		WTK.display();

	}

}