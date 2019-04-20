package day45_classes_static_block_inheritance;

public class ClassWithStaticBlock {
	
	static {
		
		System.out.println("This is static Block. I run once at the beginning");
	}
	
	static {
		
		System.out.println("This is static Block. I run once at the beginning");
	}
	
	
	
	public ClassWithStaticBlock() {
		
		System.out.println("This is a Constractor. I run every time object is created");
		
	}
	
	public static void staticMethod() {
		
		System.out.println("This is static method"); 
	}

}
