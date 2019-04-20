package day58_ExceptionHandling02_AkbarClass;

public class TryFinally {


	

	public static void main(String[] args) {

		System.out.println("program started");
		
//		try {
//			playWithWater() ;
//		} catch (RuntimeException e) {
//			System.out.println("got ya");
//		}
		
		// playWithFire() ; 
		System.out.println("program ended");
		
	}
	
	public static void playWithFire() throws Exception {
		
		try {
			throw new Exception("playing with hot FIRE");
		} catch (Exception e) {
			System.out.println("GOT YA IN THE METHOD");
		}
	}

	public static void playWithWater() throws RuntimeException {
		
		System.out.println(  " playWithWater message " );
		try {
			throw new RuntimeException("playing with hot water");
		} catch (Exception e) {
			System.out.println("GOT YA IN THE METHOD");
		}
		
		
	}

}