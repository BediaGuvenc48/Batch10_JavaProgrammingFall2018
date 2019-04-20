package day50_final_super_abstraction;

public class JavaHomeWork extends HomeWork{
	
	public JavaHomeWork () {
		
		super("Java Rippl"); 
		
		
	}
	
	static {
		
		System.out.println("This is static block from sub-class !!!");
	}
	

	{
		System.out.println("This is intializer block from sub-class");
	}

	
	
	
	
	
}
