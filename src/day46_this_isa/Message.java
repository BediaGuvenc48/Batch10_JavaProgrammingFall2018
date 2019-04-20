package day46_this_isa;

/*
 * template class for Messages 
 * @author cybertekschool 
 */

public class Message {
	
	private String body; 
	private String sender; 
	private String receiver;
	
	
	public Message(String body, String sender, String receiver) {
		this.body = body;
		this.sender = sender;
		this.receiver = receiver;
		
	}
	
	
	//overload the constructor 
	
	//sender and reveiver are unknown 
	

	public String toString() {
		return "Message [body=" + body + ", sender=" + sender + ", receiver=" + receiver + "]";
	}


	public Message(String body) {
		
		this(body, "Unknown", "Unknown"); //this is calling the constructor above, but sender and receiver is not known. 
										 //it is using from kewyword this(); 
		
		System.out.println("1 Arg constructor");
//		this.body = body; 
//		this.sender = "Unknown"; 
//		this.receiver = "Unknown"; 
			
	}
	
	//overload the constructor 
	
	public Message (String body, String receiver) {
	
		this(body, "Unknown", receiver); //again we refactor it, to make it better. 
		System.out.println("2 Args Constructor");
		
		
//		this.body = body; 
//		this.receiver = receiver; 
//		this.sender = "Unknown"; 
	}
	
	public Message() {
		
		this("", "Unknown", "Unknown"); 
		
//		this.body = ""; 
//		sender = "Unknown"; //we can use sender = "Unknown"; and receiver = "Unknown"; it will work, because there is only 1 Constructor. 
//		receiver = "Unknown"; 
	}
	
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	} 
	
	
	
	

}
