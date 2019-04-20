package day9_conditionals3;
import java.util.Scanner; 
public class FindLargerNumber {
	public static void main(String[] args) {
		
		/*
		 *You have 2 variables num1 and num2
		 *assign value of larger one into variable max 
		 *print value of Max --> "Max": number:
		 *you have 3 variables num1, num2, nm3 and assign value of largest one into variable max 
		 *print vlalue of max --> "Max: number"
		 */
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println(" ----I FIND LARGER NUMBER ---");
		
		System.out.println("Enter 2 numbers:");
		int num1, num2, num3, max; 
		
		num1 = scan.nextInt(); 
		num2 = scan.nextInt(); 
		
		if (num1 > num2) {
			max = num1; 
		}else{
			
			max = num2; 
			System.out.println("Max: " + max);
		}
		
		/*you have 3 variables num1, num2, num3 and assign value of largest one into variable max 
		 *print value of max --> "Max: number"
		 */
		
	Scanner input = new Scanner(System.in); 
	
	System.out.println(" -----Finding Larger 3 Numbers");
	
	
	System.out.println("Enter 3 Numbers:");
	num1 = input.nextInt(); 
	num2 = input.nextInt(); 
	num3 = input.nextInt(); 
	
	//if(num1 >= num2 && num1 >= num3) { 
	//	max = num1; 
	//}else if (num2 > num1 && num2 > num3){
		
	//	max = num2; 
	//} else if(num3 > num1 && num3 > num2)
	//	max = num3; 
	
	
	if (num1>num2 && num1 > num3) {
		max = num1; 
		
	}else if (num2>num3) {
		max = num2; 
	}else {
		max = num3; 
	}
	System.out.println("Max: " + max); 
	
		
		input.close(); 
		scan.close(); 
	
	}
		
		
	}

