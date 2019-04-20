package day43_classes_static_constructor02;

public class Dinner {
	
	
	public static int pizzaSlices = 8; 
	
	public void takeASlice() {
		
		pizzaSlices--; 
	}
	
	public void takeASlice(int num) {
		
		//pizzaSlices = pizzaSlices - num;  
		pizzaSlices -= num; 
	}
	

}
