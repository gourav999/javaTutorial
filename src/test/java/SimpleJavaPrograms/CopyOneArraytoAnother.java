package SimpleJavaPrograms;

public class CopyOneArraytoAnother {
	
	public static void main(String[] args) {
		int [] arr1= {10,20,30};
		int[] arr2 =new int[arr1.length];    
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
			 System.out.println();
			//First data of array
			System.out.print("First data of array"+ arr1[i]+" ");
			 System.out.println();
			//second data of array
			System.out.print("second data of array"+arr2[i]+" ");
		}
	}

}
