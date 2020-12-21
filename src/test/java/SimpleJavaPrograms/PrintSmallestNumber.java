package SimpleJavaPrograms;

public class PrintSmallestNumber {
	public static void main(String[] args) {

		int arr1[] = { 2, 3, 5, 6, 1, 10 };
		int minimumNumber = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			//System.out.println(arr1[i+1]);
			if(arr1[i]<minimumNumber) {
				minimumNumber=arr1[i];
				System.out.println("Min number"+arr1[i]);
			}
		}

	}

}
