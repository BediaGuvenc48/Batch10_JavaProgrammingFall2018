package day31_Method02;

public class Calculation {
	
	public static void main(String[] args) {
		
		//lets add 1234 + 400 using add method of Calculator class 
		/*
		 * we are mentioning the class name because divide method is not in 
		 * same class 
		 * 
		 * when we need to use our method in other packages, then we need to import 
		 * the method like we import Scanner, Random or other classes
		 */
		
		calculator.Add(1234, 400);
		calculator.Divide(1000.55, 30.55);
		calculator.Multiply(5.5, 5.9);
		calculator.Subtract(1999, 1953);
		
	}
	
}
