package SimpleJavaPrograms;

public class Fibonacciseries {

	void printingFSeries() {
		int a = 0;
		int b = 1;
		int c;

		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 10; i++) {
			c = a + b;// 1 2
			a = b;// 1
			b = c;// 1 2

			System.out.println(c);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacciseries FS = new Fibonacciseries();
		FS.printingFSeries();

	}

}
