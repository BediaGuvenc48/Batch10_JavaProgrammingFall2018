package ReviewSessionShaheen;

public class StringManipulation {
	
	public static void main(String[] args) {
		
	
		
		String myRandomXPath = randomXpath(); 
		System.out.println(myRandomXPath);
		
	}
	

	
	
	 static String randomXpath() {
		
		 int random = (int)(Math.random() * 7) + 1; 
		 
		 String initXPath = "//ul[@id='products']/li[1]"; 
		 
		 String randomXpath = "//ul[@id='products']/li[ " + random + "]";  
		 
		 String number = "" + randomXpath.indexOf('@'); 
	
		 return number; 
	}
	

}
