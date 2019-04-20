package day54_Polymarphism01;



public class Child extends ParentClass {
	
	
	public static void main(String[] args) {
	
		//upcasting
		long a = (long) 10; 
		
		//downcasting --> puting larger object into smaller object 
		int b =(int) a;  
		
		
		ParentClass p = new Child(); 
		// --> in fact it happens like this; 	Parent p = new (Parent) new Child(); 
		
		Child p2 = new Child(); // We can access Child p2, Parent p2, Object p2
		
	}
	
}



class Parent {
	


}
