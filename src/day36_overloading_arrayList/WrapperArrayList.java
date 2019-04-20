package day36_overloading_arrayList;
import java.util.ArrayList; 
public class WrapperArrayList {
	
	public static void main(String[] args) {
		
		Integer n = 100; //object and has a behaviors 
		int n2 = 100; //data only and doesn't have behaviors 
		
		ArrayList<Integer> nums = new ArrayList<>(); 
		//add a number now 
		nums.add(500); 
		nums.add(300); 
		nums.add(1234);
		nums.add(654); 
		
		nums.isEmpty(); 
		System.out.println(nums.isEmpty());
		System.out.println(nums);
		//or 
		System.out.println(nums.toString());
		
		for(Integer num : nums) {
			System.out.println(num);
		}
		
		System.out.println("=========================");
		
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println("=========================");
		
		for (int idx = 0; idx <nums.size(); idx++) {//it gives you the array elements 
			
			System.out.println(nums.get(idx));
		}
		
	}

}
