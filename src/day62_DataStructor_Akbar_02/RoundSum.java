package day62_DataStructor_Akbar_02;

public class RoundSum {
	/*
	 * or this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit
	 *  is 5 or more, so 15 rounds up to 20.
	 *   Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, 
	 *   so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
	 *    To avoid code repetition, write a separate helper "public int round10(int num) {" 
	 *    and call it 3 times. Write the helper entirely below and at the same indent level as roundSum().


		roundSum(16, 17, 18) → 60
		roundSum(12, 13, 14) → 30
		roundSum(6, 4, 4) → 10*/
	
	
	public int round10(int num) {
		
		
		return num; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		 //10 + 10 +20 = 40
		System.out.println(sumOfRounded(8, 11, 19));
		
	}
	// roundSum(16->20, 17->20, 18->20) ->60
		// (12->10, 13->10, 14->10) ->30
	
		// 6->10,4->0,4->0, -> 10
	
	
	public static int round(int n1) {
		int remN1 = n1%10;
		
		if(remN1>=5) {
			n1 += (10-remN1); //10-6=4
		} else {
			n1 -= remN1;
		}
		
		return n1;
	}
	
	public static int sumOfRounded(int n1, int n2, int n3) {
		int sum = 0;
		sum = round(n1) + round(n2) + round(n3);
		return sum;
	}
}