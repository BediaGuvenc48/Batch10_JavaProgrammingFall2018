package day38_wrapperClasses_Stringbuilders;

import java.util.*; 

public class AutoBoxingVsUnBoxing {
	
	public static void main(String[] args) {
		
		/*
		 * Auto Boxing: take primitive and convert into Wrapper class object 
		 */
		
		int i = 1000; 
		Integer j = i; 
		
		System.out.println(j);
		
		Double d = (double) 34.2; //the number 34.2 is primitive, it is converted as Auto Boxing and assigned in Double d 
		
		Double d1 = 55.55; 
		
		double d3 = 55.55; 
		
		boolean b = true; 
		Boolean b2 = b; //Auto-Boxing example 
		
		List<Integer> nums = new ArrayList<>(); 
		nums.add(433); 
		nums.add(55); 
		
		int p = 555; 
		nums.add(p); 
		nums.add(new Integer(77)); 
		
		System.out.println(nums);
		
		//UNBoxing ==> taking the Wrapper Class object and converting into primitives automatically. 
		
		int r = nums.get(0); 
		
		Boolean bool = new Boolean(false); 
		boolean boolPrim = bool; 
		System.out.println(boolPrim);
		
		Character chObj = '^'; //this is taking a primitive and converting it to an Wrapper Class Object. 
		char myChar = '#'; 
		Character chObj2 = myChar; //This is Auto Boxing happened from char => Character 
		

		char chPrim = chObj; //UN-Boxing from Character object => char primitive 
		
		Character char3 = new Character('_'); //no Boxing, just create Character object 
		
		char ch7 = char3; //take char3 Character object and UN-Box to char primitive and assign to ch7. 
		
		Integer intValue = new Integer(400); 
		
		if(intValue == 400) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		System.out.println(">>>>>>>>>>>>>>>Test >>>>>>>>>>>>>>>");
		
		//Auto-Boxing examples: 
		
		int n = 500; 
		Integer rc = n; 
		System.out.println(rc);
		
		ArrayList <Double> dc = new ArrayList<>(); 
			dc.add(9.99); 
			dc.add(5.99); 
			
		double dr = 60.99; 
		
			dc.add(dr); 
		
		System.out.println(dc);
		
		//Un-Boxing
		
		double unBox = dc.get(1); 
		System.out.println(unBox);
	}

}
