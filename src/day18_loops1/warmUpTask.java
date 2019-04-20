package day18_loops1;

public class warmUpTask {
	
	public static void main(String[] args) {
		

		
//		Create a string variable SMSmessage, assign following value:
//		"Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"
//		Create 3 string variables:
//		sender, phoneNumber,message
//		by using indexOf and substring methods,
//		retrieve related information from SMSmessage string and assign to those 3 variables.
//
//		print each variable in separate line		
		
	

		//We have to create a flexible code which doesn't change, even if the name is 
		//change we still can find it. 
	
		
		 String SMSmessage = new String("Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}"); 
		 String sender, phoneNumber, message; 
		 
		 //it is very important in programming when you have long statement and take a 
		 // small part of the statement out. 
		 
		/* sender = SMSmessage.substring(SMSmessage.indexOf("<")+1, SMSmessage.indexOf(">")); 
		 	System.out.println(sender);
		 	
		  phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1, SMSmessage.indexOf("]")); 
			 	System.out.println(phoneNumber);
			 	
			message = SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}")); 
				 	System.out.println(message);*/
				 	
		 
		 sender = SMSmessage.substring(SMSmessage.indexOf("<")+1, SMSmessage.indexOf(">"));
		 
		 phoneNumber = SMSmessage.substring(SMSmessage.indexOf("[")+1, SMSmessage.indexOf("]"));
		 
		 message = SMSmessage.substring(SMSmessage.indexOf("{")+1, SMSmessage.indexOf("}"));
		 
		 
		System.out.println(sender);
		System.out.println(phoneNumber);
		System.out.println(message);
		
		
	}
		
}
