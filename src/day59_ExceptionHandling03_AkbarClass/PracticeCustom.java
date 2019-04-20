package day59_ExceptionHandling03_AkbarClass;

public class PracticeCustom {
	
	
	public static void main(String[] args) throws Exception {
		
		Exception e = new Exception ("SOME CUSTOM MESSAGES HERE >>>>>"); 
		
			throw e; 
		
	}

}


class PocketOutOfMoneyException extends RuntimeException{

	
	
	public PocketOutOfMoneyException () {
		
		System.out.println("NO Arg ");
	}
	
	
	public PocketOutOfMoneyException (String message) {
		
		super(message); 
		 
	}
	
	
}