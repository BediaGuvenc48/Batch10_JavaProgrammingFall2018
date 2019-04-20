package day38_wrapperClasses_Stringbuilders;

public class Notes38 {
	
	/*
	 
Difference between Arrays & ArraysList: 
			
				Arrays 													ArraysList:  
	 
 	Arrays are fixed size (size can't be changed). 	|	ArrayList are resizable & size of elements can be modified    		
 	int[] = new int [5]; the size is 5 			   	|   It can be increased and decreased
 	and will not be modified or changed. 		   	|	ArrayList<Integer> nums = new ArrayList<>(); 
 												   	|	nums.add(200); 
 	Arrays can accept both primitive & objects	   	|	nums.add(43); // keep adding, Size will increase 
 	Example: 									   	|
 											       	|	nums.remove(0); //remove to decrease the size 
	double[] d = {23.54, 23.1}; 				   	|
	String [] s = {"one", "two"};  				   	|	ArrayLists only accepts Objects, We will need to use Wrapper classes to 
												   	|	to add primitive types 
	Arrays can be multi dimensional 			   	|	Example: 
	String [][[][] data = new String[5][3][2]; 	   	|	ArrayList<Double> nums = new ArrayList<>();  
	String [][] matrix = new String [5] [2]; 	   	|	ArrayList<String> strs = new ArrayList<>();
												   	|	
	Arrays are built into coroe Java				|	ArrayList cannot be multi dimensional. 
													|	
	Arrays use different syntax:					|
													|
	int [] nums = {12, 34, 5}; 						|	But, there is a workaround to write like this, but it is not multi dimensional 
	print(nums[1]) => it prints 34;					|	ArrayList<ArrayList<String>>data; //this is a list of lists. but we don't call 
													|	it multiD array list 
													|	ArrayList<String> data = new ArrayList<>();  
													|	ArrayList list of String Arrays. 
													|	
													|	ArrayList is a part of Collection framework and it is a type of list interface. 
													|	ArraysList need to be imported from java.util Package. 
													|	
													|	ArrayList<Integer> nums = new ArrayList<>(); 
													|	nums.add(200); 
													|	nums.add(100); 
													|	
|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||													|	
												
	Wrapper Classes: 
	- Byte, Short, Integer, Long, Float, Double
	- Character, Boolean 
	
	Byte 
	
	Integer.parseInt("5") => 5 which is primitive 'int'. 
	
	Integer.valueOf("5") => 5 which is 'Integer' Object with valueOf. 
	
	Auto-Boxing And UN-Boxing: 
	
	with Wrapper classes and primitives 
	
	int n = 100; 
	
	Integer n2 = n; //the value of n2 is also 100, because it is assigned as equal to n. 
	- when we put a primitive and put it into non-primitive or object value, it is Auto_Boxing 
	- primitive value is assigned to Integer wrapper variable n2. 
	- It is converting the primitive into Integer Object. The process is called AUTO-BOXING. 
	- Even if we put non-primitive into primitive value, again it is AUTO-BOXKING. 
	
	Example: 
	Integer i = new Integer(5); // it takes the elements internally and put it into i which is not Auto-Boxing.  
	
	double d1 = 5.2; 
	Double d2 = d1; 
	- The example above is is also Auto-Boxing, because it converts the primitive double  
	  and put it in to object (non-primitive Double type).
	  
	- if we convert Primitive to Object (Any Wrapper Class Type) 
	
	- Wrapper Class Object ==> UNBOXING 
	
		Example: 
		Double d5 = new Double (345.2); 
		double d6 = d5. 
		
		Note: We can not compare primitive with object, so we need to first change it to or 
		convert it to Wrapper Class Object and then compare them. Un-Boxing happens. 
		
	Wrapper Class Definition: 
		-> Wrapper is a class that wraps the functionality of another class or component or another
		   primitive without using of the interhitance. 
		 
 
	 
	 */

}
