package Casting;

public class Engineer extends Person {
	
	String traingingID; 
	
	public Engineer(String name, int age, String trainingID) {
		
		super(name, age); 
		this.traingingID = trainingID; 
		
	}
	
	public String getTrainingID() {
		return traingingID; 
	}
	
	
	public void design(String sketch) {
		
	}

	@Override
	public String toString() {
		return "Engineer [traingingID=" + traingingID + "]";
	}
	
	
	
}
