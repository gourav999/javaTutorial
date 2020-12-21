package SuperKeyword;

public class Lion {
	String color = "White";

	// constructor
	Lion() {

		System.out.println("Lion gave birth to cubs");
	}

	void eat() {
		System.out.println("Lion is eating the meet");
	}

	 int LionId;
	 String LionName;

	
	//Parameterized constructor
	Lion(int LionId, String LionName) {
		this.LionId = LionId;
		this.LionName = LionName;
	}
}
