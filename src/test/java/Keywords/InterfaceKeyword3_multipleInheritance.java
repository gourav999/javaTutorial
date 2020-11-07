package Keywords;

//Declaring interface
interface printing {
	void print();
}

//Declaring interface
interface showable1 {
	void show();

}

//Class which is implemeting two interfaces
class InterfaceKeyword3_multipleInheritance implements printing, showable1 {

	public void print() {
		System.out.println("Hello Priting");
	}

	public void show() {
		System.out.println("Welcome Showing");

	}

	public static void main(String[] args) {
		InterfaceKeyword3_multipleInheritance IKM = new InterfaceKeyword3_multipleInheritance();
		IKM.print();
		IKM.show();
	}
}