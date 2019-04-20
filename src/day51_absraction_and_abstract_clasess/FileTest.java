package day51_absraction_and_abstract_clasess;

public class FileTest {
	
	public static void main(String[] args) {
		
		//File file1 = new File(); //does not compile, because it is abstract class and we can't create object 
								// we get this message: "Cannot instantiate the type File"; 
		
		
		XLSFile xl = new XLSFile(); 
		
			xl.open(); 
			xl.close(); 
			xl.setName("TestData.xls");
				
				System.out.println(xl.getName());
				
				System.out.println();
		
	   JPGFile jpg = new JPGFile(); 
			
			jpg.setName("Event01.jpg"); 
			jpg.open();
			jpg.close();
				
				System.out.println("JPG file name: " + jpg.getName());
		
		System.out.println("File: " + File.count); 
		System.out.println("JPGFile: " + JPGFile.count);
		System.out.println("XLSFile: " + XLSFile.count); 
		
		//since count is static, once it is increment by 1, it will increment in all classes in the same time, it has a shared copy value
		//when an object is created, the count is incremented by 1 so the next one will be 3 
			System.out.println();
		PDFFile pdf = new PDFFile("AgileBook.pdf"); 
		
			pdf.open();
			pdf.close(); 
			
			System.out.println("File Count: " + File.count);
			System.out.println("PDF File Count: " + pdf.count);
		
		
		
		
	}

}
