package Keywords;

interface Drawablex {
	void drawx();

	static int cubex(int x) {
		return x + x;
	}
}

class InterfaceKeyword7_StaticMethodIninterface implements Drawablex {
	public void drawx() {
		System.out.println("Rectangel drawing");
	}

	public static void main(String[] args) {
		Drawablex d11 = new InterfaceKeyword7_StaticMethodIninterface();
		d11.drawx();
		int area = Drawablex.cubex(3);
		System.out.println(area);

	}
}