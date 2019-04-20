package day12_classObject_Strings;

public class Direction {

	
	public static void main(String[] args) {
		
		//Ask from where to where 
		//And based on that give directions. 
		//A,a,B,b,C,c,D,d are only valid points 
		//char startingPoint, destination 
		
	char start, end; 
	
	start = 'B'; 
	end = 'D'; 
	//check if all valid 
	
	if (!(start >= 'A' && start <= 'D' && end >= 'A' && end <= 'D')){
		
		System.out.println( "Invalid start or end"); 
	
	}else if (start == end) {
		System.out.println("Already there");
		
	}else if (start == 'A') {
		if (end == 'B') {
			System.out.println("Go right");
		}else if (end == 'C') {
			System.out.println("Go right & Go down");
			
		}else if (end == 'D') {
			System.out.println("Go right, Go down & and Go left"); 
		}
	}else if (start == 'B') {
		
		if (end == 'A') {
			System.out.println("Go down, go left & Go up");
		} else if (end == 'B') {
			System.out.println("You are already in B point");
		} else if (end == 'C') {
			System.out.println("Go Down");
		} else if (end == 'D') {
			System.out.println("Go Down & Go left");
		}
		
	}else if (start == 'C') {
		if (end == 'A') {
			System.out.println("Go left & Go up");
		} else if (end == 'B') {
			System.out.println("Go left, Go up & Go right");
		} else if (end == 'C') {
			System.out.println("You are already in C point");
		} else if (end == 'D') {
			System.out.println("Go left");
		}
	}
		 
		
		
		
	}
	
	
	
	
	
	
}
