package day50_final_super_abstraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FInvalVariables {
	
	private final String SCHOOL_NAME; //so if you want to do camel case with final, you just use uppercase and add _ between 2 words 
	
	public static final int MAX_NUMBER_OF_STUDENT; 
	
	static {
		
		MAX_NUMBER_OF_STUDENT = 55;  //it is static block, runs one time only 
	}
	
	//EVEN IF YOU USE LOWERCASE WITH WORD FINAL, IT WILL WORK, BUT PERFFERRED TO USE UPPERCASE. 
	
	//The reason for changing the colors, is because we use an instance variable and the eclips is changing the color. You might be able to changed the color in eclips too. 
	
	public static final String FEBRUARY = "February"; 
	
	
	public FInvalVariables() {
		
		SCHOOL_NAME = "Cybertek";  
	}
	
	public static void main(String[] args) {
		
		//int MAX = 100; 
		
		//final MAX = 110; //this will not compile, because you put final word
		
		final int MAX; 
		MAX = 200; 
		
		System.out.println(MAX);
		
		
	final int [] NUMS = new int [] {100, 300, 400}; 
	
		NUMS[0] = 500; 
	
	System.out.println(Arrays.toString(NUMS)); 
	
	//NUMS = new int [2];  -> this will not work 
	
	
	final List<String> RPODUCTS = new ArrayList<>(); 
	
	RPODUCTS.add("water"); 
	RPODUCTS.add("Cookies"); 
	RPODUCTS.add("Coffee"); 
	
	System.out.println(RPODUCTS);
	
	RPODUCTS.remove("Cookies"); 
	System.out.println(RPODUCTS);
	
	//RPODUCTS = new ArrayList<>(); -> This will not work, because again we create a new object that our ArrayList points toward. 
									  //since it is final, then we can not create a new object. 
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
