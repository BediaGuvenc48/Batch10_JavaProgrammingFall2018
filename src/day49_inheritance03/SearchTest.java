package day49_inheritance03;

public class SearchTest {

	
	public static void main(String[] args) {
		
		
		SearchEngine srch = new SearchEngine(); 
		
			srch.search("iphoneCharger");
		
		Google gg = new Google(); 
			gg.search("Java Override Rules");
		
		Etsy es = new Etsy(); 
		
			es.search("Wooden Spoon");
			
		
	}
}
