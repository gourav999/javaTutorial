//static keyword. static keyword is used for mainly memory alocation. 
//static keywrod can be varaible, method, block, nested class.

package StaticVariable;

public class calculation {

	public int cube(int number) {

		number = number * number * number;

		return number;
	}

	public static void main(String[] args) {
		calculation c = new calculation();
		int returnedCubeNumber = c.cube(5);
		System.out.println(returnedCubeNumber);
	}

}
