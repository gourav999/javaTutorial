//3) Object and Class Example: Initialization through a constructor

package ObjectDefining;

public class ThirdwaytoInilizeobject {

	int id;
	String name;
	float salary;

	public void insert(int i, String n, float s) {

		id = i;
		name = n;
		salary = s;

	}

	public static void main(String[] args) {
		ThirdwaytoInilizeobject FW = new ThirdwaytoInilizeobject();
		FW.insert(1, "Gourav Jain", 10000);
		FW.insert(2, "Sourabh Jain", 20000);
	}

}
