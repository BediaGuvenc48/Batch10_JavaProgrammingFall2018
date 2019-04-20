package day54_Polymarphism01;

public class SlackRunner {
	

	public static void main(String[] args) {
		
		Dog d = new Dog() ; 
		Animal a1 = new Dog(); 
		Pet	 p1 = new Dog() ; 
		//a1.makeNoise();
		
		Animal a2 = new Cat(); 
		//a2.makeNoise();
		
		Animal a3 = new Horse(); 
		//a3.makeNoise();
		
		// Dog is an Object 
		 Object o = new Dog() ; 
		 
		
		
		Animal[] animals = {a1,a2,a3} ;
		
		 for (Animal each : animals) {
			each.makeNoise();
		 }
		
		
		
	}

}
	
	
