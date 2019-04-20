package day46_this_isa;

public class Practice {
	
	private String email; 
	private String sender; 
	private String receiver;
	
	
	public Practice(String email, String sender, String receiver) {
		this.email = email; 
		this.sender = sender; 
		this.receiver = receiver; 
		
		System.out.println("3 Arg-Constructor");
		
	}

	public String toString() {
		return "Practice [email=" + email + ", sender=" + sender + ", receiver=" + receiver + "]";
	}

	//overloading constracturs

	public Practice(String email) {
		
		this(email, "Unknown", "Unknown"); 
//		this.email = email; 
//		this.sender = "Unknown"; 
//		this.receiver = "Unknown"; 
		
	}
	
	//overloading constracturs
	
		public Practice(String email, String sender) {
			
			this(email, sender, "Unknown"); 
//			this.email = email; 
//			this.sender = sender; 
//			this.receiver = "Unknown"; 
			
			System.out.println("2 Constructor");
				
		}
	
		//overloading constracturs
		
		public Practice() {
			this("", "Unknown", "Unknown"); 
			
//			this.email = ""; 
//			this.sender = "Unknown"; 
//			this.receiver = "Unknown"; 
				
		}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
