package day25_Arrays;

public class SearchInArray {
	
	
	
	public static void main(String[] args) {
		//create array nums and assign 10 different numbers to it
		//search for a number 100 in it using a loop, once found print the index
		//location and "value found at index "+index
		//if that search value is not found print "100 not found in the array"
		//once you find 100 then exit the loop at that point, we are looking for
		
		
		int [] numbers = new int [10]; 
		numbers[0] = 101; 
		numbers[2] = 200;
		numbers[3] = 300;
		numbers[4] = 400;
		numbers[5] = 500;
		numbers[6] = 700;
		numbers[7] = 800;
		numbers[8] = 900;
		numbers[9] = 100;
		
		for (int idx = 0; idx < numbers.length; idx++) {
			
			if (numbers[idx] == 100) {
				System.out.println(numbers[idx]);
				System.out.println("Number was found in index: " + idx);
				break;
			}
		}
		 
		System.out.println("Test Ended >>>>>");
		
		//only first 100. not all of them
		
		
		
		int [] arrNums = {1, 2, 3, 5, 100, 600 ,30, 5, 8, 111}; 
		
			for (int idx = 0; idx < arrNums.length; idx++) {
				
				if (arrNums[idx] == 100) {
					System.out.println("Value found at Inded " + idx + " the number is: " + arrNums[idx] );
					break;
				}
			}
		
//		
//		
//		int[] nums = {123,345,100,234,55,12344,101,1233,5543};
//		
//		for (int idx = 0; idx < nums.length; idx++) {
//			
//			if (nums[idx] == 100) {
//				System.out.println("100 was found at index - " + idx);
//				break; 
//			} else {
//				System.out.println("100 was not found");
//			}
//		}
		

////		int targetNum = 100; 
////		int counter = 0; 
////		
////		for (int idx = 0; idx <= nums.length; idx++) {
////			
////			if (nums[idx] == targetNum) {
////				System.out.println("Value 100 found at index " + counter);
////				break; 
////			} else {
////				System.out.println("100 was not found");
////			}
////			
////			counter++; 
////			
////		}
//		
//		int looksfor = 100; 
//		boolean found = true; 
//		for (int idx = 0; idx < nums.length; idx++) {
//			
//			if (nums[idx] == looksfor) {
//				
//				System.out.println(looksfor + " was found at index " + idx);
//				found = false; 
//				break; 
//			}
//		}
//				if (found) {
//					System.out.println(looksfor + " was not found");
//		}	
		
	/*	int lookfor = 50;
		boolean found = false;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == lookfor) {
				System.out.println(lookfor + " was found at index " + i);
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println(lookfor + " not found");
		}*/
		
		
	/*	
		String [] khalili = {"Aiaz", "Mohammad", "Moallah", "Mitra"};
		
		String looksfor = "Moallah";
		boolean find = false; 
		
		for (int idx = 0; idx < khalili.length; idx++) {
			
			if (looksfor == khalili[idx]) {
				System.out.println(looksfor + " was found at index " + idx);
				find = true; 
				break; 
			}
			 	if (find = false) {
			 		System.out.println(looksfor + " was not found");
			 	}
		}			
		
	/*
		int [] num1 =  {1,200,300,50,60,70,80,30,50}; 
		
		int looksfor1 = 200; 
		boolean found1 = false; 
		
		for (int idx = 0; idx < num1.length; idx++) { 
			
			if (num1[idx] == looksfor1) {
				System.out.println(looksfor1 + " was found at index " + idx);
				return; 
			} 
			
		}
			
			if (!found1) {
				System.out.println(looksfor1 + " was not found");
			}*/
			
		
		
		
	}
	

}
