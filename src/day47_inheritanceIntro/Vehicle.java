package day47_inheritanceIntro;


	public class Vehicle{
		
		
		public String makeAndModel; 
		public int year; 
		public int maxSpeed; 
		int millage; 
			
			public void drive() {
				
				System.out.println("Driving");
			}
			
			public void stop () {
				
				System.out.println("Stopping");
			}
	
			public static void service() {
				
				System.out.println("My car is in service shop now"); 
			}
			
			
		}
	
	
	


