package day24_LoopsAndArrays;

import java.util.Arrays;

public class printArrayValues {

public static void main(String[] args) {
	
	
	
	int [] arrNum = new int [5]; 
		
		arrNum[0] = 1; 
		arrNum[1] = 2; 
		arrNum[1] = 100; 
		
	int [] arrNum1 = {1,2,3,4,6,6,6,6,7,7,7}; 
	
	
	
	
	//create an array cars and directly assign following values: 
	//Audi, Porsche, BMW, Toyota, Honda, Tesla, Dodge, Kia, Acura, Fiat
	
	/*String [] cars = new String [] {"Audi", "Porsche", "BMW", "Toyota", "Honda", "Tesla"
	                             , "Dodge", "Kia", "Acura", "Fiat", "Nissan", "Jeep"}; 
	
	int i = 0; 
	
	System.out.println(cars[i]);
	i++; 
	System.out.println(i);
	
	for (int idx = 0; idx < cars.length; idx++) {
	
	System.out.print(cars[idx] + ", "); 
	
	}
	
	System.out.println( "\n" + " ------- FOR LOOP ---------" );
	
	//print all values using a for Each loop 
	
	for (String car : cars ) {
		System.out.print(car + ", ");
	}
	
	String[] cars1 = new String [] {"Jeep", "Land-Cruiser"};
	
//	int idx = 0; 
//	System.out.println(idx);
//	
//	System.out.println(cars1[0]);
//	idx++; 
//	System.out.println(cars1[idx]);
	
	
	for (int idx1 = 0; idx1 <= cars1.length; idx1++) {
		
		System.out.println(idx1);
	}*/
	
	
	String [] str = {"Audi", "Porsche", "BMW", "Toyota", "Honda", "Tesla"
            			, "Dodge", "Kia", "Acura", "Fiat", "Nissan", "Jeep"}; 
	
	System.out.println(Arrays.toString(str));
	
	for (String car : str) {
		
		System.out.print(car + " / ");
	}
	
	System.out.println("000000000000");
	for (int idx = 0; idx < str.length; idx++) {
		
		System.out.print(str[idx] + ", ");
	}
	
	
	
	
	
	
}	
	
}
