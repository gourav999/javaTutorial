package Keywords;

abstract class Vehicle1 {
	String msg;

	Vehicle1(String msg) {
		this.msg = msg;
	}

	void display() {
		System.out.println(msg);
	}

}

class Honda1 extends Vehicle1 {

//	Honda1(String msg) {
//		super(msg);
//
//	}

	public Honda1(String yy) {
		// TODO Auto-generated constructor stub
		super(yy);
	}

}

public class ExamplesofabstractKeyword3 {

	public static void main(String[] args) {

		Honda1 obj = new Honda1("Constructor is invoked");
		obj.display();

	}
}