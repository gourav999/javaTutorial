//The this keyword can also be passed as an argument in the method. It is mainly used in the event handling. 
//In event handling (or) in a situation where we have to provide reference of a class to another one. It is used to reuse one object in many methods.
package ThisKeyword;

public class ThisPassasanArgument {
	
	public void car() {
		bike(this);
		System.out.println("This is car");
	}
	
	//class name is called here as parameter
	void bike(ThisPassasanArgument obj) {
		System.out.println("This is Bike");
	}
	
	
	
	public static void main (String[] args) {
		ThisPassasanArgument TPA=new ThisPassasanArgument();
		TPA.car();
	}

}
