package day13_stringmanipulation;

public class stringEquality {

	public static void main(String[] args) {
		
		
	String str1 = "abc";
	String str2 = "abc"; 
	
	System.out.println(str1 == str2);
	
	String str3 = new String("abc"); 
	String str4 = "abc"; 
	
	System.out.println(str3 == str4);
		
	//we created differently and this will look at different objects and don't match 
	
	String str5 = new String("abc"); 
	String str6 = new String("abc"); 
	System.out.println(str5 == str6);
		
	//whenever you use the new Keyword, then the equal operators will not work. 
		
	System.out.println(str1.equals(str2));
	System.out.println(str3.equals(str4));
	System.out.println(str5.equals(str6));
		
	}
	
}
