package day29_Arrays06_multiD;

import java.util.Arrays;

public class MulitDArraySyntax {
	
	public static void main(String[] args) {
	
	double [][] prices = new double [3][]; 
	prices [0] = new double [] {234.34, 234.56, 788.45}; 
	prices [1] = new double [] {232.2, 100.4}; 
	prices[2] = new double [5]; 
	prices[2][0] = 543.34; 
	prices[2][1] = 6543; 
	prices[2][2] = 123.54; 
	prices[2][3] = 6543231.56; 
	prices[2][4] = 120003.54; 
	
	
//	prices ={  {234.34, 234.56, 788.56}, {23.2, 100.4}, {543.34, 6543, 123.54, 6665464.5, 1200003.54}    } 
	

	
	System.out.println(Arrays.toString(prices[0]));
	System.out.println(Arrays.toString(prices[1]));
	System.out.println(Arrays.toString(prices[2]));
	
	System.out.println(Arrays.deepToString(prices)); // it prints all elements inside dimentsional arrays in one line like string 
	
	System.out.println(">>>>>>>>>>>>>>>>>>>Seperate Array >>>>>>>>>>>>>>>>>>");
	
	int [][] nums = {{1,2,3},{4,5,6},{7,8,10000, 20000} }; 
	
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
