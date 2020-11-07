//Java abstract Keyword
//The abstract keyword is used to achieve abstraction in Java. It is a non-access modifier which is used to create abstract class and method.
//The role of an abstract class is to contain abstract methods. However, it may also contain non-abstract methods. The method which is declared with abstract keyword and doesn't have any implementation is known as an abstract method.

//Syntax
/*abstract class Employee  
{  
abstract void work();  
} */

/*Rules of abstract keyword
Don'ts
An abstract keyword cannot be used with variables and constructors.
If a class is abstract, it cannot be instantiated.
If a method is abstract, it doesn't contain the body.
We cannot use the abstract keyword with the final.
We cannot declare abstract methods as private.
We cannot declare abstract methods as static.
An abstract method can't be synchronized.
Do's
An abstract keyword can only be used with class and method.
An abstract class can contain constructors and static methods.
If a class extends the abstract class, it must also implement at least one of the abstract method.
An abstract class can contain the main method and the final method.
An abstract class can contain overloaded abstract methods.
We can declare the local inner class as abstract.
We can declare the abstract method with a throw clause.*/

package Keywords;

//WE have imported here variable and the method is calling from variable class.
import Basics.Variable;

public class Abstract_keyword_Rules {

	public static void main(String[] args) {
		//Note: we have imported Variable class, to usi ka object kaam kar gaya
		Variable V1 = new Variable();
		V1.methodPrintingVariable();
	}

}
