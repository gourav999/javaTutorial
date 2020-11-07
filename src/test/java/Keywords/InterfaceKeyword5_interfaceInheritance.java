//A class implements an interface, but one interface extends another interface.
package Keywords;

//Declaring interface
interface printings12 {
	void print();
}

// Declaring interface and implementing another interface
interface showable23 extends printings12 {
	void show();

}

// Class which is implemeting two interfaces
class InterfaceKeyword5_interfaceInheritance implements showable23 {

	// This is interface method
	@Override
	public void print() {
		System.out.println("Hello Priting interface inheritance");
	}

	// This is not the interface method
	public void show() {
		System.out.println("Welcome Showing interface inheritance");

	}

	public static void main(String[] args) {
		InterfaceKeyword5_interfaceInheritance IKM = new InterfaceKeyword5_interfaceInheritance();
		IKM.print();
		IKM.show();
	}

}