package day51_absraction_and_abstract_clasess;

public class PDFFile extends File {

	//How do I call File(String name) 

	public PDFFile(String name) {
		
		super(name); //the same value should be given to the super() and pass 1 parameter type String 
	}
	
	@Override //it is override it 
	public void open() {
		 
		
		System.out.println("Opening PDF File using Adobe Acrobate Reader");
	}
	
	
	

}
