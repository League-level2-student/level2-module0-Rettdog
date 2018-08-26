package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
	String[] array = new String[5];
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2]="heellloo";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
			
		}
		
		//6. make an array of 50 integers
		int[] array2 = new int[50];
		Random rand = new Random();
		//7. use a for loop to make every value of the integer array a random number
		for(int i = 0;i<array2.length;i++) {
			array2[i]=rand.nextInt(50);
			
		}
		int smallest = 50;
		//8. without printing the entire array, print only the smallest number in the array
		for(int i = 0;i<array2.length;i++) {
			if(smallest>array2[i]) {
				smallest=array2[i];
			}
			
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for(int i = 0;i<array2.length;i++) {
			System.out.println(array2[i]);
			
		}
		//10. print the largest number in the array.
		int largest = 50;
		//8. without printing the entire array, print only the smallest number in the array
		for(int i = 0;i<array2.length;i++) {
			if(largest<array2[i]) {
				largest=array2[i];
			}
			
		}
		System.out.println(largest);
		/*int[] array3 = new int[100000000];
		for(int i = 0;i<array3.length;i++) {
			array3[i]=rand.nextLong(5000000000l);
			
		}
		int smallest2 = 500000000;
		//8. without printing the entire array, print only the smallest number in the array
		for(int i = 0;i<array3.length;i++) {
			if(smallest2>array3[i]) {
				smallest2=array3[i];
			}
			
		}
		System.out.println(smallest2+"!");
		*/
	}
}
