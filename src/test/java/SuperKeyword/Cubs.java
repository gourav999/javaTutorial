package SuperKeyword;

public class Cubs extends Lion {

	String color = "Yellow";

	// cubs class construcotr

	Cubs() {
		super();
		System.out.println("The cubs are the child of Lion");
	}

	void printcolor() {

		System.out.println("The cub color is " + color);// printing the child class color
		System.out.println("The lion color is " + super.color);// Printing the superclass animal color
	}

	void eat() {
		System.out.println("Cubs are eating the grass");
		// Lion's eat method will call
		super.eat();
	}

	void bark() {
		System.out.println("Cubs dont bark");

	}

	float cubsWeight;

	Cubs(int CubsId, String CubsName, float cubsWeight) {
		super(CubsId, CubsName);
		// this.LionId=LionId;
		// this.LionName=LionName;
		this.cubsWeight = cubsWeight;

	}

	void display() {
		System.out.println(LionId);
		System.out.println(LionName);
		System.out.println(cubsWeight);
	}

	public static void main(String[] args) {
		Cubs c = new Cubs();
		c.printcolor();
		Cubs c1 = new Cubs(1, "x", 12.f);
		c1.display();
		c.eat();
		c.bark();
	}
}
