package day40_customclasses;

public class TMobile {
	
	
	// Properties/Data/Information: before it was inside our main method and now we generate 
	//it inside our class
	
	/*
	 
	 	TMobile Behaviors; 
	 	1. call 
	 	2. Text 
	 	3. interData; 
	 
	 */
	
	String phoneType; 
	int phonePlan; 
	int internetPlan; 
	
	
	public void call() {
		
		System.out.println("My TMobile phone can make a call");
		
		String name = "Ahmad";  
		
		for (int idx = name.length()-1; idx >= 0; idx--) {
			
			System.out.println(name.charAt(idx));
		}
		
	}
	
	public void text() {
		
		System.out.println("My TMobile Galaxy Note3 can send text messages");
	
	}
	
	public void interData() {
		
		System.out.println("My internet pacakge includes 5 GB internet access");
		System.out.println("The coverage is only in U.S local limitted");
	}
	

}
