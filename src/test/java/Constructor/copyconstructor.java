/*java Copy Constructor
There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:

By constructor
By assigning the values of one object into another
By clone() method of Object class
In this example, we are going to copy the values of one object into another using Java constructor.*/
package Constructor;

public class copyconstructor {

	int id;
	String name;

	copyconstructor(int i, String n) {
		id = i;
		name = n;
		System.out.println(id);
		System.out.println(name);
	}

	copyconstructor(copyconstructor cs) {
		id = cs.id;
		name = cs.name;
		System.out.println(id);
		System.out.println(name);

	}

	public static void main(String[] args) {
		copyconstructor cs = new copyconstructor(111, "Gourav");

		copyconstructor cs1 = new copyconstructor(cs);

	}

}
