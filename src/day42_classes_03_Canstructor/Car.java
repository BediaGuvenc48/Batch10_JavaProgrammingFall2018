package day42_classes_03_Canstructor;

public class Car {
	
	/*
	 
	 Encapsulated Instance variables; 
	 
	 	String type; 
	 	String make; 
	 	String model; 
	 	int speed; 
	 	
	 	Add Getter & Setter methods 
	 	
	 		Method: 
	 			void accellerate (int mph)
	 			increateses, current speed value by mph value 
	 			prints make type is accerating 
	 			
	 		Example: 
	 			accellerate(10); ==> speed += 10; 
	 
	 */
	
	private String type; 
 	private String make; 
 	private String model; 
 	private int speed;
 	
 	public Car () {
 		
 		type = "unknown"; 
 		make = "unknown"; 
 		model = "unknown"; 
 			
 	}
 	
 	private void carWash() {
 		System.out.println("Washing my car !!! ");
 	}
 	
 	public Car(String type, String make, String model) {
 		
 		System.out.println("3 args constructor");
 		
 		this.type = type; 
 		this.make = make; 
 		this.model = model; 
 		
 	}
 	
 
	
 	public void accelerate(int mph) {
 		
 		speed+= mph; 
 		System.out.println(make + " " + type + " is accelerating. ");
 	}
 	
 	
 	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	} 
 
//	
//	public static void main(String[] args) {
//		
//		Car car = new Car(); 
//		
//		car.carWash();
//	}
	

}
