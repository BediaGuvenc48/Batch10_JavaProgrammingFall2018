package day45_classes_static_block_inheritance;

public class Practice {
	
	
	static int num1 = 100; 
	int num2 = 200; 
	
	static {
			num1 = num1+5; 
	}	

	{
		num2 = num2 + 10; 
	}	
	
	public Practice() {
		
		num1 += 10; 
		num2 += 10; 
	}
	
	public static void main(String[] args) {
		
		Practice p = new Practice(); 
		System.out.println(p.num2);
		System.out.println(p.num1);
		
		Practice p1 = new Practice(); 
		System.out.println(p1.num2);
		System.out.println(p1.num1);
	}
	
}
