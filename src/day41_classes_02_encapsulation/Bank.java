package day41_classes_02_encapsulation;

public class Bank {
	
	public static void main(String[] args) {
		
		
		checkBook myCheck = new checkBook(); 
		
			myCheck.set$Ammount(55.99);

		System.out.println(myCheck.get$Amount());
			
		
			myCheck.setName("Tom Smith");
		
		System.out.println(myCheck.getName());
		
			myCheck.setDate(11062018);
			
		System.out.println(myCheck.getDate());
		
		StringBuilder r = new StringBuilder(); 
			String result = r.toString(); 
			
			String [] arr = result.split(""); 
	}
	


}
