package Practice;

import java.util.*;
public class UniqueInteger {
	
	public static void main(String[] args) {
		
		
		int[] test = {3 , 5, 3, 4, 5, 6};


	    List temp = new ArrayList<> (); 

	    for (int i = 0; i < test.length; i++) {
	        for(int k = 0; k<test.length;k++){
	            if(test[i]==test[k] && i!=k) {
	                continue;
	            }else  if(test[i]!=test[k] && !temp.contains ( test[i] )){
	                    temp.add ( test[i] );
	                }
	            }


	        }
	        System.out.println (temp);
	    }

}
