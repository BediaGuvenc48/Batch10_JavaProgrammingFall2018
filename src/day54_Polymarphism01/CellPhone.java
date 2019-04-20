package day54_Polymarphism01;

class CellPhone extends Phone {
	
	int buttonCount;

	@Override
	public void makeCall() {
		
		System.out.println("Calling from CellPhone !!!");
	} 
	
	public void callWithoutCable() {
		System.out.println("a method in cellPhone only"); 
	
	}

	
}
