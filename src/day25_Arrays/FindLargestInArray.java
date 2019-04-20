package day25_Arrays;
import java.util.Scanner;
public class FindLargestInArray {
	
	public static void main(String[] args) {
	
		/*
		 * ask user to enter how many items in array
		 */
		
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter number of items in Array: ");
		int number = input.nextInt(); 
		
		int sum = 0; 
		
		int [] arrNum = new int [number]; 
		
		for (int idx = 0; idx < number; idx++) {
			
			sum += number; 
		}
		
		System.out.println("Sum is: " + sum);

		
		/*Scanner scan = new Scanner(System.in); 
		System.out.println("How many items in array");
		int count = scan.nextInt(); 
		
		//create array called nums with that capacity 
		
		int [] nums = new int [count];
		
		for (int idx = 0; idx < count; idx++) {
				
				System.out.println("Enter number: " + (idx+1));
				nums[idx] = scan.nextInt(); 	
	
		}
			
			for (int n : nums) {
				System.out.print(n + " ");
			}
			System.out.println();
		
			//iterate in aray and find the largest value 
	
			int largest = nums[0];
			//int smallest = nums[0]; 
			// assume that first one is largest 
			//loop through the rest and check if they are greater than value of largest 
			//if true -> assigne the value into the largest 
			//print out the value of largest
		
			for (int num : nums) {
				if (num > largest) {
					largest = num; 
				}
				
			}
		
			System.out.println("The largets number is: " + largest);
		
		
			int [] number = {10, 30, 50, 60};
			
			for (int num : number) {
				
				if (num > largest) {
					largest = num; 
				}
			}
			
				System.out.println(largest);*/
			
			 
	}
	

}
