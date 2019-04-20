package day33_MethodWithReturn02;

public class ConvertUtility {
	
	public static void main(String[] args) {
		
		double miles =	mile2Km(9.0); 
		System.out.println(miles);
		
		fahrenheigToCelcius(48); 
		
		int temperature = fahrenheigToCelcius(80);  
		
		System.out.println(temperature);
		
		double mile = mileTwoKm(18.8); 
		System.out.println(mile);
	
	}
	
	/*
	 * Write a method: mile2Km , accepts miles and return km value; 
	 * 
	 * return type: double 
	 * pramameters: 1 double 
	 */
	
	
	public static double mile2K(double mile) {
		
		double temp = 0; 
		
		temp = mile * 1.6; 
		
		return temp; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static double mileTwoKm(double km) {
		
		return km * 1.601; 
	}

		public static double mile2Km(double mile) {
			
			CalculatorV2.multiply(mile, 1.609);
			double km = CalculatorV2.multiply(mile,1.609);
			return km;
			
//			double km = 1.609 * mile; 
//			return km; 
			
			
		}
		
	/*
	 * Method Name: fahrenheigToCelcius 
	 * Action: accepts fahrenheit and returns Celcius value 
	 * Return Type: int 
	 * Param: 1 int 
	 */
		
		public static int fahrenheigToCelcius(double fahrenheit) {
			
//			double Celcius = 0.55 * (fahrenheit - 32);
//			
//			return (int) Celcius; 
			
			CalculatorV2.multiply(0.55, (fahrenheit - 32));
			
			double Celcius = CalculatorV2.multiply(0.55, (fahrenheit - 32));
			return (int) Celcius; 
			
			
			
		}
		
		
}


