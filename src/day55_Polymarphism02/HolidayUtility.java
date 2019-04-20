package day55_Polymarphism02;

public class HolidayUtility {
	
	public static void main(String[] args) {
		
//		Holiday h = new Holiday(); 
//		
//		sendHlidayMessage (h); 
//		
//		Holiday h1 = new Christmas(); 
//		
//		sendHlidayMessage(h1); 
//		
//		Holiday h2 = new NewYear(); 
//		
//		sendHlidayMessage(h2); 
//		
//		// Object o = h1; -> it will be upcasting behind the seen, if ywe pass h1 to sysout
//		System.out.println();
//		
		
		
		GiftReceiver gift = new Christmas();
		
			sendHlidayMessage(gift); 
		
			Christmas gc = (Christmas) gift; 
			
			
		
		
		
		
		
		
		
	}
	
	
//	static void sendHlidayMessage(Holiday h) {
//		
////		System.out.println("Sending message from utility");
////		h.sendHlidayMessage(); 
//	}
	
	static void sendHlidayMessage(GiftReceiver gift) {
		
		System.out.println("Sending message from utility");
		gift.receiveGift();  
	}
	

}


