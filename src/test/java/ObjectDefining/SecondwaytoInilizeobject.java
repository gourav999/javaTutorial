//2) Object and Class Example: Initialization through method
package ObjectDefining;

public class SecondwaytoInilizeobject {

	int rollno;
	String name;

	
	public void insertRecord(int r,String n) {
		
		rollno=r;
		name=n;
		System.out.println(rollno);
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		SecondwaytoInilizeobject FW = new SecondwaytoInilizeobject();
		FW.insertRecord(1, "Gourav Jain");
		FW.insertRecord(2,"Sourabh Jain");
	}

}
