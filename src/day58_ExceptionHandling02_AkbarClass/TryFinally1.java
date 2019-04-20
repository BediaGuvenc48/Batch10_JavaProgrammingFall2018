package day58_ExceptionHandling02_AkbarClass;

public class TryFinally1 {

	public static void main(String[] args) throws Exception {

		System.out.println("program started");

		playWithWater();
		//playWithFire() ;

		System.out.println("program ended");

	}

	public static void playWithWater() throws RuntimeException {

		System.out.println(" playWithWater message ");
		 try {
		throw new RuntimeException("playing with hot water");
		 } catch (Exception e) {
		 System.out.println("GOT YA IN THE METHOD");
		 }
	}

	public static void playWithFire() throws Exception {

		try {
			throw new Exception("playing with hot FIRE");
		} catch (Exception e) {
			System.out.println("AAAAAA");
		}finally {
			System.out.println();
		}
	}
}
