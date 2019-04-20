package day27_Arrays04;

import java.util.Arrays;

public class ArraysCopyValuesTeacherMethod {

	    public static void main(String[] args) {
	    	
	    	/*Given a String array arr with the following elements
	    	["zero", "one", "two","three","four"]
	    	Create another array fewValues and copy words that have letter "e" in them
	    	You need to know how many element contain "e" and create array accordingly
	    	Values in fewValues array need to be["zero", "one","three"]*/
	    	
	    	String [] arr = {"zero", "one", "two","three","four"}; 
	    	
	    	int count = 0; 
	    	
	    	for (int idx = 0; idx < arr.length; idx++) {
	    		
	    		if (arr[idx].contains("e")) {
	    			count++; 
	    		}
	    	}
	    	
	    	String [] eContains = new String [count]; 
	    	
	    	for (int idx = 0; idx < eContains.length; idx++) {
	    		
	    		if (arr[idx].contains("e")) {
	    			eContains[count] = arr[idx]; 
	    		}
	    	}
	    		System.out.println(Arrays.toString(eContains));
	    	
	   	
	
	    	String [] arr1 = {"zero", "one", "two","three","four","keys"};
	    	
	    	int count1 = 0; 
	    	
	    	for (int idx = 0; idx < arr.length; idx++) {
	    		
	    		if (arr[idx].contains("e")) {
	    			count++;
	    		}
	    	}
	    	
	    	System.out.println(count);
	    	String [] temp = new String [count]; 
	    	
	    	for (int i = 0; i < arr.length; i++) {
	    		
	    		if (arr[i].contains("e")) {
	    			temp[count] = arr[i]; 
	    			count++;
	    		}
	    		
			}
	    	
	    	for (int i = 0; i < temp.length; i++) {
	    		
	    		System.out.print(temp[i] + " ");
				
			}
////	    	   	
   	
//	    	int counter = 0;     
//	    	for (int idx = 0; idx < arr.length; idx++) {		
//	    		if (arr[idx].contains("e")) {
//	    			
//	    			counter++; 	 
//	    		}
//	    	}
//	    	
//	    	int count = 0; 
//	    	System.out.println("Counter: " + counter);
//	    	
//	    	String [] temp = new String [counter];   
//	    	
//	    	for (int idx = 0; idx < arr.length; idx++) { // [null, null, null, null]
//	    	
//	    		if (arr[idx].contains("e")) {
//	    			
//	    			temp[count] = arr[idx]; 
//	    			
//	    			count++;
//	    			 
//	    		}
//	    		
//	    		
//	    	}
//	    	 
//	    	
//	    	for (String t : temp) {
//	    		System.out.print(t + " ");
//	    	}
//	    	
//	    	
	    	
	    	
	    	
	    	
	    	
//	       
//	        int co = 0; 
//	        
//	        for (int idx = 0; idx < arr.length; idx++) {
//	        	
//	        	if (arr[idx].contains("e")) {
//	        		co++;
//	        	}
//	        }
//	        	System.out.println(co);
//	        
//	        	String [] result = new String [co]; 
//	        	
//	        	int num = 0; 
//	        	
//	        	for (String res : arr) {
//	        		
//	        		if (res.contains("e")) {
//	        			
//	        			result[num] = res;
//	        			num++; 
//	        		}
//	        	}
//	        	
//	        	for (String a : result) {
//	        		System.out.print(a + ", ");
//	        	}
//	        		 
//	        System.out.println("\n++++++++++++++++++++++++++++++=");
//	       
//	        
//	        //count how many words have 'e' in the arr
//	        int counter = 0;
//	        for(String str : arr) {
//	            
//	            if(str.contains("e")) {
//	                counter++;
//	            }
//	        }
//	        
//	        System.out.println(counter);
//	        //create array fewValues, with size of counter
//	        String[] fewValues = new String[counter];
//	        
//	        //go over arr one more time and add the words with 'e' into fewValues
//	        int i = 0;
//	        
//	        for(String each : arr) {
//	            if(each.contains("e")) {
//	                fewValues[i] = each;
//	                i++;
//	            }
//	        }
//	        
//	        for( String val : fewValues) {
//	            System.out.print(val + " ");
//	            
//	        }
//	  
//	        System.out.println("\n--------------------------For Loop Option---------------");
	        
	        
	        
	        
	    }
	}



