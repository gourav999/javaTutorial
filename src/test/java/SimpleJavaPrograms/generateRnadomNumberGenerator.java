package SimpleJavaPrograms;
import java.lang.Math;
import java.util.Random;

public class generateRnadomNumberGenerator {
	public static void main (String[] args) {
		System.out.println(Math.random());
		
		
		// creating an object of Random class   
		Random random = new Random();  
		boolean y=random.nextBoolean();
		int x=random.nextInt(1000);
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
