import java.util.Arrays;

public class Kamal {
	
	public static void main(String[] args) {
		
		int [] nums = {5,2,56,2,1,2000,346,9}; 
		
		//System.out.println(Arrays.toString(nums));
		
		int temp; 
		
		for (int idx = 0; idx < nums.length-1; idx++) {
			for (int j = 0; j < nums.length-1; j++) {
				
				if (nums[j] > nums[j+1]) {
					temp = nums[j+1]; 
					nums[j+1] = nums[j]; 
					nums[j] = temp; 
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

}
