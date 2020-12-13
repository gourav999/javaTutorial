
/*this keyword in java
There can be a lot of usage of java this keyword. In java, this is a reference variable that refers to the current object.

Usage of java this keyword
Here is given the 6 usage of java this keyword.

this can be used to refer current class instance variable.
this can be used to invoke current class method (implicitly)
this() can be used to invoke current class constructor.
this can be passed as an argument in the method call.
this can be passed as argument in the constructor call.
this can be used to return the current class instance from the method.
Suggestion: If you are beginner to java, lookup only three usage of this keyword.

*/
package ThisKeyword;

public class withoutThisKeyword {
	int rollno;
	String name;

	// default constructor
	withoutThisKeyword(int r, String n) {
		rollno = r;
		name = n;
		System.out.println(rollno);
		System.out.println(name);

	}

	public void display() {
		System.out.println(rollno);
		System.out.println(name);
	}

	public static void main(String[] args) {
		withoutThisKeyword WTK = new withoutThisKeyword(1, "gourav");
		WTK.display();

	}

}
