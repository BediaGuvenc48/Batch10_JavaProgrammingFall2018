
public class Love extends MyException {
	
	public static void main(String[] args) {
		
			myString("I love My Wife") ; 
			
		
	}
	
public static void myString(String str) {
	
		
		String [] strArray = str.split(" "); 
		
		for (int idx = 0; idx < strArray.length; idx++) {

			if (strArray[idx].equalsIgnoreCase("love")) {
				 
				throw new MyException();  
				
			} else {
				
				System.out.println("Great sentence !!! ");
				break;
			}
			
		}
		 
	}
	  

}
