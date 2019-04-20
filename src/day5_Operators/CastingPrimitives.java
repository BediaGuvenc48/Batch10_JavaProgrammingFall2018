package day5_Operators;

public class CastingPrimitives {
	
	public static void main (String [] args) {
		
//		int i = 100;
//		byte b = (byte)i; 
		
		double price = 12.5; 
		int price2 = (int)price;
		
		System.out.println(price2);
		
		//implicit casting examples; 
		int count = 45566; 
		double doubleCount = count; 
		
		System.out.println(doubleCount);
		
//		byte byteValue = 127; 
//		int intValue = byteValue;
		
		//explicity casting examples; 
		int students = 70; 
		byte byteStudents = (byte)students; 
		
		System.out.println(byteStudents);
		
		// int --> byte var 
		double priceOfSmth = 5353.22; 
//		int intPrice = (int)priceOfSmth; 
		System.out.println(priceOfSmth);
		
		int large = 35353535; 
		byte small = (byte)large; 
		
		System.out.println(small); 
		
		int large1 = 34; 
		byte small1 = (byte)large1; 
		System.out.println(small1); 
		
		String numStr = "2345"; //234552
		System.out.println(numStr + 5 + 2);
		//"2345" + 5 --> "23455" + 2 = "234552"
		
		System.out.println("2345" + (5+2)); 
		
		System.out.println(5 / 2.0);
		int x = (int) (5 / 2.0); 
		
		System.out.println(x);
		
		
		
		
	}

}
