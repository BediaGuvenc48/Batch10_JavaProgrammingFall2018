package day53_absraction_Interface_02;

public interface USB2_DEVICES {
	
	void plugin(); 
	void transferData(); 

}


 interface USB3_DEVICES extends USB2_DEVICES {
	
	 void transferData_Faster(); 
	 
//	 void plugin(); 
//	 void transferData(); --> These are coming just by using the extends to inherit whatever methods or behavior is inside USB2_DEVICES 
	                                     
//	

}
 
 
 
