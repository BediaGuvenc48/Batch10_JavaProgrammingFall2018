package day37_arrayList02;
import java.util.*; 
public class ArrayListManipulationTeacher {
	
public static void main(String[] args) {
	
	
	
	ArrayList <String> kabul = new ArrayList<>(); 
	
		kabul.add("shaher"); 
		kabul.add("wazirabad"); 
		kabul.add("lis-e maryam"); 
		kabul.add(0, "Lab-e Jar"); 
		
		System.out.println(kabul);
	
	ArrayList <String> kohistan = new ArrayList<>();
		
		kohistan.addAll(kabul); 
	System.out.println(kohistan);
		kabul.removeAll(kabul); 
	
	System.out.println(kabul);
	
	System.out.println("===============TEST STARTS==============");

    List<String> f = new ArrayList<>(Arrays.asList(new String[] {"Plum", "Cherry","Mango"} ));
		System.out.println(f);
	ArrayList<String> f1 = new ArrayList<String>(); 
		f1.addAll(f); 
		System.out.println(f1);
		f1.add("Banana");
	System.out.println(f1);
		f1.removeAll(f); 
	System.out.println(f1);
    
	System.out.println("===============TEST ENDS==============");
	
    //Create arraylist fruits using 5 different ways
    //fruits1...
    ArrayList<String> fruits1 = new ArrayList<>();
    List<String> fruits2 = new ArrayList<>();
    List<String> fruits3 = new ArrayList<>(10);
    ArrayList<String> fruits4 = new ArrayList<>(fruits1);
    List<String> fruits5 = Arrays.asList(new String[]{"Watermelon", "Peach", "PineApple","Kiwi"});
    //fruits5.remove("Peach"); //UnsupportedOperationException
    List<String> fruits6 = new ArrayList<>(fruits5);
    fruits6.add("Cherry");
    
    List<String> fruits7 = new ArrayList<>(Arrays.asList(new String[] {"Plum", "Cherry","Mango"} ));
    fruits7.add("pears");
    //add values
    
    fruits1.add("Grapes");
    fruits1.add("Tomato");
    fruits1.add("BlueBerries");
    fruits1.add("BlackBerries");
    fruits1.add(0,"Orange");
    fruits1.add(4,"Stawberries");
    
    System.out.println(fruits1);
    //add all values from fruits1
    fruits2.addAll(fruits1);
    fruits2.add("Dragon Fruit");
    System.out.println(fruits2);
    //remove elements
    fruits1.remove(0);
    System.out.println(fruits1);
    
    fruits1.remove("Stawberries");
    System.out.println(fruits1);
    
    //remove all elements of Fruits1 from fruit2
    fruits2.removeAll(fruits1);
    System.out.println("Fruits2: " + fruits2);
    
    fruits1.clear();
    System.out.println(fruits1);	
	
    
   }

}
