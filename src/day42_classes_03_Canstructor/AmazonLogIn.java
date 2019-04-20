package day42_classes_03_Canstructor;

public class AmazonLogIn {
	
	public static void main(String[] args) {
		
		Amazon myAcount = new Amazon("ahmad@gmail.com", "ahmad123"); 
//			myAcount.setPassword("aiaz447");
//			myAcount.setEmail("aiaz@hotmail.com");
				 
//		String result = myAcount.getEmail() + " " + myAcount.getPassword(); 
//		
//		System.out.println(result);
	
		
		System.out.println(myAcount.getEmail());
		myAcount.setEmail("zaki@gmail.com");
		
		System.out.println(myAcount.getEmail());
		
	}

}
