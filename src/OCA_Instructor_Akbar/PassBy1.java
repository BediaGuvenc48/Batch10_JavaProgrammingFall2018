package OCA_Instructor_Akbar;

public class PassBy1 {



	// when you pass a variable argument to a method ,
	// you are only passing the copy of that variable. 
	
	public static void main(String[] args) {

//		int k = 10 ; 
//		printInt(k);
//		
//		System.out.println(k);
		StringBuilder sb1 = new StringBuilder("original"); 
		doSomething(sb1);
		System.out.println(sb1);
		
	}

	public static void doSomething(StringBuilder sb) {
		
		sb.append("abc") ; 
		System.out.println(sb);
	}

	public static void doSomething2(StringBuilder sb) {
		
		sb = new StringBuilder("original"); 
		sb.append("abc") ; 
		System.out.println(sb);
	}
	
	public static void printInt(int i) {
		
		i = i + 5 ; 
		System.out.println("the i value inside method " + i);
		
	}
	

}



