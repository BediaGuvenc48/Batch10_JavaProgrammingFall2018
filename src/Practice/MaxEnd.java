package Practice;

import java.util.Arrays;

public class MaxEnd {
	
	public static void main(String[] args) {
		
		
		MaxEnd end = new MaxEnd(); 
		int [] nums = {2, 4, 5}; 
		int [] n = {3,2,1}; 
//		int [] n = end.maxEnd3(nums);
//		System.out.println( Arrays.toString(n) );
		
		int [] temp = fix23(nums); 
		//System.out.println(Arrays.toString(nums));
		
		int [] m = start1(nums, n); 
		System.out.println(Arrays.toString(m));
		 
		
	}
	
	
	public int[] maxEnd3(int[] nums) {
		  
		  Arrays.sort(nums); 
		  
		  int [] temp = new int [nums.length]; 
		  int counter = 0; 
		  
		  for (int idx = 0; idx < nums.length; idx++){
		      
		      temp[counter] += nums[nums.length-1]; 
		      counter++;
		  }
		    return temp; 
		}

	public boolean has23(int[] nums) {
		  
		  for (int idx = 0; idx < nums.length; idx++){
		    
		      if (nums[idx] == 2 || nums[idx] == 3) {
		    	  return true;
		      }
		  }
		   return false;
		}

	
	public static int[] fix23(int[] nums) {
		  
		int [] temp = new int [nums.length]; 
		int counter = 0; 
		for (int idx = 0; idx < nums.length; idx++) {

			if (nums[idx] == 2 && nums[idx+1] == 3) {
				nums[idx+1] = 0; 
				temp[counter] += nums[idx]; 
			}
		}
		  
		return temp; 
	}

	public static int [] start1(int[] a, int[] b) {
		  
		  int [] temp = new int [a.length + b.length]; 
		  
		  int counter  = 0; 
		  
		  
		  for (int idx = 0; idx < temp.length; idx++){
		      
		      temp[counter] = a[idx] + b[idx]; 
		  }
		  
		return temp;
		  
		  
		}

		 
	
	
}
