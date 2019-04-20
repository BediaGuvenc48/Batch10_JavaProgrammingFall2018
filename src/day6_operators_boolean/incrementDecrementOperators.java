package day6_operators_boolean;

public class incrementDecrementOperators {
	
	public static void main(String [] args) {
		
		int windowsComputer = 35; 
		windowsComputer++; 
		//windowsComputer++; same as windowsComputer = windowsComputer + 1;  
		
		
		System.out.println(windowsComputer);
		
		int unreadMessages = 50; 
		
		System.out.println("Unread messages: " + unreadMessages); 
		
		System.out.println("Read one message");
		
		unreadMessages--; 
		
		unreadMessages--; 
		System.out.println("Unread messages: " + unreadMessages); 
		
		
		
	}

}
