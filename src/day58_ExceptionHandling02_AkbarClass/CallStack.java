package day58_ExceptionHandling02_AkbarClass;

public class CallStack {
	
	
	public static void main(String[] args) {
		
		callJohn(); 
	}
	
	
	public static void callJohn() {
		System.out.println(" Starting method callJohn() ");
		callHalil();
		System.out.println(" end of CallJohn() ");
		
	}
	
	public static void callHalil() {
		System.out.println(" method call Halil() "); 
		
		try {
			throw new RuntimeException(" Halil is too busy");
			
		}catch (Exception e) {
			System.out.println(" WE GOT HALIL");
		}
	}

	public static void callEnnes() {
		System.out.println(" method call Ennes() ");
		
	}
}
