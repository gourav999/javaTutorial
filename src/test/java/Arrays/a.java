//Arrays in Java are also objects. They need to be declared and then created. In order to declare a variable that will hold an array of integers, we use the following syntax:
package Arrays;

public class a {

	public static void arrayCreation() {
		int[] arr;
		arr = new int[10];
		arr[0] = 1;
		System.out.println("Array Lenght is " + arr.length);
		System.out.println("First element of array is " + arr[0]);
	}

	public void arrayPrint() {
		int a[] = { 10, 20, 30 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void arrayPrintDifferentLoop() {
		char a[] = { 'a', 'b', 'c' };
		for (int i : a) {
			System.out.println(i);
		}
	}

	public void arrayAsParameter(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Printing array as paramenter-->  " + "This is the " + i + " value " + arr[i]);
		}
	}
	
	public static void arrayPassingAnonymus(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Printing Anonymus array -->  " + "This is the " + i + " value " + arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1 = new a();
		a.arrayCreation();

		a1.arrayPrint();
		a1.arrayPrintDifferentLoop();

		a b1 = new a();

		int arrayA1[] = { 100, 110, 120 };
		b1.arrayAsParameter(arrayA1);


		arrayPassingAnonymus(new int[]{10,22,44,66,77});//passing anonymous array to method
	}

}
