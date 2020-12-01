//Java Program to demonstrate the use of static variable  
package StaticVariable;

public class StaticVariable {
	
	int rollno;
	static String college="JEC";
	
	//Making constructor
	public StaticVariable(int rn) {
		// TODO Auto-generated constructor stub
		rollno=rn;
		
	}
	void display() {
		System.out.println("This is roll no ="+rollno+" This is college = "+college);
	}
	
	public static void main (String[]args) {
		
		StaticVariable sv1=new StaticVariable(1009);
		sv1.display();
		for(int i=0;i<5;i++) {
			StaticVariable sv=new StaticVariable(1000+i);
			sv.display();
		}
	}

}
