package day50_final_super_abstraction;

public class ProductTest {
	
	public static void main(String[] args) {
		
		Product p1 = new Product ("Sony Play Station"); 
			System.out.println(p1);
	
			
			Electronics el = new Electronics ("Dyson", 300); 
				System.out.println(el.toString());
			
			el.buy(); 
			
		System.out.println(Product.IS_AVAILLABLE);
		
		System.out.println(Electronics.IS_AVAILLABLE);//static variable can be inheritted 
		
			
	}

}
