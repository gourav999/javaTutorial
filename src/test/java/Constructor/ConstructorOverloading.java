//Why use the parameterized constructor?
//The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

//Example of parameterized constructor
//In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.

package Constructor;

public class ConstructorOverloading {

	public int id;
	public String name = "";
	public String surname;

	ConstructorOverloading(int i, String n) {
		id = i;
		name = n;

	}

	ConstructorOverloading(int i, String n, String sn) {
		id = i;
		name = n;
		surname = sn;
	}

	public void display() {
		System.out.println(id + " " + name + " " + surname);
	}

	public static void main(String[] args) {
		ConstructorOverloading col = new ConstructorOverloading(123, "Gourav");
		ConstructorOverloading col1 = new ConstructorOverloading(456, "Gourav", "Sahu");
		col.display();
		col1.display();
	}
}