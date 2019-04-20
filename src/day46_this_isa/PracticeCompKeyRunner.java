package day46_this_isa;

public class PracticeCompKeyRunner {

	public static void main(String[] args) {
		
		Keyboard myKeyboard = new Keyboard(115, "white"); 
		
		myKeyboard.color = "White"; 
		myKeyboard.numberOfKeys = 115; 
			
		
		Computer laptop = new Computer(); 
		
		laptop.type = "Mackbook"; 
		laptop.year = 2018; 
		laptop.keyboard = myKeyboard; 
		
		
		 System.out.println(laptop.type);
		 System.out.println(laptop.keyboard.color);
		 
		 
		 Computer com = new Computer(); 
		 com.type = "Desktop"; 
		 com.year = 2010; 
		 com.keyboard = myKeyboard; 
		 
		  
		 System.out.println();
		 
		 //System is a class 
		 //out is a static variable which is accessed by the class 
		 //println is a method that that belong to out static variable and print to the console. 
	 
		
		
		
	}
	
}
