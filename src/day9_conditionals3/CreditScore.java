package day9_conditionals3;

public class CreditScore {
	public static void main(String[] args) {
		
		
		int creditScore = 0; 
		
		if (creditScore > 0 && creditScore <300) {
			System.out.println("Bad Credit Score");
		}else if (creditScore >= 300 && creditScore<=579) {
			System.out.println("Poor Credit Score");
		}else if (creditScore >=580 && creditScore <= 669) {
			System.out.println("Fair Credit Score");
		}else if (creditScore >=670 && creditScore <=739) {
			System.out.println("Good Credit Score");
		}else if (creditScore >=740 && creditScore <=799) {
			System.out.println("Very Good Credit Score");
		}else if (creditScore >=800 && creditScore <=850) {
			System.out.println("Exceptional Credit Score");
		}else {
			System.out.println("Ghost Credit score");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
