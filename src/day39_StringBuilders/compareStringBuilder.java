package day39_StringBuilders;

public class compareStringBuilder {
	
	public static void main(String[] args) {
		
	StringBuilder builder1 = new StringBuilder("java"); 
	StringBuilder builder2 = new StringBuilder("java"); 
	
	System.out.println(builder1.toString().equals(builder2.toString())); 
	
	System.out.println(builder1 == builder2);//false. Since both objects are different locations 

	System.out.println(builder1.equals(builder2));//false again. equals method in StringBuilder also checks if both of them are same memory location 
	
	/* How should we compare the StringBuilders? 
	  	- We need to convert it to String, then call String's equal method. 
	  	
	  	- builder1.toString().equals(builder2.toSTring()); 
	 */
	
		boolean isEqual = builder1.toString().equals(builder2.toString()); 
		System.out.println(isEqual);
		
		StringBuilder builder3 = builder1; // they point to the same memory space and the result is true. 
		System.out.println(builder3 == builder1);
		System.out.println(builder3.equals(builder1));
		System.out.println(builder1);
		System.out.println(builder3);
		
		builder3.append(" programming"); 
		System.out.println(builder3);
		System.out.println(builder1);
		
		StringBuilder builder4 = new StringBuilder(builder1); 
		System.out.println(builder4);
		
		System.out.println(builder1.append("!!!"));
		System.out.println(builder4);
		
		
		
		
	}

}

