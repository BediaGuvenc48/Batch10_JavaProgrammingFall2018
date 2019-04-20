package day51_absraction_and_abstract_clasess;

public class JPGFile extends File { // Again it is complaining and gives the error message: "The type JPGFile must implement the inherited abstract method File.open()"
	
	@Override // it is overrided, so we can keep @Override or we can remove it 
	
	public void open() {
		
		System.out.println("Openning JPG File using Image Viewer");
	} 
	

}
