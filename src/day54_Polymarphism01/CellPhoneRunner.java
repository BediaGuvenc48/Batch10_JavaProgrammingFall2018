package day54_Polymarphism01;

public class CellPhoneRunner {

	
	public static void main(String[] args) {
		
		Phone ph = new CellPhone(); 
		
			ph.makeCall(); 
			
			
			Phone p = new CellPhone();
			
			System.out.println(p.buttonCount + " "); //ITS TAKING THE VALUE FROM SUPERCLASS. 
			
			p.makeCall();
			
			((CellPhone)p).callWithoutCable(); //CASTING THE CLASS, YOU CAN ACCESS NON-OVERRIDE METHODS.
			System.out.println(((CellPhone)p).isTouchScreen=true);	
	}
}
