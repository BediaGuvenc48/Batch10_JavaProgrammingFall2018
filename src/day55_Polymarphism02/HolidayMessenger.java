package day55_Polymarphism02;

public class HolidayMessenger {
	
	
	public static void main(String[] args) {
		
		
		Holiday h1 = new Christmas(); 
		
		
			h1.name = "Chrismass Holiday"; 
			h1.sendHlidayMessage(); 
			Christmas c1 = (Christmas) h1; 
			//downcasting to access the other method, basically copying the address of h1 
			
			
			
			c1.giftCount = 15; 
			System.out.println( c1.giftCount );
			
			System.out.println( ((Christmas) h1).giftCount     ); //this is another way, it is like a paper without name, you can access the methods 
																  //and the objects, but try not to do it, because it is confusing 
			
			c1.exchangeGifts();
			
			
			h1 = new NewYear(); 
				//h1 is Holiday type and can access same object or methods 
			h1.sendHlidayMessage(); 
			
	//ONLY REFERECE TYPE DECIDE WHAT YOU CAN ACCESS AT COMPILE TIME 		
			
			
		Holiday y = new NewYear(); 
			y.name = "New Year in DC"; 
			y.sendHlidayMessage();
			
		
		Holiday hs = new Holiday(); 
			hs.name = "Sh"; 
			hs.sendHlidayMessage();
			
	//ONLY REFERECE TYPE DECIDE WHAT YOU CAN ACCESS AT COMPILE TIME 
			
		NewYear n1 = (NewYear) h1; 
		
			//Downcasting happened here above 
		
		c1.exchangeGifts(); 
		
		GiftReceiver g = new Christmas(); 
			g.receiveGift(); //only you can see the reference type of GiftReceiver
		Christmas c2 = (Christmas) g; 
		
		c2.giftCount = 100; 
		c2.name = "Casted Christmas"; 
		c2.exchangeGifts();
		c2.sendHlidayMessage(); 
		
		//Once you downcast it, then you can 
		
		
	}

}



