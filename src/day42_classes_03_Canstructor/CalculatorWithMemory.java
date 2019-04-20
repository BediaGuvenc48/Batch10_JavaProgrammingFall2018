package day42_classes_03_Canstructor;

public class CalculatorWithMemory extends Calculator{
	
	  /*a double instance variable, memory, initialized to 0
	    a method, save, that assigns the value of accumulator to memory
	    a method, recall, that assigns the value of memory to accumulator
	    a method, clearMemory, that assigns zero to memory
	    a method, getMemory, that returns the value stored in memory*/ 
	
	
	double memory = 0; 
	
	
	public void save() {
		
		this.memory = super.accumulator;   
	}
	
	public void recall() {
		
		this.memory = super.accumulator;   
	}
	
	public void clearMemory() {
		
		this.memory = 0;   
	}
	
	public double getMemory() {
		
		return this.memory;  
	}
	
	
	

}
