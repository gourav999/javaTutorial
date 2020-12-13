package ThisKeyword;

public class InvokeCurrentClassMethod {
	
	public void method1() {
		System.out.println("Message fro Method1 This is Nice");
	
	}
	public void method2() {
		System.out.println("Message from Method2 This is bad");
		method1();
		
		//Note: on line no. 11, we can use the below also
		this.method1();
	}
	
	public static void main (String[] args) {
		InvokeCurrentClassMethod ICC=new InvokeCurrentClassMethod();
		ICC.method2();
	}

}
