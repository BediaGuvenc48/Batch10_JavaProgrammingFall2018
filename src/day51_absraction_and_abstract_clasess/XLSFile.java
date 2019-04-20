package day51_absraction_and_abstract_clasess;

public class XLSFile extends File{ //if we use extends keyword, then it will give this this error message: "The type XLSFile must implement the inherited abstract method File.open()"; 
								   // and it will not work 
	
	public void open() {		  //when you create the method which was in parent class which is File class, then it will compile
		
		System.out.println("Opening XLS using Ms Excell ");
	}
	

}
