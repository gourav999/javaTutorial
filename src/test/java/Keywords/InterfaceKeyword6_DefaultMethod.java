//A class implements an interface, but one interface extends another interface.
package Keywords;

//Declaring interface
interface Drawable123 {
	
	void draw123();

	//Default method created
	default void msg() {
		System.out.println("default method");
	}
}

class InterfaceKeyword6_DefaultMethod implements Drawable123 {

	@Override
	public void draw123() {
		System.out.println("drawing rectangle");

	}

	public static void main(String args[]) {
		InterfaceKeyword6_DefaultMethod d = new InterfaceKeyword6_DefaultMethod();
		d.draw123();
		d.msg();

	}
}
