package day40_customclasses;

public class CellPhoneFactory {
	
	public static void main(String[] args) {
	
		//Create an object from CellPhone class 
		CellPhone phone1 = new CellPhone();
		
		phone1.brand = "Apple iPhone iPhone XS"; 
		phone1.color = "Piano Black"; 
		phone1.price = 999.0; 
		
		phone1.call(); 
		phone1.text();
		
		//Created 2 cell phone objects 
		CellPhone phone2 = new CellPhone(); 
		CellPhone phone3 = new CellPhone(); 
		//assigning value to object variables 
		phone2.brand = "Ericson 1018"; 
		phone2.color = "Silver"; 
		phone2.price = 30.5; 
		
		phone2.call();
		phone3.text();
		
		phone3.brand = "HTC"; 
		phone3.color = "Black"; 
		phone3.price = 300.55; 
	
		System.out.println("Phone1 brand - " +phone1.brand);
		System.out.println("Phone2 brand - " + phone2.brand);
		System.out.println("Phone3 brand - " + phone3.brand);
		
		/*
		 * calculate all the prices of the phones 
		 */
		
		double totalPrice = phone1.price + phone2.price + phone3.price; 
		System.out.println("Prices of all phones are: " + totalPrice  );
		
		/*
		 * Can we update object Values? Yes we can 
		 */
		
		phone1.price = 1200.0; 
		phone2.price = phone3.price; 
		
		System.out.println(phone1.price);
		System.out.println(phone3.price);
		System.out.println(phone2.price);
		
		
		
		
		
		
		
	}

}
