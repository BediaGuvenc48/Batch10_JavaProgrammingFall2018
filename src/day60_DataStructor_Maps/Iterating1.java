package day60_DataStructor_Maps;

import java.util.List;
import java.util.ArrayList;

public class Iterating1 {

		public static void main(String[] args) {
			
			
			List<Integer> lst = new ArrayList<>(); 
				lst.add(12) ;
				lst.add(15) ;
				lst.add(20) ;
			

			System.out.println();	
			System.out.println(lst);
//			
			for (Integer each : lst) {
				each = 10 ;
				System.out.print(each + " ");			
			}
			
			System.out.println("FOR EACH LOOP " + lst);
			
			for (int i = 0; i < lst.size(); i++) {
				
				Integer each = lst.get(i) ; 
				each = 10 ; 
				System.out.println(each);
				
			}
			System.out.println("FOR LOOP EQUIVILANCE : " + lst);
			
			for (int i = 0; i < lst.size(); i++) {
				
				lst.set(i, 10) ; 
				System.out.println( lst.get(i));
				
			}
			System.out.println(lst);
		
		
		}

	}



