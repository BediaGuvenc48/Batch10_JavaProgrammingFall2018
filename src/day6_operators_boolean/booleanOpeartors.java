package day6_operators_boolean;

public class booleanOpeartors {
	
	public static void main(String [] args) {
		
	boolean isExpensive = true;	
	System.out.println(isExpensive);
	
	boolean isEnough = false; 
	System.out.println("Is it enoguh? " + isEnough);
	
	System.out.println( 10 > 5);
	System.out.println( 100 < 99);
	
	int count = 55; 
	System.out.println(count > 10);
	
	int currentNumber = 555; 
	System.out.println(count == currentNumber);
	
	int speedLimit = 55; 
	int currentSpeed = 60; 
	
	//check if curre.nt speed is more than speedlimit 
	//print if current speed is less than speedlimit 
	//print if current speed is equal than speedlimit 
	
	System.out.println(speedLimit > currentSpeed); 
	System.out.println(speedLimit < currentSpeed); 
	System.out.println(speedLimit == currentSpeed); 
	
	
	
	
	}
	
	 
	

}
