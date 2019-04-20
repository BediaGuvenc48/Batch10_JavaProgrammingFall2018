package day46_this_isa;

public class PracticeThis {
	
	private int number; 
	
	public PracticeThis plus(int num) {
		
		number += num; 
		return this; 
	}
	
	public PracticeThis minus(int num) {
			
			number -= num; 
			return this; 
	}
	
	public int getnumber() {
		return number;  
	}

}
