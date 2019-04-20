package day47_inheritanceIntro;

 public class ElectricalCar extends Car {
	
	
	public static boolean hasBattery; 
	public int batteryLevelMiles; 
	//hasBattery = true
	//batteryLevelMiles 
	//charge();
	
	 

		public void charge () {
			
			System.out.println("My electrical vehcile gets charged every other day");
			
		}
}
