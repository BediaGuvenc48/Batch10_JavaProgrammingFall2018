package day45_classes_static_block_inheritance;

public class Blocks {
	
	static int num = 100; 
	static String str; 
	
	static {
		
		System.out.println("Static Block");
		num = num + 1000; 
		
		str = "Hello"; 
	}
	
	{
		System.out.println("Init Block");
		num = num + 500; 
		
		str = str + " world";  
		
	}
	
	public Blocks () {
		System.out.println("Constructor");
		num = num * 2; 
		str = str + "!!!";  
	}

//	
//	
//	
//	
//	static {
//		System.out.println("This is static block, only runs one time"); 
//		
//		num = num - 5; 
//		
//		str = "Hello World!!!"; 
//	}
//	
//	
//	{
//		
//		System.out.println("This is an initializer block or init block, it runs whenver an object is created");
//		
//		str = "Init Block is running only once"; 
//		
//	}
//	
//	
//	public Blocks(int num) {
//		
//		System.out.println("This is the Constructor with 1 Arg and it runs ");
//	}
	
	
}
