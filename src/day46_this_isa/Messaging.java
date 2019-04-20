package day46_this_isa;

public class Messaging {
	
	public static void main(String[] args) {
		
		Message msg1 = new Message("Hello", "Marufjon", "Akbar");
		
		Message msg2 = new Message("Java is Fun...."); 
		
		Message msg3 = new Message("This kewyword is interesting ....", "Shahin"); 
		
		Message msg4 = new Message(); 
		
		//Same Constructers same name, different parameters and it is overloading constructor
		//
		
		System.out.println(msg1.toString());
		System.out.println(msg2.toString());
		System.out.println(msg3);//toString() is very sensitive, even if we don't say toString() it will print it in toString() format 
		System.out.println(msg4);
		
		//this is only example for chaining the method, like in StringBuilder you can do it with append 
		StringBuilder stb = new StringBuilder("A"); 
		
		stb.append("B").append("C").insert(0, "J"); 
		
		System.out.println(stb);
		
		
		
		
	}

}
