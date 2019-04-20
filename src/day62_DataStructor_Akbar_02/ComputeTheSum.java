package day62_DataStructor_Akbar_02;

public class ComputeTheSum {
	
	//Write a java method which takes an integer an returns the sum of the digits in that integer
	// Given 2368 --> result: 19 (2+3+6+8)

	public static void main(String[] args) {
		System.out.println(computeSumOfDigits(2368));
		String word =236.23003+"";
		System.out.println(word);
		System.out.println(word.substring(word.indexOf(".")+1));
		System.out.println(computeSumOfDigits(236.23003)); //--> 19

		
	}
	
	public static int computeSumOfDigits(int n) {
		
		int sum =0;
		int remainder;
		while(n!=0) {
		remainder = n%10; //2368%10 --> 8 | 2368 - 8 ->> 2360/10 -> 236 
		sum += remainder;
		n = (n-remainder)/10; //2368 -8 = 2360/10 = 236
		}
		
		return sum;
	}
	
	//overload to accept double value
	//236.23003 2362 --> 2+3+6+2=13
	public static int computeSumOfDigits(double n) {
		int sum =0;
		int remainder;
		String strNum = ""+n;
		strNum = strNum.substring(strNum.indexOf(".")+1);
		int num2 = Integer.parseInt(strNum);
		while(num2!=0) {
			remainder = num2%10;
			sum += remainder;
			num2 = (num2-remainder)/10;
		}
		int num1 = (int) n;
		while(num1!=0) {
			remainder = num1%10;
			sum += remainder;
			num1 = (num1-remainder)/10;
		}
		
		return sum;
	}	
	
}
