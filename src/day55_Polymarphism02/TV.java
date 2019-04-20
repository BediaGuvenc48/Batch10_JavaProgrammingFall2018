package day55_Polymarphism02;

import java.util.*; 
import java.util.ArrayList;

public class TV {
	
	public static void main(String[] args) {
		
		TV t = new TV(); 
		
		System.out.println(t); // you will get just @code 
		
		//the super class of TV is an object, we have never overriden the Object method. 
		
		// the hashcode which is day55_Polymarphism02.TV@33909752 is coming from the following method 
		
		System.out.println(t.toString());//the toString method is coming from Object and we can override it like this: 
		
		//After Overriding the toString method, you will see the following message: 	TV TOstRING METHOD 
		
		int [] arr = {1,2,3}; 
		System.out.println(arr);
		
		List<Integer> lst = new ArrayList<>();
			lst.add(1); 
			lst.add(2); 
			lst.add(3); 
		
		//IF YOU PRINT OBJECT DIRECTLY 
		//IT WILL AUTOMATICALLY CALL toString mentioned 
		
		System.out.println(lst.toString()); //it is important you get the 
		
	}
	
	@Override 
	public String toString() {
		
		return "TV TOstRING METHOD"; 
	}
	
}
