//Since Java 8, we can have static method in interface. 
package Keywords;

interface Drawable6666 {
	void draw();

	static int staticcubee(int x) {
		return x * x * x;
	}
}

class Rectangle implements Drawable6666 {
	// Here we are implementing the method of interface
	public void draw() {
		System.out.println("drawing rectangle");
	}
}

class TestInterfaceStatic {
	public static void main(String args[]) {
		Drawable6666 d = new Rectangle();
		d.draw();
		System.out.println(Drawable6666.staticcubee(3));
	}
}