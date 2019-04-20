package day50_final_super_abstraction;

public class HomeWork {
	
	String questions; 
	
	public HomeWork(String questions) {
		
		this.questions = questions; 
		
		System.out.println("The questions are so confusing !!! Constructor's input");
	}
	
	
	static {
			
			System.out.println("This is static block, just for test purposes, it runs only once at the begenning");
		}
		
	
		{
			System.out.println("This is intializer block, it runs when the object of class is created");
		}
	
		

	
	
}
