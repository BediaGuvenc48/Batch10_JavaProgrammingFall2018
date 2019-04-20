

public class MyException extends RuntimeException{
	
	public MyException() {
		
		System.out.println("The word love does not mean anything to me at this point !!!");
		
	}
	
	public MyException(String m) {
		System.out.println(m);
	}
	

}
