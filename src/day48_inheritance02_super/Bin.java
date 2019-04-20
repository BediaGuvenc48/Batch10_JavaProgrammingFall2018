package day48_inheritance02_super;


public class Bin {
	private String contents;
	private String type;
	
	public void setType(String type) {
		this.type = type;
	}
	
	public Bin() {
		this("general");
	}
	
	public Bin(String type) {
		contents = "";
		this.type = type;
	}
	
	public void add(String thing) {
		if(contents.isEmpty()) {
			contents = thing;
		}else {
			//contents += "," + thing;
			contents = contents.concat("," + thing);
		}
	}
	
	public boolean remove(String thing) {
		String temp = contents.toLowerCase();
		thing = thing.toLowerCase().trim();
		
		if(temp.contains(thing)) {
			if(temp.startsWith(thing)) {
				temp = temp.replace(thing, "");
				temp = temp.isEmpty() ? temp : temp.substring(1);
			}else {
				temp = temp.replace(","+thing, "");
			}
			contents = temp;
			return true;
		}else {
			return false;
		}
	}
	
	public void empty() {
		contents = "";
	}
	
	public String toString() {
		return "Bin ("+type+") contains ["+contents+"]"; 
	}
	
}









	
//	
//	
//	
//	
//	private String contents; 
//	private String type; 
//
//
//	public Bin () {
//		
//		this ("general"); //we are calling the second constructor using this() keyword by passing 1 parameter String type 
//		
////		contents = ""; 
////		type = "general"; 
//	}
//	
//	
//	public Bin (String type) {
//		
//		contents = ""; 
//		this.type = type; 
//		
//		
//	}
//	
//	
//	public void add(String thing) {
//		
//		if (contents.isEmpty()) {
//			
//			contents = thing; 
//		} else {
//		
//			//contents+= "," + thing; //it will be like this book, thing and will not have comma at the end. 
//			
//		}
//	}
//	
//	public boolean remove(String thing) {
//		String temp = contents; 
//		thing = thing.toLowerCase();
//		
//		if(temp.contains(thing)) {
//			if(temp.startsWith(thing)) {
//			temp=temp.replace(thing,"");
//			temp=temp.isEmpty()? temp:temp.substring(1);
//			}else {
//				temp=temp.replace(","+thing,"");
//			}
//			contents=temp;
//			return true;
//		}
//		else {
//			return false;
//		}
//
//	}

		

	


