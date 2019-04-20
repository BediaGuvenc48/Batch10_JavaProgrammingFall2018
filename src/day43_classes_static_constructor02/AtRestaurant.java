package day43_classes_static_constructor02;

public class AtRestaurant {
	
	
	public static void main(String[] args) {
		
		Dinner Dad = new Dinner(); 
		Dinner Mom = new Dinner(); 
		Dinner Kid = new Dinner(); 
		
		System.out.println(" Pizza slices: " + Dad.pizzaSlices);
		
		Dad.takeASlice(2);
		Kid.takeASlice(3);
		Mom.takeASlice(); //the method is decrementing by 1 which is takeASlice(){ pizaaSlices--;}
		
		System.out.println(" Pizza slices: " + Mom.pizzaSlices);
		Kid.takeASlice();
		
		System.out.println(Kid.pizzaSlices);
	}

}
