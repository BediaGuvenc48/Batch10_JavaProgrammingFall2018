package day4_operator;

public class BasicMathOperators {
	
	public static void main(String [] args){
	
		//create 3 variables; apples, carrots, tomatoes
		//add prices to it with decimals 
		//create variable called total and assign total price
		//also print the tax then add the task to the total 0.06; 
		//print your total is price with total price with tax 
		
		
		double apples = 5.0; 
		
		double carrots = 3.99; 
		
		double tomatos = 10.99; 
		
		double total = 0; 
		
		total = apples + carrots + tomatos; 
		
		System.out.println( "The Total before tax: " + total);
		
		double tax = total * 0.06; 
		
		double finalResult = total  + tax;  
		
		System.out.println("Total after tax: " + finalResult );
		
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		//create 2 int variables and assign values
//		
//		int num1 = 100; 
//		int num2 = 200; 
//		
//		System.out.println(num1 + num2);
//		System.out.println(num1 + num2 +1000);
//		
//		int sum = num1 + num2 + 10;
//		System.out.println("Sum is " +sum);
//		
//		//create 3 variables; apples, carrots, tomatoes
//		//add prices to it with decimals 
//		//create variable called total and assign total price
//		//also print the tax then add the task to the total 
//		//print your total is price with total price with tax 
//		
//		float apples = 3.99f;
//		double carrots = 2.99; 
//		float tomatoes = 5.99f; 
//		double totalBeforeTax = apples+carrots+tomatoes; 
//		
//		System.out.println("Total Before Tax:" + totalBeforeTax);
//		
//		//Calculate tax
//		
//		double tax = totalBeforeTax * 0.06;
//		System.out.println("Total tax: " + tax);
//		
//		double grandTotal = totalBeforeTax + tax;
//		System.out.println("Your Tota is $" +grandTotal);
		
		
	}

}
