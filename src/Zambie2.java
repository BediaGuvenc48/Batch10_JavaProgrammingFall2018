import java.util.Arrays;

public class Zambie2 {
	
	public static void main(String[] args) {
		
		printHollowRect(); 
		
		String [] str = {"aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"};
		
		String st = longOne(str); 
		System.out.println(st);
		
		/*
		An array inhabitants represents cities and their respective populations. For example, the following arrays shows 8 cities and 
		their respective populations:
		[3, 6, 0, 4, 3, 2, 7, 1]
		Some cities have a population of 0 due to a pandemic zombie disease that is wiping away the human lives.After each day, 
		any city that is adjacent to a zombie-ridden city will lose half of its population.

		Write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left) 
		to a city with zero people until all cities have no humans left.
		 
		 Make updates to each element in the array And print the array like below for each day:

		Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
		Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
		Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
		Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
		Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
		Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
		---- EXTINCT ----*/
		
		int [] nums = {3, 6, 0, 4, 3, 2, 7, 0}; 
		
		int day = 0; 
		
		System.out.println("Day " + day + " " + Arrays.toString(nums));
		
		for (int idx = 0; idx < nums.length; idx++) {
			
			int sum = 0; 
			day++; 
			
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[j] != 0 && nums[j+1] == 0) {
					nums[j] = nums[j] / 2; 
				}  
				
				if (nums[j] == 0 && nums[j+1] != 0) {
					nums[j+1] = nums[j+1] / 2;
				}
				
				j++; 
				sum += nums[j]; 
				
			}
			
			System.out.println("Day " + day + " " + Arrays.toString(nums));
		}
		
	}
	
	public static String longOne(String [] str) {
		
		String max = ""; 
		
		for (int idx = 0; idx < str.length; idx++) {
			if (str[idx].length() > max.length()) {
				max = str[idx]; 
			}
		}
		return max; 
	}
	
	
	public static void printHollowRect() {
		int n = 4; 
		for (int idx = 0; idx <= n; idx++) {
			for (int j = 0; j <= n; j++) {
				if (idx==0 || j==0 || idx==n || j==n) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			 
			System.out.println();
		}		
	}
	
	
	
	
	
	
	
}
