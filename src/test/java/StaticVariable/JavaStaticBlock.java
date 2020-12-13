/*Is used to initialize the static data member.
It is executed before the main method at the time of classloading.*/
package StaticVariable;

public class JavaStaticBlock {
	static {
		System.out.println("This block is invocked");
	}
	static {
		System.out.println("Init config block is invocked");
    }


	public static void main(String[] args) {
		System.out.println("Hello Main");
		// TODO Auto-generated method stub

	}

}
