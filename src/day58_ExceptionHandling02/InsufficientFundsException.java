package day58_ExceptionHandling02;

public class InsufficientFundsException extends RuntimeException {

	InsufficientFundsException(){
		
	}
	 
	InsufficientFundsException(String message){
		
		super(message); 
	}
	
	

}
