//
//public class MyTest {
//
//	    public static void main(String[] args) {
//	        System.out.println(getword1("aaaabbcccdda"));    
//	    
//	    }
//	    
//	    
//	    public static String getword(String word) {
//	        int count=1;
//	        String ret=""; 
//	        for (int i = 0; i < word.length()-1; i++) {
//	            if(word.charAt(i)==word.charAt(i+1)) {
//	                count++;
//	                continue;
//	            } 
//	                ret=ret+word.charAt(i)+count;
//	            count=1;
//	        }
//	        ret=ret+word.charAt(word.length()-1);
//	        return ret;
//	    }
//	    
//	    public static String getword1(String word) {
//	    	
//	    	int count = 1; 
//	    	String result = ""; 
//	    	
//	    	for (int idx = 0; idx < word.length()-1; idx++) {
//	    		
//	    		if (word.charAt(idx) == word.charAt(idx+1)) {
//	    			count++; 
//	    			continue; 
//	    		}  
//	    			result = result + word.charAt(idx); 
//	    			
//	    			count = 1; 
//	    	}
//	    	
//	    	
//	    	result += word.charAt(idx)+count; 
//	    	return result; 
//	    }
//	}
//
//
