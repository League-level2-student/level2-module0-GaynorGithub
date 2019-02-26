package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random rand = new Random();
		int small = 50;
		int big = 0;
		
		
		//1. make an array of 5 Strings
		String[] names = {"Joe","Shmoe","Potato","Tomato","Ree"};
		//2. print the third element in the array
		System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "Rent-A-Swag";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to print all the values in the array
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(51);
		}
		//8. without printing the entire array, print only the smallest number in the array
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < small) {
				small = numbers[i];
			}
		}
		System.out.println(small);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		//10. print the largest number in the array.
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > big) {
				big = numbers[i];
			}
		}
		System.out.println(big);
	}
}
