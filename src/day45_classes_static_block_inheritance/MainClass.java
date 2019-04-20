package day45_classes_static_block_inheritance;

public class MainClass {
	
	public static void main(String[] args) {
		
		ClassWithStaticBlock one = new ClassWithStaticBlock(); 
		ClassWithStaticBlock two = new ClassWithStaticBlock(); 
		ClassWithStaticBlock three = new ClassWithStaticBlock(); 
		
		ClassWithStaticBlock.staticMethod();
		ClassWithStaticBlock.staticMethod();
		
	}

}
