package Agregession;

public class Emp {
	int id;
	String name;
	//Here we are importing the address.
	Address address;

	public void emp(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.print(address.city);
		System.out.print(address.state);
		System.out.print(address.country);
	}
	
	public float employeesalary() {
		float salary=100000;
		return salary;
	}

	public static void main(String[] args) {
		//here we are creating the object of Address.
		Address Ad = new Address();
		Ad.Address("jabalpur", "M.P.", "India");
		//Here we are creating the object of currrent class
		Emp e = new Emp();
		e.emp(1, "Gourav", Ad);
		e.display();
	}

}
