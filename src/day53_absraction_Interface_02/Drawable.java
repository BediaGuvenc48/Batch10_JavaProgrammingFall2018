package day53_absraction_Interface_02;

public interface Drawable {
	
	/*Task2:
		- Create an interface called Drawable 
		- with constant COLOR 
		- and abstract method draw() return nothing 
		- another abstract method drawLine, have one parameter direction : String 

		- Let the rectangle class implements this interface 
		*/
	
	
	public static final String COLOR = "BROWN"; 
	
	public abstract void draw(); 
	
	public abstract void drawLine(String direction); 
	
	
	
	
}


	
	
//	public static final String COLOR = "BROWN"; 
//	
//    void draw(); 
//	
//	public abstract void drawLine(String direction); 
//	
//	
//	public default void drawSquare() {
//		System.out.println("I will wait for your implenentation");
//	}
//	
//	public static void doStaticStuff() {
//		System.out.println("It is Static Method");
//	}
	
//}
