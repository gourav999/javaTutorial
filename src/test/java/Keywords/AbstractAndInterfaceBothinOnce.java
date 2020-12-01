package Keywords;

//Creating Interfarce

interface A {
	void AMethodOfInterface();

	void BMethodOfInterface();

	void CMethodOfInterface();

}

// Abstract class implements interface
abstract class B implements A {
	// Note: if you dont define this interface method here, you need to do in class
	public void CMethodOfInterface() {
		System.out.println("I am C");
	}
}

// Class extending abstract class
class M extends B {

	@Override
	public void AMethodOfInterface() {

		System.out.println("I am A");
	}

	@Override
	public void BMethodOfInterface() {
		System.out.println("I am B");

	}

}

public class AbstractAndInterfaceBothinOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M Aobject = new M();
		Aobject.AMethodOfInterface();
		Aobject.BMethodOfInterface();
		Aobject.CMethodOfInterface();

	}

}
