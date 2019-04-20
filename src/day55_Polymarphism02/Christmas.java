package day55_Polymarphism02;

public class Christmas extends Holiday implements GiftReceiver{

	int giftCount;

	@Override
	public void sendHlidayMessage() {
		super.sendHlidayMessage();//you can access the main holiday method which is super class
		System.out.println("This is Chrismass Class overried message");
		
		
	} 
	
	public void exchangeGifts(){
		
		System.out.println("This is christmass of 2018 ----> ");
	}

	@Override
	public void receiveGift() {
		System.out.println("Chrismas class gift reciever message");
		
	}
	
	
	
	
}
