package day43_classes_static_constructor02;

public class Notes_Static {
	
	
/*
 
- Static Keyword 
- Examples with Custom classes/objects 

Constructor definition: 
	- runs automically whenever we create object of the lcass. 
	- Same name as ClassName and no return type. 
	- We can overload the constructor by changing the signature/parameters. 
	- If programmer does not add constructor into class, then compiler will add one: default-no args-contrucotr. 
	
	- It can be used to assign default values to variables or assign specific values to variables. 
	

Static Keyword: 

- Static is a keyword, it is a non-access modifier. 
	4 things can be static in Java: 
	
	1) - methods can be static
	2) - variables can be static 
	3) - static blocks 
	4) - static inner class 
	
	public static void Albert(){
	
	}
	
	int num = 0; 
	static int num = 0; 
	
	static {
	
	
	}
	
	{
	
	
	}
	
	
- for our Java programming, we write a lot of methods using Static Variables. 

- Static Keyword: Static in one word means some methods or variable belongs to the class itself and not the object of the class. 
  For Example: 
  public class Campus{
  
  	String city; 
  }
  
 - 	If we have a method that doesn't have static word on it, then we need to create an object before accessing our class. But, if 
 	if we use the keyword STATIC, then you can directly access the class without creating an object. 
 	
 	Example: 
 	
 	public class Campus{
  
  	String city;
  	
     }
 
 if you say Campus.city // will not work, because you need to create the object first like this: 	
 
 	Campus c1 = new Campus(); 
 		c1.city() // now we can access it by creating the object. 
 		
 if we use the static keyword like this: 
 
 
 public static void ShowLocation{
  
  	String city;
  	
     }
     
     ShowLocation.city() // will work, because we used the keyword static and it doesn't depend on the object. 
 
 Memo: 
 - 	Whenever we add any static variable or method into a class, it means those belong to the class direclty and 
 	can be used/accessed/called by using Class name only. No need to create object. 
 	
 - Static can be access either using class name or the object. 

Static Variabel: 
- is a variable that is attached to the class itself. And it has only ONE copy. And same variabe is SHARED by all objects. 
- We can call it: 	SHARED VARIABLE 
					CLASS VARIABLE 
					
- All non-static instance variables refer to independent 

- Single copy and change to static variable affect an object. 





Instance Variables Vs  Static Variables: 

- 	Instance variables are object variables and each object created from the class will have its own copy of it. 
	It will not be shared by all objects. 

- 	Static variable are class variables, can be accessed using a classname (if it is not private) and single central
	copy of variable that is shared accross all objects. 
	
Static Methods Vs Non-Static Instance Method: 

- Static methods can be called by using the ClassName. 

- Static method can also be called using an object. 

- Instance methods can only be used by creating and object from the class. 

=> Static Methods can not use non-static variables or methods. 

=> static members/class members:

=> they are attached/tied/belong to the class itself. and not dependent on object creation.

=> Can be accessed using classname, without creating an object
 
=> static variable are shared by all object and there is only one copy.
        
=> static variable if they are not private, can be accessed using classname 

=> static methods can be called using a ClassName and without creating an object.
        
=> objects can also call static methods.

=> normally we use static method for utility methods that do not depend on individual object data.
    
=> static methods cannot invoke non-static variables or methods.


=======================================================================================================


Mr. Muradil's Notes: 

public class TV{
    private String brand;
    public TV() {
        brand = "undefined";
    }
    public TV(String brand) {
        this.brand = brand;
    }
}
TV tv1 = new TV();
TV tv2 = new TV("LG");
Constructor definition:
    - runs automatically whenever we create object of the class.
    - Same name as ClassName and no return type
    - We can overload the constructor by changing the signature/parameters
    - If programmer does not add a constructor into class, then compiler will add one: default-no args-constructor.
    - It can be used to assign default values to variables or assign specific values to variables:
Example:
public class CellPhone {
    private String brand;
    //getter+setters for brand created:
    public CellPhone(String brand) {
        this.brand = brand;
    }
}
CellPhone cell1 = new CellPhone();
Above line will not compile, since we have only a Constructor that accepts a String parameter. 
when we say "new CellPhone()", it will not be able to find the matching no-args constructor.
CellPhone cell1 = new CellPhone("Samsung");
println(cell1.getBrand()); => 
public class CellPhone {
    private String brand;
    //getter+setters for brand created:
    public CellPhone(String brand) {
        this.brand = brand;
    }  
    public CellPhone() {
        brand = "somebrand";
    }
}
CellPhone cell1 = new CellPhone();
====================================
STATIC 
static int n = 100;
----------
static is a keyword.
       is a non-access modifier
4 things can be static in Java:
1) methods
2) variables
3) static block
4) static inner class
STATIC KEYWORD:
    static in one word means some method or variable belongs to the CLASS itself and not the OBJECT of the class.
public class Campus{
    String city;
    public void showLocation() {
        println("Campus is located in " + city);
    }
}   
Campus.city = "Chicago"; // will not compile, as city is an instance/object variable of Campus.
Campus.showLocation();// will not work, since showLocation is a instance method. we need to create object before using it.
Campus c = new Campus();
c.city = "Fairfax";
c.showLocation();
=====================================
public class Campus{
    static String city;
    public static void showLocation() {
        println("Campus is located in " + city);
    }
}   
Campus.city = "McLean";
Campus.showLocation();
The above lines will work, since city and showLocation are static now, and attached to the Campus class itself. We can call/access static by just classname. No need to create object.
======================
Whenever we add any static variable or method into a class, it means those belong to the class directly and can be used/accessed/called by using CLass name only. No need to create object.
If we create an object of the class, can we still use static variables/methods?
Yes, static can be accessed either using classname
or the object.
public class Campus{
    public static String city;
    public static void showLocation() {
        println("Campus is located in " + city);
    }
}
1) Campus.city = "Chicago";
2) Campus campus = new Campus();
   campus.city = "Los Angeles";
static vs instance variable
static vs instace method
================================
STATIC VARIABLE.
static variable is a variable that is attached to the class itself. And it has only ONE copy. 
And same variable is SHARED by all objects.
We can call it: SHARED VARIABLE
                CLASS VARIABLE.
All non-static instance variables refer to independent objects. And they are not shared centrally.
When a variable is STATIC, it is kind of shared and single copy/Central.
-> single copy and change to static variable affects all objects
-> static variable can be accessed using Classname.
and using object name as well.
=================
INSTANCE VARIABLE VS STATIC VARIABLE
------------------------------------
-> instance variables are object variables and each object created from the class will have its own copy of it. It will not be shared by all objects
-> static variable are class variables, 
can be accessed using a classname(if it is not private) and single central copy of variable that is shared across all objects.
STATIC METHOD VS NON-STATIC INSTANCE METHOD:
--------------------------------------------
-> Static methods can be called by using the CLASSNAME.
-> Static method can also be called using an object.
-> Instance methods can ONLY be used by creating an object from the class
-> Static methods cannot use non-static variables or methods.
==========================
Summary:


 
 
 
 
 
 
 
 
 
 
 
 
 
 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
