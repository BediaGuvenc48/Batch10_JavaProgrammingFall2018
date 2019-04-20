package day28_Arrays05;

import java.util.Arrays;

public class ArraysEqual {
	
	public static void main(String[] args) {
		
		
		/*equals method:
		 * first looks the length of the array 
		 * then check the index by index, if it not at the same position then will not 
		 * be equal according to equals method.  
		 * 
		 * when 2 arrays with same length and order of elements then they are equal 
		 */
		
		int [] a = {10, 20, 30}; 
		
		int [] b = {10, 20, 30}; 
		
		int [] c = {10, 20, 30, 40}; 
		
		int [] d = {10, 20, 40, 30}; 
		
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, d));
			
		Arrays.sort(d); 
		
		System.out.println(Arrays.toString(d));
		
		System.out.println(Arrays.equals(c, d));
		
		boolean bool = Arrays.equals(c, d); 
		System.out.println(bool);
		
		//user operator to compare instead of equals metho 
		
		System.out.println(a == b);//when you compare, don't use from == becasue it will 
								  //point to the memory space, doesn't look the element
		
		int [] j = a; //this one you intitialize the same int and point to same memory 
					 //this will return true
		System.out.println(a == j); 
		
		
		j[0] = 1000; 
		System.out.println(Arrays.toString(j));
		System.out.println(Arrays.toString(a));
	}

}
