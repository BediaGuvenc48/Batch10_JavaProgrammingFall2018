package day41_classes_02_encapsulation;

public class FacebookUser {
	
	String name; 
	String username; 
	String password; 
	int age; 
	int numOfFriends;
	int phoneNumber; 
	
	public FacebookUser(String username, String password, int phoneNumber) {
		
		this.username = username; 
		
		if (password.equals(username)) {
			System.out.println("password should be different from user name");
		} else 
			
			this.password = password; 
		
		this.phoneNumber = phoneNumber; 
	}
	
		
	


}
