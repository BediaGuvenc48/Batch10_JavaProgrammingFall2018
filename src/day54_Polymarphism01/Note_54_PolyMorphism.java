package day54_Polymarphism01;

public class Note_54_PolyMorphism {
	
/*
 
 Polymorphism: 
 
 -> A reference of Parent class, interface type can refer to object of any sub class. 
 
 	Animal -> Cat 
 		   -> Dog 
 	
 	Animal a; -> this is just a reference and the object can be :
 	Animal a = new Cat(), or new Dog(); 
 
 
 
 -> Many Forms: 
 
 -> Polymorphism is the ability of an object to take on many forms. 
 
 -> If there is no IS-A relationship, then there is no polymorphism. If there is IS-A relationship, then pholymorphism exist and you can 
 	take the advantage. 
 
 
 		Animal: 	
 	Dog 			Horse 			Cat 
 	
 	Animal a1 = new Dog(); 
 	Animal a2 = new Horse(); 
 	Animal a3 = new Cat(); 
 	
 	so the difference between		 Animal a1 = new Dog();   & 	Dog d = new Dog(); 
 	
 	The first one -->  Animal a1 = new Dog();, can be referred for any Animal, but the ---> Dog d = new Dog();, it is referred 
 	to the Dog Animal only. The reference point of object is focused only for the Dog object. 
 	
 	Reference point: 
 	
 	Shape s1 = new Triangle(); 
 	
 	Reference --> Object, to the left is Reference type, to the right after the keyword new, it is the Object type. 
 	
 	
 	Note: 
 	- Only Reference type decide what you can access 
 	- Using that reference variable 
 	
 
 		//upcasting
		long a = (long) 10; 
		
		//downcasting --> puting larger object into smaller object 
		int b =(int) a;  
		
		
		Parent p = new Child(); 
		// --> in fact it happens like this; 	Parent p = new (Parent) new Child(); 
		
		Child p2 = new Child(); // We can access Child p2, Parent p2, Object p2
	
		ONLY REFERENCE DECIDE WHAT TO CALL or What Method to call. 
		
		
		
		
 
 
 
 
 
 
 
 
 
 
 
 */
	
}
