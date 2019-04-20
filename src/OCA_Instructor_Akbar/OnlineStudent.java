package OCA_Instructor_Akbar;



/*
 * Default behaviour of constructors 
 * 
 * 1 , if we dont have any contructor in a class
 * 		compiler will automatically add default consturctor
 * 	   if we have any contructor we dont get one 
 * 
 * 2 , First line of any constructor is a call to super class's 
 * 		no arg contructor by default super() 
 * 		Condition :if super(args) or this(args) not already used  
 * 
 * 
 * */




public class OnlineStudent extends Student{

	public OnlineStudent() {
		
		// super() is used to call parent class's constructor
		
		//super();
		super(512); 
		System.out.println("no arg of Onlinestudent class");
		
	}
	
	public static void main(String[] args) {
		
		OnlineStudent o = new OnlineStudent();
		
	}
	
}