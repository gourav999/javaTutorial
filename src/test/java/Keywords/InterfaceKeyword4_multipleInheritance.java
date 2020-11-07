//As we have explained in the inheritance chapter, multiple inheritance is not supported in the case of class because of ambiguity. However, it is supported in case of an interface because there is no ambiguity. It is because its implementation is provided by the implementation class. 

package Keywords;

//Declaring interface
interface printing1 {
	void print();
}

// Declaring interface
interface showable2 {
	void print();

}

// Class which is implemeting two interfaces
class InterfaceKeyword4_multipleInheritance implements printing1, showable2 {

	// This is interface method
	@Override
	public void print() {
		System.out.println("Hello Priting");
	}

	// This is not the interface method
	public void show() {
		System.out.println("Welcome Showing");

	}

	public static void main(String[] args) {
		InterfaceKeyword4_multipleInheritance IKM = new InterfaceKeyword4_multipleInheritance();
		IKM.print();
		IKM.show();
	}

}