package Basics;

import java.util.ArrayList;
import java.util.List;

public class Helloworld {
	

	public static void main(String[] args) {
		System.out.println("Haaaaaaaew");
		// TODO Auto-generated method stub

		//write code for adding two numbers	
//write java code for adding two numbers
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum of two numbers is: " + c);
		
		
		//write java code for subtracting two numbers
		int d = a - b;
		System.out.println("Subtraction of two numbers is: " + d);
		
		
		//write java code for multiplying two numbers
		int e = a * b;
		System.out.println("Multiplication of two numbers is: " + e);
		
		
		//write java code for dividing two numbers
		int f = a / b;
		System.out.println("Division of two numbers is: " + f);
//======================================================================
		String s="abc";
		//write code for permutation of String s  
	
        List<String> permutations = new ArrayList<>();
        permute(s, 0, s.length() - 1, permutations);
        System.out.println("Permutations of " + s + ": " + permutations);
    }

    private static void permute(String str, int left, int right, List<String> result) {
        if (left == right) {
            result.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right, result);
                str = swap(str, left, i); // backtrack
            }
        }
    }

    private static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}

		

	




