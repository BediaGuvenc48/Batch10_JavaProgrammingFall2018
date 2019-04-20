package day42_classes_03_Canstructor;

public class Amazon {
	
	private String email; 
	private String password; 
	
	public String getEmail() {
		
		return email; 
	}
	
	public void setEmail(String email) {
		
		this.email = email; 
	}
	
	public String getPassword() {
		
		return password; 
	}
	
	public void setPassword(String password) {
		
		if (password.length() < 8) {
			System.out.println("Error !!! Password must be 8 characters at least");
			return; 
			
		} 
		
			this.password = password; 
	}
	
	public Amazon(String email, String password) {
		
		this.email = email; 
		this.password = password; 
	}
	
	public String setAcountInfo() {
		
		return this.email + " >>> " + this.password + " >>>>"; 
	}
	
	

}
