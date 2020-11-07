package Basics;

public class Variable {
	int data = 50;// instance variable
	static int m = 100;// static variable

	public void methodPrintingVariable() {
		int n = 90;// local variable
		System.out.println("Local varaible is printing=== "+n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Variable a1 = new Variable();
		a1.methodPrintingVariable();
	}

}
