//1) Object and Class Example: Initialization through reference
package ObjectDefining;

public class FirstwaytoInilizeobject {

	String id;
	String name;

	public static void main(String[] args) {
		FirstwaytoInilizeobject FW1 = new FirstwaytoInilizeobject();
		FW1.id = "1";
		String CompleteName = FW1.name = "Gourav Jain";
		System.out.println(FW1.id);
		System.out.println(CompleteName);

		FirstwaytoInilizeobject FW2 = new FirstwaytoInilizeobject();
		FW2.id = "2";
		CompleteName = FW2.name = "Sourabh Jain";
		System.out.println(FW2.id);
		System.out.println(CompleteName);

	}

}