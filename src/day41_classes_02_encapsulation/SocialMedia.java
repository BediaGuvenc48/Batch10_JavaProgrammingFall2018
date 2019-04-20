package day41_classes_02_encapsulation;

public class SocialMedia {
	
	public static void main(String[] args) {
	
		
	FacebookUser user1 = new FacebookUser("aiaz786", "123", 571333555); 
	FacebookUser user2 = new FacebookUser("adam", "adam1335", 75300000); 
		
		user1.age = 15; 
	System.out.println(user1.age);
	System.out.println(user1.username);
	System.out.println(user1.password);
	
	
	FacebookUser user3 = new FacebookUser("ahmad123", "ahmad123", 57575757); 
	
		System.out.println(user3.password);
	
	
		SocialMedia s = new SocialMedia(); 
		
	 
		System.out.println( s.doubleX("xaxxx"));
		
	}
	
	
	boolean doubleX(String str) {
		  
		  for (int idx = 0; idx < str.length(); idx++){
		    
		   //   if (str.charAt(idx).equalIqnoreCase("x") && str.charAt(idx+1).equalIqnoreCase("x")){
			      
			  if (str.charAt(idx) == 'x' && str.charAt(idx+1) == 'x') {
				  return true; 
			  }
			  
			   
		  }
		    
		     return false; 
		}

	
	

}
 