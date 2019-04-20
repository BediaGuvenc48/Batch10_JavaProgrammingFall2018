package day47_inheritanceIntro;

public class CarMax extends Object {
	
	public static void main(String[] args) {
	
		
//		//create object of Vehicle class or we can say 
//		//instantiation of Vehicle class 
//		
//		Vehicle vehicle = new Vehicle(); 
//		
//		vehicle.makeAndModel = "Toyota Prius"; 
//		vehicle.year = 2015; 
//		vehicle.maxSpeed = 60;
//		vehicle.millage = 35000; 
//
//		vehicle.drive();
//		vehicle.stop(); 
//	
//		//vehicle.doUber(); It does not work, because of ineheritance rule, just one way forward, not backward 
//		//vehicle.horsePower(); This will not compile either for the same purpose 
//		
//		//Instantiation of Car class 
//		
//		//if we don't use inheritance, then it would not work 
//		Car c1 = new Car(); 
//		
//		c1.makeAndModel = "Honda Civic"; 
//		c1.year = 2018; 
//		c1.maxSpeed = 120; 
//		c1.millage = 12000; 
//		
//		c1.drive();
//		c1.stop();
//		c1.doUber();
//		c1.horsepower();
//		
//		
//		System.out.println("==========Train=========");
//		Train train = new Train(); 
//		
//		train.makeAndModel = "CyberTrain 10"; 
//		train.year = 2015; 
//		train.maxSpeed = 250; 
//		train.millage = 50000; 
//		
//		train.leaveStation();
//		train.drive();
//		train.stop();
//		
//		System.out.println("========Electrical Car =========");
//		
//		ElectricalCar tesla = new ElectricalCar(); 
//		
//		tesla.makeAndModel = "Toyota Tesle"; 
//		tesla.year = 2017; 
//		tesla.maxSpeed = 180; 
//		tesla.hoursePower = 518; 
//		tesla.batteryLevelMiles = 300; 
//		tesla.millage = 80000; 
//		ElectricalCar.hasBattery = true;
//		
//		
//		//Behaviours of the electrical cars 
//		
//		tesla.drive();
//		tesla.stop();
//		tesla.doUber();
//		tesla.charge();
//	
//		System.out.println("Has Battery? -> " + ElectricalCar.hasBattery);
//	 
//		
//		System.out.println("=======sttic service calls ==========");
//		
//		//Each time we call service, it will be usable through HAS-A, IS-A and inheritance to work it.  
//		
//		Vehicle.service();
//		Car.service();
//		Train.service();
//		ElectricalCar.service(); 
//		
	 
		
		
		
		Vehicle v1 = new Vehicle(); 
		
			v1.makeAndModel = "Toyota Corolla"; 
			v1.year = 2015; 
			v1.maxSpeed = 120; 
		
			
			
		System.out.println(v1.makeAndModel);
			
			v1.drive();
			v1.stop(); 
			Vehicle.service();
			
		System.out.println(">>>>>>>>> Car Object >>>>>>>>>");
		
		Car c1 = new Car(); 
		
			c1.makeAndModel = "Lexus LX"; 
			c1.hoursePower = 555; 
			c1.millage = 33000; 
			c1.year = 2017; 
			c1.maxSpeed = 180; 
			
			
			
			
		System.out.println(c1.makeAndModel);
		
			c1.doUber();
			c1.drive();
			c1.stop();
			c1.service(); //static and gives you a warning to use class name directly 
			Car.service();//static 
			
		System.out.println(">>>>>>>>> Train Object >>>>>>>>>");
			
		Train t1 = new Train(); 
		
			t1.makeAndModel = "German Train"; 
			t1.year = 2018; 
			t1.millage = 57300; 
			t1.maxSpeed = 240; 
			t1.ticketPrice = 15.99; 
			
			
			
		System.out.println(t1.makeAndModel);
		
			t1.leaveStation();
			t1.drive();
			t1.stop();
		
		System.out.println(">>>>>>>>> Electrical Object >>>>>>>>>");	
			
		ElectricalCar ec = new ElectricalCar(); 
		
			ec.makeAndModel = "Toyota Prius "; 
			ec.millage = 25000; 
			ec.year = 2014; 
			ec.hoursePower = 500; 
			ec.batteryLevelMiles = 300000; 
			ec.hasBattery = true; 
			ElectricalCar.hasBattery = true; //static used the name of class to call the object 
			
		System.out.println(ec.makeAndModel);
		
			ec.doUber(); 
			ec.drive(); 
			ec.stop();
			ec.charge();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
