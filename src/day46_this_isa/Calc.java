package day46_this_isa;

public class Calc {

	private int result; 
	
	public Calc plus(int num) {
		
		result += num;
		return this; 
		
	}
	
	public Calc minus(int num) {
		
		result -= num; 
		return this; //this keyword here is different, it means current object which is c in our main method or CalcTest
		
	}
	
	public int getResult() {
		
		return result; 
	}
	
	
	
}
