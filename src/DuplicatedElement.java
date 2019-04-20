import java.util.Arrays;
import java.util.*;

public class DuplicatedElement {
	
	public static void main(String[] args) {
//		
		String [] names = {"Max", "John", "Aimal"};  
		
		Arrays.sort(names); 
		
		System.out.println( Arrays.toString(names));
		
		System.out.println( Arrays.binarySearch(names, "Max"));
		
		
		int [] nums = {3, 6, 3, 7, 3, 10, 303, 3525};  
		int [] num = arrayMaxNum(nums); 
		System.out.println( Arrays.toString(num) );
		
//		int n = reverseInt(12356); 
//		System.out.println(n);
//		
		
		
	}
	
	
	public static int reverseInt(int num) {
		
		int reverse = 0; 
		while (num != 0) {
			reverse = reverse * 10 + num % 10; 
			num = num / 10; 
		}
		
		return reverse; 
	}
	
	
	//int [] nums = {3, 6, 3, 7, 10, 303, 3525};  
	
	//You need to count repeted numbers in a given array
	
	
	
	
	
	
	// reverse the int --> 
	//int k = 12345y 
	//find the first and second hithest number in a given array
	
public static int [] arrayMaxNum(int [] nums) {
		
		int temp; 
		
		for (int idx = 0; idx < nums.length-1; idx++) {
			for (int j = 0; j < nums.length-1; j++) {
				if (nums[j] < nums[j+1]) {
					temp = nums[j+1]; 
					nums[j+1] = nums[j]; 
					nums[j] = temp; 
				}
			}
		}
		
		int [] arrayHighest2Numbers = new int [2];
		arrayHighest2Numbers[0] = nums[0]; 
		arrayHighest2Numbers[1] = nums[1]; 
		
		return arrayHighest2Numbers; 
	
	
	// binary search. let's find the index of some number. 
	
		
		

	
	
	


	//big annotation in Java 

	// select the second highest salary from employees list 
//	select max(salary)
//	from employee
//	where salary<(select max(salary)); 
	
	// Creating a table using the SQL 
	
	// Inner Join, Outer Join and Right Join, Left Join 
//	creat the table columnw1, column2
//	from exe
	
}
}
