package day54_Polymarphism01;

public class AnimalRunner {
	
	 public static void main(String[] args) {
			
			Animal a1 = new Dog(); 
				a1.makeNoise(); 
			
			Animal a2 = new Cat(); 
				a2.makeNoise();
			
			Animal a3 = new Horse(); 
				a3.makeNoise();
			
			Object o1 = new Animal(); //--> this compiles, but will not give you the result  
			
			
			System.out.println(">>>>>>>>> for each loop >>>>>>>>");
			
			Animal [] AnimalArray = new Animal[3]; 
			
			AnimalArray[0] = a1; 
			AnimalArray[1] = a2; 
			AnimalArray[2] = a3; 
			
			for (Animal mix : AnimalArray) {
				mix.makeNoise() ;
			}
		} 

}
