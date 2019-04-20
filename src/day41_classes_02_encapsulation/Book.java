package day41_classes_02_encapsulation;

public class Book {
	
	//these variables are encapsulated or protected and you can't access it outside this class 
	private String title; 
	private String author; 
	private int pages; 
	
	
	public Book(String title) {
		
		this.title = title; 
	}
	
	public Book(String title, String author) {
		
		this.title = title;
		this.author = author; 
	}

	public Book(String title, String author, int pages) {
	
	this.title = title; 
	this.author = author; 
	this.pages = pages;
	}
	
	public String getTitle() {
		
		return title; 
	}
	
	public String getAuthor() {
		return author; 
	}
	
	public int getPages() {
		return pages; 
	}
	
	public void setTitle() {
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//writing the first Getter 
	
//	public String getTitle() {
//		
//		return title; 
//	}
//	
//	public void setTitle(String newTitle) {
//		
//		title = newTitle; 
//	}
//	
//	public String getAuthor() {
//		
//		return author;  
//	}
//	
//	public void setAuthor(String newAutor) {
//		
//		author = newAutor; 
//	}
//	
//	public int getPages() {
//		
//		return pages; 
//	}
//	
//	public void setPages(int newPages) {
//		
//		pages = newPages; 
//	}
//	
//	public String getJavaTitle() {
//		
//		return title; 
//	}
//	
//	public void setJavaTitle(String javaTitle) {
//		title = javaTitle; 
//	}
//	
//	public String getJavaAuthor() {
//		
//		return author; 
//	}
//	
//	public void setJavaAuthor(String javaAuthor) {
//		author = javaAuthor; 
//	}
//	
//	public int getJavaPages() {
//		return pages; 
//	}
//	
//	public void setJavaPages(int javaPages) {
//		pages = javaPages; 
//	}
//	
	
	

}
