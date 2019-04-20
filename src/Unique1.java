
import java.util.*;
public class Unique1 {
	
	public static void main(String[] args) {
		
	
	int [] nums = {5,2,3,5,3,2,6,2,36,1}; 
	
	List<Integer> list = new ArrayList<>(); 
	
	for (int idx = 0; idx < nums.length; idx++) {
		
		for (int j = 0; j < nums.length; j++) {
			
			if (nums[idx] == nums[j] && idx != j) {
				continue; 
			} else if (nums[idx] != nums[j] && !list.contains(nums[idx])) {
				
				list.add(nums[idx]); 
			}
		}
	}
	
		//System.out.println(list);
	
		int [] n = {233,22,225,22,62}; 
		
//		List<Integer> temp = Arrays.asList(233,22,225,22,62); 
		
		List<Integer> result = removeDuplicate(n); 
		
		System.out.println(result);
	
	
	
	}
	
	public static List<Integer> removeDuplicate(int [] nums) {
		
		List<Integer> numList = new ArrayList<>(); 
		
		for (int idx = 0; idx < nums.length; idx++) {
			
			for (int j = 0; j < nums.length; j++) {
				
				if (nums[idx] == nums[j] && idx != j) {
					
					continue; 
				}
					if (nums[idx] != nums[j] && idx != j) {
						numList.add(nums[idx]);
						break;
					}
				 
				}
			
			}
		
			return numList; 
		}
	
	
	
	

	
	public static List<Integer> uniqueNumbers(int [] numbers){
		
	List<Integer> temp = new ArrayList<>(); 
	
	for (int idx = 0; idx < numbers.length; idx++) {
		
		for (int j = 0; j < numbers.length; j++) {
			
			if (numbers[idx] == numbers[j] && idx != j) {
				continue; 
			} else if (numbers[idx] != numbers[j] && idx != j) {
				temp.add(numbers[idx]); 
			}
		}
	}

	return temp; 
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
