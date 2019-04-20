package day58_ExceptionHandling02_AkbarClass;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OfficeHours {
	
	
	public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<>();
        numbs.add(8);
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        List<Integer> numbs2 = new ArrayList<>();
        numbs2.addAll(numbs);
        Collections.sort(numbs);
        System.out.println(numbs);
        System.out.println(numbs2);
        for(int i=0; i<numbs.size();i++) {
            if(numbs.get(i)!=numbs2.get(i)){
            	try {
            		throw new IllegalArgumentException("List is not sorted!");
            	} catch (Exception e) {
            		
            		System.out.println("Exception was cought !!!");
            	} finally {
            		System.out.println("It is running as Finally Block !!!");
            	}
                break; 
            }
        }
        
    }
	
}
