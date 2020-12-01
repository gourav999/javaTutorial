//Why use the parameterized constructor?
//The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

//Example of parameterized constructor
//In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.

package Constructor;

public class ParameterizedConstructor {
	String name;
	String id;

	ParameterizedConstructor(String a, String b) {
		name = a;
		id = b;
		System.out.println("This is name  ==" + name + ",   This is id==" + id);

	}

	public static void main(String[] args) {

		ParameterizedConstructor pa = new ParameterizedConstructor("Gourav", "ID_123");

		pa.name = "Anubha";
		pa.id = "AJ_123";
		pa = new ParameterizedConstructor(pa.name, pa.id);
		
		pa.name="Sourabh";
		pa.id="BORL_098";
		pa = new ParameterizedConstructor(pa.name, pa.id);
		

	}

}
