package day37_arrayList02;

public class Notes {
	
	/*Recap: 
	Overloading: 
	-	Methods in same class, with same name and different parameters(type, count, order). Different signature. 
	
	ArrayList: 
	-	Dynamic array, internally it is built on Arrays. 
	-	Part of Java Collections, and one of the most popular collection in use. 
	
	Example: 
	String [] words = {“java”, “Eclipse”}; 
	words[0] “Python”; // changing an array element. 
	
	Wrapper Classes: 
	-	Byte 
	-	Short 
	-	Integer 
	-	Long 
	-	Float 
	-	Double 
	-	Character 
	-	Boolean 
	
	Warm Up Task:
	
	How to create ArrayList: 
	-	ArrayList<Integer> nums = new ArrayList<>(); 
	-	ArrayList<Integer> nums = new ArrayList<Integer>(); 
	-	List<Integer> nums = new ArrayList<>(); 
	-	List<Integer> nums = new List <>(); // will not compile 
	-	You can add the list at the left, but you can’t say new list. 
	     List is called interface which is in the class but can’t create Object of interfaces. 
	
	Add size as well: 
	-	ArrayList<Integer> nums = new ArrayList<>(10); // it doesn’t compiles and better not to be identified the numbers for important 
	    application, because the number of users can be a million in the same time and the loop will be running million times in a second 
	    which can break the application sometimes. The number is not fixed size and can be modified to change the number. 
	
	-	ArrayList<Integer> newList = new ArrayList<>(oldList); // this will copy and add it to you new list and element will be added in to the list. This code will create an ArrayList by initializing using values from the oldList. 
	
	Example: 
	int [] nums = {123, 34, 23, 567}; 
	ArrayList<Integer>numsList = Arrays.asList(nums); 
	
	List<String> cities = Arrays.asList(new String [] {“Tokyo”, “London”, “Richmond”, “New York”}; 
	-	The above method is the way how to create an Array in one line 
	
	How to add elements to ArrayList: 
	-	Add has also versions: 
	
	-	1. add(values/object); //this is value and it should be Integer not int 
	
	-	2. add(index, /object/value); 
	List.add(0, 123.4); 
	ListOfChars.add(2, ‘c’); 
	
	-	3. addAll(AnotherList); //Will append/add all elements from one list to another 
	  	List1.addAll(list2); 
	
	-	4. addAll(index, AnotherList); 
	Will append/add starting from that index 
	List1.addAll(5, list2); 
	
	
	Remove Elements: 
	1.	clear () => remove all elements 
	list.clear() => it will remove all existing elements 
	
	2.	remove(index); //remove value from specified index 
	list.remove(5); 
	
	3.	remove(Object); //remove the first specific value present in the list 
	list.remove(“London”); //you just remove the object you want from your ArrayList. 
	
	4.	removeAll(anotherList); 
	if you have a list with certain values, like example below: 
	list1.removeAll(list2); => will remove all matching elements 
	between list1 and list2.
	
	- Check if it is empty ? 
	isEmpty() method which returns a boolean 
	list.isEmpty() => returns boolean 
	
	list.size() == 0 ==> returns boolean 
	
	Find how many elements ? 
	size() method 
		list.size() => int number of elements 
		
	How to check if a list contains a certain value? 
	- cities.contains("Boston"); // if it contains return true, else returns false  
	
	How to find position of a value in a list? 
	- indexOf(Object/value); 
		cities.indexOf("Austin"); // if it is in 6, then it will give you 5, because
									it starts from 0 & is case sensitive. 
	- lastIndexOf(Object/values); // if we have multiple objects, it gives us the last index position 
	
	How to update an element in a certain index? 
	- List<String> languages = new ArrayList<>(); 
	languages.add("C++"); 
	languages.add("C#"); 
	languages.add("objective C"); 
	languages.add("Java"); 
	
	set (index, object/Value); 
	I want to update C# to Python 
	
	languages.set(1, "Python"); // C# is in index 1, will disappear and Python will be replaced instead 
		
    If it was Array then we would do it this way 
	Array[1] = "Pyton"; 
									
		*/
	
	


}
