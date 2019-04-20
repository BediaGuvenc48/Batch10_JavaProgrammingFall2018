package OCA_Instructor_Akbar;

public class Thanksgiven {
	
	int number; 
	
	public static void main(String[] args) {
		
		int j = 10; 
		
			//reference variable, it doesn't hold the object directly, but it just keep the reference or address of it to the heap. 
		Thanksgiven t = new Thanksgiven(); 
		
		System.out.println(t.number); // if we 
		
		System.out.println(  new Thanksgiven().number   ); // this is just address of the num at the heap not the actual object. 
						//primitive variables hold the object rigth there, but reference object just keep the address of variable 
		
	}

}
