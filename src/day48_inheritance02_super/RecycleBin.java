package day48_inheritance02_super;

public class RecycleBin extends Bin{
	
//	 public RecycleBin() {
//		 
//		setType("recylce bin"); 
//		
//		setType("my RecycleBin"); 
//	 }

	public RecycleBin() {
		super("recycle bin"); 
	}
	
	public RecycleBin(String typeOfRecylceBin) {
		super(typeOfRecylceBin); 
	}
	
	
	
}
