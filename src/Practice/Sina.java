package Practice;

import java.util.Arrays;

public class Sina {

	public static void main(String[] args) {
		
		int a[]={6,2,1200,5,1};
		
		int max = 0; 
		
		for (int idx = 0; idx < a.length-1; idx++) {
			
			if (a[idx] > max) {
				max = a[idx]; 
			}
		}
		System.out.println("Max is: " + max);
		
		int [] nums = decArray(a); 
		System.out.println(Arrays.toString(nums));
		
		
//
//	    System.out.println(Arrays.toString(a));
//	     int temp;
//	     for(int i=0;i<a.length-1;i++){
//	         for(int j=0;j<a.length-1;j++){
//	             if(a[j] < a[j+1]){   // use < for Descending order
//	                 temp = a[j+1];
//	                 a[j+1] = a[j];
//	                 a[j]=temp;
//	             }
//	         }
//	     }
//	    System.out.println(Arrays.toString(a));
	    
	    
//	    int [] reverse = new int [a.length];   
//	    
//	    for (int idx = a.length-1; idx >= 0; idx--) {
//
//	    	reverse[idx] += a[idx]; 
//	    	
//	    }
//	    
//	    System.out.println(Arrays.toString(reverse));
//	    

	//Output:
	//[6, 2, 5, 1]
	//[1, 2, 5, 6]

	//ilk for dongusunu de array uzunlugu kadar dondurmemiz gerekiyor
	//ikili ikili kiyas edip siraliyoruz
	

//	int [] nums = {2,1,5}; 
//	
//	int max; 
//	
//	for (int idx = 0; idx < nums.length-1; idx++) {
//		
		
		
//		for (int j = 0; j < nums.length-1; j++) {
//			
////			if (nums[j] < nums[j+1]) {
////				temp = nums[j+1]; 
////				nums[j+1] = nums[j]; 
////				nums[j] = temp; 
////			}
//			
//		 
//			
//			
//		   }
//	    }
//			System.out.println(Arrays.toString(nums));
    
	
	
//	int [] n = {1,2,36,3,5}; 
//	
//	int max = 0; 
//	
//	for (int idx = 0; idx < n.length; idx++) {
//		
//		if (n[idx] > max) {
//			max = n[idx]; 
//		}
//	}
//		System.out.println(max); 

}
	
	public static int [] decArray(int [] nums) {
		
		int [] numbers = new int [nums.length]; 
		
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
		
		
		
		return nums; 
	}
	
	
	
}






	
	
 