package day10_conditionals4;

public class TernnaryOperators {

	public static void main(String[] args) {
		
		
		
		
	//int num = 5; 
	//String status; 
	
	//status = (num > 0) ? "positive" : "negative"; 
	//System.out.println(status);
		//max score 100. passing score is 60 
	//}
	

	int num = 5; 
	String status; 
	
	if (num > 0) {
		status = "positive"; 
	} else if(num < 0) {
		status = "negative"; 
	}
	
	status = (num > 0) ? "positive" : "negative"; 
		
	
	
	
	
		
		int score = 50; 
		String status1; 
		
		//if (score >=60) {
		//	status = "passed"; 
		//}else {
		//	status = "failed"; 
	
		status1 =  (score >= 60) ? "passed" : "failed";  
	
	
	
	
	
	
	
			
		//} 
		//System.out.println(status);
		
		//The easiest way of using if conditionals, some times just use Ternary Operators which is basically 
		//a questions mark. 
		
	//status = (score >= 60) ? "passed" : "failed"; 
	
	//System.out.println(status);
		
		//boolean variableExpress = true; 
		//String delivery; 
		
		//delivery = (variableExpress = false) ? "25 $" : "15 $"; 
		
		//System.out.println(delivery);
		
		
		boolean express = true; 
		//System.out.println( (express) ? 25 : 15); 
		int shipping = (express == true) ? 25 : 15; 
		
		System.out.println(shipping);
		
		
		

		
	}
}
	

