package SimpleJavaPrograms;

public class FindDuplicatevalueFromArray {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 10, 30 };
		// System.out.println(arr1.length);
		for (int i = 0; i < arr1.length; i++) {
			
			for ( int j = i+1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) 
					System.out.println(arr1[j]);
				
			}
		}
	}
}
