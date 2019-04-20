package day54_Polymarphism01;

public class WarmUPTask {
	

/*
 
 
 Create 3 classes 

SlackUser.  ---> Abstract

	Instance Field
	  	age , name , 
	Constructor 
		2 arg constructor to set the field value 
	Methods 
		abstract sendMessage , take one string and return nothing

AdminUser 

	Field 
		isOwner : boolean
	Constructor 
		3 args constructor to set the field values 
	Methods : 
		activateUser take one String name as param return nothing 
	 	deActivateUser take one String name as param return nothing 

	 	override sendMessage to print ,send with @channel
 
 */
	

	public abstract class SlackUser{
		
		String name; 
		int age; 
		
		public SlackUser(String name, int age) {
			this.name = name; 
			this.age = age; 
		}
		
		abstract void sendMessage(String name);  
		
	}
	
	/*
	 RegularUser
	
	Field
		groupNumber : int 
	Constructor 
		3 args constructor to set the field values 

	Methods : joinAGroup()
		implement override sendMessage 
	 */
	
		public class RegularUser extends SlackUser{
			
			int groupNumber; 
			
			public RegularUser(String name, int age, int groupNumber) {
				super("Ahmad", 55); 
				this.groupNumber = groupNumber; 
			}
			
			void joinAGroup() {
				
				
			}

	
			@Override
			void sendMessage(String name) {
				
				
			}

			
			
		}
	
	/*
	
	AdminUser 

	Field 
		isOwner : boolean
	Constructor 
		3 args constructor to set the field values 
	Methods : 
		activateUser take one String name as param return nothing 
	 	deActivateUser take one String name as param return nothing 

	 	override sendMessage to print ,send with @channel
	 */
		
	
		public class AdminUser extends SlackUser{
			
			boolean isOwner; 
			
			public AdminUser(String name, int age, boolean isOwner) {
				super("Zeki", 55); 
				this.isOwner = isOwner; 
			}
			
			public void activateUser(String name) {
				
				System.out.println("Admin user can send message ");
			}
			
			public void deActivateUser(String name) {
		
				System.out.println("");
			}
		

			@Override
			void sendMessage(String name) {
				
				
			}
			
		}
		
			public static void main(String[] args) {
			
			
			
			
			}
	
	

}
