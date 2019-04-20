package day28_Arrays05;

import java.util.Arrays;

public class arraysCopyOf {
	
	public static void main(String[] args) {
		
/*
 * CopyOf: 
 * Arrays.copyOf(SourceArray, limitIndex); 
 * 
 * copyOf method is used to copy an array into another
 */
		
		String [] asad = {"ahmad", "zabih"}; 
		
		String [] fawad = Arrays.copyOf(asad, 4); 
		
		System.out.println(Arrays.toString(fawad));
		
	int[] a = {10, 20, 30}; 
	
	System.out.println("=======");
	int [] d = Arrays.copyOf(a, 4); 
	System.out.println(Arrays.toString(d));
	
	int[] b = Arrays.copyOf(a, 3); 
	
	System.out.println(Arrays.toString(b));
	
	System.out.println(Arrays.toString(a));
	
	int[] c = Arrays.copyOf(a, 5);
	 c [3] = 40; 
	 c [4] = 10000; 
 
	System.out.println(Arrays.toString(c));
	
	System.out.println("---------------");
	
	System.out.println(Arrays.toString(a));
	
	a = Arrays.copyOf(a, 10); 
	
	System.out.println(a.length);
	
	System.out.println(Arrays.toString(a)); // increased by 1 
	
	a = Arrays.copyOf(a, 2); 
	
	System.out.println(Arrays.toString(a)); // decrease by 2, it was 4 now it is 2  
		
	// Arrays always fixed size, can not resize it. 
	// the above code will create a new array and assign 
	
	/*
	 * Arrays methods: 
	 * 
	 * - sort 
	 * - toString 
	 * - binarySearch 
	 * - copyOf
	 * - equals 
	 * 
	 */
		
	String [] arr = {"apple", "banana", "mango", "peach"};
	
	//sort 
	
	Arrays.sort(arr);
	
	//toString 
	
	arr.toString(); 
	System.out.println(arr.toString());
	
	//binarySearch 
		
	Arrays.binarySearch(arr, "mango"); 
	
	//copyOf 

	String [] x = Arrays.copyOf(arr, 6);  
	
	//Equals: 
	
	Arrays.sort(arr);
	Arrays.sort(x);

	Arrays.equals(arr, x); 

	/*equals method:
	 * first looks the length of the array 
	 * then check the index by index, if it not at the same position then will not 
	 * be equal according to equals method.  
	 */
	
	int [] a1 = {1, 2, 3}; 
	
	//int [] b1 = {1, 3, 2}; 
	
	System.out.println(Arrays.toString(a1)); 
	
	
	int [] number = {1, 2, 8, 3, 4, 5, 1000, 200}; 
	
		number = Arrays.copyOf(number, 10); 
		System.out.println(number.length);
		
		System.out.println(Arrays.toString(number));
	
	}

}
