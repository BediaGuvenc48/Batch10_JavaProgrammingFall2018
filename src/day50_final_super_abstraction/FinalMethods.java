package day50_final_super_abstraction;

public class FinalMethods {
	
	//if you put the keyword final anywhere before the return type, you make the method final, only the variables are capitalized 
	//the methods are kept same like the camel case. 
	//we can only have 1 public class, any other classes can not be public 
	
	public final void makeAPhoneCall(String phoneNumber) { // you can also write final public void  makeAPhoneCall() { } 

		System.out.println("Dial number: " + phoneNumber + "\n Press On Call");
		
		
	}
}


class Sub extends FinalMethods {
	
//	public void makeAPhoneCall(String phoneNumber) { // you can't ovveride the final method. when you make a method final, the purpose is 
//													//to make sub-classes change anything. It would not let you to ovveride the method.  
//		
//		
//	}
	
	public void makeAphoneCall(int number) {
		
		System.out.println("Dial number: " + number + "\n Press On Call"); //this is overloaded and it is possible 
	}
	
	
		public static final void readSMSMessage(String sender) {
				
				System.out.println("Open messages and read for " + sender); //this is static method and can be used with final method 
				
			
			}
	
}

