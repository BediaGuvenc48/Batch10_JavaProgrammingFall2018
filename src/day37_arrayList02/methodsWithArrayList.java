package day37_arrayList02;

import java.util.*; 

public class methodsWithArrayList {
	public static void main(String[] args) {
		
		ArrayList <Integer> numList = new ArrayList <Integer>();
		
		numList.add(1000); 
		numList.add(2000); 
		numList.add(4000); 
		numList.add(5000); 
		
		int result = sumList(numList); 
		System.out.println(result);
		
		ArrayList <Integer> n1 = new ArrayList <Integer>();
		
		n1.add(100); 
		n1.add(200); 
		n1.add(300); 
		
		ArrayList <Integer> n2 = new ArrayList <Integer>();
		
		n2.add(2000); 
		n2.add(3000); 
		n2.add(4000); 
		
		int res = sumList1(n1,n2); 
		System.out.println(res);
		
		ArrayList<Integer> randomList = buildIntList(500); 
		System.out.println(randomList);
		
		
	}
	
/*
 * how to write method that accepts an Arraylist
 * when you make a method that accepts the Array list then just put the left portion 
 * and put it there 
 */
	public static int sumList(ArrayList<Integer> nums) {
		
		int sum = 0; 
		
		
		for (int idx = 0; idx < nums.size(); idx++) {
			
			sum += nums.get(idx); 
		}
			return sum; 
		
//		for (int num : nums) {
//			
//			sum += num; 
//		}
//
//			return sum; 
	}
	
/*
 * Write an Array that accepts 2 ArrayList and return the same of both ArrayList
 */
	public static int sumList1(ArrayList<Integer> num1, ArrayList<Integer> num2 ) {
		
//		int sum = 0; 
//		
//		for (int idx = 0; idx < num1.size(); idx++) {
//			
//			for (int j = 0; j < num2.size(); j++) {
//				
//				sum = num1.get(idx)+num2.get(j); 
//			}
//		}
//			return sum;
		
	int sum = 0; 
	
		for (int num: num1) {
			
			sum+= num; 
		}
		
		for (int number : num2) {
			
			sum+= number; 
		}
			return sum; 
	}
	
	/*
	 * Method name : buildIntList 
	 * Return type: ArrayList of integer 
	 * Args: int 
	 * 
	 * This method gets an int and creates an arrayList with that many random
	 * numbers between 0 - 100 and returns it. 
	 */
	
	public static ArrayList<Integer> buildIntList(int count) { 
		
		Random random = new Random();
		ArrayList<Integer>returnList = new ArrayList<>(); 
		
		for (int idx =1; idx <= count; count++) {
			
			random.nextInt(101);
			returnList.add(random.nextInt(101)); 	
		}
		
		return returnList; 
		
   }

}
