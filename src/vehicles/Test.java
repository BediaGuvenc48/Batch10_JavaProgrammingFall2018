package vehicles;

public class Test {
	
	public static void main(String[] args) {
		
		Vehicle corolla = new Toyota(); 
		
		corolla.changeGear(3);
		
		Computer mac = new Computer(); 
		corolla.changeGear(3);
		corolla.speedUp(80);
		corolla.applyBreaks(30);
		corolla.openTrunk();
		corolla.printStates();
		System.out.println(corolla instanceof Vehicle);
		System.out.println(mac instanceof Vehicle);
		//corolla.changeGear(10); //we created a custom exception that way if the gear is more than 8, then it will throw an Illeagal exception. Because we had a  final int MAX_GEARS = 8;
		corolla.speedUp(150); //same thing the IlleagalException will be thrown, because the 	final int MAX_SPEED = 150; 
		 
		
		//instanceof: it stands for realtionship between the classes or interfaces 
		
		System.out.println(mac instanceof Vehicle); //there is no relationship between the Vehicle and the Computer that is why it returns false 
		
		 Vehicle.openHood();//openHood(); is a static method inside the Interface Vehicle, in order to call this method, you have to say the name of interface then dot the name of method. 
		
		
		
			
	}

}
