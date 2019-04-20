package day45_classes_static_block_inheritance;

public class ClassWithInitializerBlock {
	
	public static void main(String[] args) {
		
		
		//ClassWithInitializerBlock obj = new ClassWithInitializerBlock(); 
		
			//obj.staticMethod();
			
			ClassWithInitializerBlock.staticMethod(); 
	}
	
	
	
	{
		
		System.out.println("This is Initiliazer Block, I run every Automatically every time object is created, I run before Constructor");
	}
	
	static {
		
		System.out.println("Static Block, I run once before Init Block & Constractor. But once only");
	}

	public ClassWithInitializerBlock() {
		
		System.out.println("This is Constructor, I run every Automatically every time object is created");

	}
	
	public static void staticMethod() {
		
		System.out.println("This is Static Method"); 
	}
	
}
