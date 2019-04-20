package day29_Arrays06_multiD;

import java.util.Arrays;

public class Summary {
	
	public static void main(String[] args) {
		
		
		int [][] nums = {{1,2,3},{4,5,6},{7,8,10000, 20000} }; 
		
		int [][] x = new int [2][2]; 
		
		//int [0][0] x1 = [0][0] = 1; [0][1] = 2, [0][2] = 3; 
		
		
		// [2][2]  =     [0][0] = 1; [0][1] = 2, [0][2] = 3; 
		//  			 [1][0] = 4; [1][1] = 5, [1][2] = 6; 
		// 				 [2][0] = 7; [2][1] = 8, [2][2] = 100000; [2][3] = 20000;  
		
		
		//Arrays.toString(a)
		Arrays.deepToString(x); 
			
		System.out.println(Arrays.deepToString(nums));
		System.out.println(nums[0][2]);
		System.out.println(nums[0][1]);
		System.out.println(nums[1][1]);
		System.out.println(nums[2][2]);
		
		System.out.println("Lenght of Array " + nums.length);
		System.out.println(nums[1].length);
		System.out.println(nums[2].length);
		
	}

}
