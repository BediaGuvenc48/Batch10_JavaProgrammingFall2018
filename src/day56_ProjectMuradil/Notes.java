	package day56_ProjectMuradil;
	
	public class Notes {
		
	/*
	 
	 
	12/30/2018
	----------
	
	31 / 1 - no class. But feel free to work on your homework assignments, and you can also come to campus.
	
	Java + Selenium WebDriver + Maven + TestNG
	
	Java OOP summary.
	
	Practice project.
	===========================
	
	Monday projects. Custom In house Real applications testing/automation.
	
	=========================
	
	OOP:
		- Encapsulation
		- Inheritance
		- Abstraction
		- Polymorhism
	==========================
	
	Encapsulation => Data hiding, controlling data by making your instance variables private. And providing public access using getter/setter methods.
	
	Benefit: you can control data assignment to your instance variables
	
	Inheritance => When a child class acquires variables and methods from a parent class.
	IS-A relation between classes.
	
	Behefit: Code reusability, Easy to maintain,
	Organized code, Polymorphism 
	
	
	Abstraction => it is displaying behaviour but hiding the implementation.
		How to achieve abstraction:
			- abstract classes
			- interfaces
	
		In those 2, we can write abstract methods that do not have implementation.
	
		Concrete classes that inherit abstract classes and interfaces are responsible to provide implementation.
	
		Some points:
	
		Common between Abstract class and Interface:
	
		- cannot be instantiated/create object
		- can add abstract methods
	
		Differences:
	
		- a class can extend a single abstract class,
		but can implement multiple interfaces
	
		- Variables:
			Abstract class:
				- instance, static, final, type of variables
	
			Interfaces:
				- all variables are automatically public static final 
	
		- methods:
			Abstract classes:
				- abstract and non-abstract methods
				- static methods
			Interfaces:
				- abstract methods
				-Starting from Java 8:
					- default methods
					- static methods
		- Extending:
			Abstract classes can extend any abstract or non-abstract class
			Interfaces can only extends one or more interfaces
	=======================================
	
	Polymorhism => A reference of Parent class, interface type can refer to object of any sub class.
	
	Animal => Cat
		   => Dog
	
	Animal a = new Cat();
	       a = new Dog();
	
	(i)WebDriver => ChromeDriver
			     => FirefoxDriver
	
	WebDriver driver = new ChromeDriver();
	
	WebDriver driver = new Cat(); will not work,
	for this to work, a class must implement the interface.
	
	List<String> list = new ArrayList<>();
	
	List<String> list = new LinkedList<>();
	
	list = new Vector<>();
	==========================
	
	
	public interface A{
		
	}
	
	public interface B extends A, J {}
	
	A a = new B(); will not work, cannot create object from interface/ cannot instantiate the interface.
	
	public class MyClass imlements B {
		
	}
	
	A a = new MyClass();
	B b = new MyClass();
	
	MyClass m = new MyClass();
	=======================
	 
	There are 2 types of polymorphism: 
	
	1): static Polymorphism: It is also called static binding, it is overloading methods, the compiler konws 
	    already which method will be called. It is also called compiled type binding.
	    
	    Example: 
	    	
	    	public void m1(){}
	    	
	        public void m1(String str){} 
	
	2): Dynamic Polymorphism: It is method Overriding and maybe called Runtime Binding. 
	
	Example: 
		
		class A {
		
			public void m1(){ }
		}
		
		class B extends A {
		
			public void m1(){ }
			public void m2(){ }
		}
		
		class C extends B{
		
			public void m1(){ }
			public void m3
		}
	
	 	
	 	A a1 = new C(); 
	 	
	 	a1.m1(); // Good since A has m1 method.  
	 	a1.m3(); // Not good, since A does not have it. 
	 	
	 	Single Most Important Rule of Polymorphism in Java:
	 			-> Reference type decides which methods can be accessed. 
	 			
	 
	 -> In above exmaples, we can call only m1(); method, since reference type is A. It will be called from the C, because 
	 	it is overriden. If the method was overriden, then the overriden version will be called during the runtime. 
	 	
	 Exmaple: 
	 
	 B b = new A(); // this is not possible, because it goes from parent to child, not from child to parent  A > B > C  
	 
	 B b1 = new B(); // Good, but it is not polymorphism. 
	 
	 B b1
	 
	 =================================
	 
	 SalesJan2009.csv: 
	 
	 csv: Comma Separated Values, 
	 
	 Concept: 
	 -> in my current porject, I do lots of Reports validation automation, My Code goes to web application and downloads the CSV report, 
	    Then My requirement is to aensure that data 
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 */
	
	
	}
