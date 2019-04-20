package day45_classes_static_block_inheritance;

public class DefaultValues {
	
	
    int intValue; 
    byte byteValue; 
	public double doubleValue; 
	public boolean booleanValue; 
	public char charVal; 
	public String stringValue; 
	public Integer integerObject; 
	
	public static void main(String[] args) {
		
		DefaultValues d = new DefaultValues(); 
		
		System.out.println(d.intValue);
		System.out.println(d.doubleValue);
		System.out.println(d.byteValue);
		System.out.println(d.booleanValue);
		System.out.println(d.charVal);
		System.out.println(d.integerObject); 
		System.out.println(d.stringValue);
		
		
	//System.out.println(d.stringValue.toUpperCase()); // It will through an exception as --> java.lang.NullPointerException
	
	System.out.println(d.intValue + 101); // the answer is 101, because the intValue = 0; and you add 101 which will be 101. 
	
	d.stringValue = "Hello World!!!"; 
	System.out.println(d.stringValue.toUpperCase());
	
	
	
	
	}
	
	
	
	
	
	

}
