package day60_DataStructor_list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Note {

/*
 
 Data structures in Java: 
 
 
 
 Collection Framework: 
 
 	- Interface: 
 	- Implementations: It is basically those 
 	- Algorithm: It gives you different functionality and whatever is convinience for the programming. 
 	
 -> Whatever you see in orange is Iterable, then collection, 
 
 Iterable: Anything that you can iterate at all. It is a super class of collections and super interface of all collections. It 
 	-> Collection 
 1. List 
 2. Set 
 		-> SortedSet 
 3. Queue 
 		-> Deque 
 
 4. Map 
 5. SortedMap

Common Behavior: 

Collection: Provides based guidlines 
	List: 
	

-> Anything which is iterable, you can use for each loop to iterate through or you can use from iterate method to iterate. 
-> We can't use for loop, because we don't have an index to iterate through

List<E> subList = list.subList(1, 4); --> This will give you an specific index range of the original object. It is not a copy. 


Collections: It is a class, Has a lot of utility methods. 

TreeSet -> organize the sorting order from Asky Table. 

 
 -> They are diverse, ordering, uniques and pairs. You can store them in pairs too. In java we call them map. 
 
 
Collection: 
	- List 
	- Set 
		-> SortedSet 
	- Queue 
		-> Deque 

In collection framework there are number of Interfaces; 
	parent/super interface is Collection 
	
	Sub Interfaces: 
		- List 
		- Set 
		- Queue 
	
	List -> ArrayList 
		 -> Vector 
		 -> LinkedList 
	
	Set -> HashSet 
		-> TreeSet 
		
		SortedSet Interface: 
			-> TreeSet 
	
	Queue -> PriorityQueue 
		DeQue -> ArrayDeque 
		

Data Structure in Java: When we talk about data structore, at least we are talking about the following data structures. 

	-> Arrays 
	-> Member of Collection Framework 
	-> Maps 


List: 
	-> Keeps the ordering 
			Example: 		List<Integer> l = new ArrayList<>(); 
							l.add(123); 
							l.add(77); 
	
	-> Keeps or allows the duplicates 

			Example: 		List<Integer> l = new ArrayList<>(); 
							l.add(123); 
							l.add(77);
							l.add(77); 
 	-> Resizable: 
 		Add or remove methods 
 	
 	-> Can update values
 		Set method
=====================================

What is the difference between Array and ArrayList? 

	- Array is fixed size 
	- ArrayList is resizable 
	
	- Array can hold primitives 
	- ArrayList can only hold objects 
	
	(All collection members only hold objects) 
	
	-> Both can contain duplicates 
	-> Both keep ordering 
	
	-> Array can be multi dimmensional 
-------------------------------------

How to convert from ArrayList to Array? 

	ArrayList to Array -> list.toArray(); 
	
	Array to ArrayList - > Arrays.asList(array); 
	
How to delete all elements from ArrayList? 
	- removeAll or cleare(); 


Any work arround to resize an Array? 
	int [] nums = {23,6,2,1}; 
	
	Arrays.copyOf(nums, nums.length + 1); //you are just adding a size at the copied Array. 


List -> LinkedList 

Nodes in LinnkedList: We call it, because we know the elements are linked with each other. 
	- Each Element is a node in LinkedList. 
	- Each nodes contains Value also Pointer to next Node 
	- Last Node's pointer is null 
	
Works Similar ArrayList. 

It does not use Arrays Internally. 

Technical Differences: 
	-> LinkedList implements List interface, also Deque interface and act as Deque as well. 


List => Vector: 

	- Vector is similar to ArrayList. 
	
	- Vector is syncronized and ArrayList is not syncronized (when multiple Threads). 
		-> Thread-Safe -> When one thread of program accesses that Vector. It will lock it and other threads will wait until it 
		   is unlocked. 
		

ArrayList & LinkedList are not synchronized. They are not safe for multi Thread invironment. But you can use the Coolection.synchronizedList, then 
it will be automatically synchronized. 

Example: 

	Coolection.synchronizedList 
	
	synchronized {
	
		List<> 
	}

Stack: 
	-> LIFO -> Last In First Out (if you put the books on the top of of each other, the last one will be first one to pick). 
	
			//LAST IN FIRST OUT 
		
		Stack<String> stack = new Stack<>(); 
			stack.push("java"); 
			stack.push("OCA"); 
			stack.push("Selenium Cookbook"); 
			stack.push("10X"); 
		
			System.out.println(stack.peek()); //this give us the last element in Stack 
			System.out.println(stack);
		
			System.out.println(stack.search("java")); //java is the first element, but when other elements are put on the top of it, then 
													 // it will be the last item, because other books are on the top. 

Queue Interface: 
	
	-> First In First Out 

	//First IN First Out 
		//Queue<String> q = new PriorityQueue<>(); 
		Queue<String> q = new LinkedList<>(); 
		q.add("Delta"); 
		q.add("American"); 
		q.add("Qatar"); 
		q.add("Turkish"); 
		
		System.out.println(q);

SET -> HASHSET: 
	-> SortedSet 
		- TreeSet 

-> Set: It is a collection of elements without duplicate elements. The Order doesn't apply here. 

-> HashSet -> It is a collection of duplicate elements only. 


How to prevent Set to accept custom object with same values? 

	1): Overrid hashCode and equals mehtods in your custom class
	
	2): When adding elements Set will call equals method on objects to be added and if it sees they are equal 
		it will only allow one of them. 

If you have an employee class in ArrayList, how do you sort by name? 

	1): Emloyee class must implement Comparable interface 
	2): Override compareTo method, 

Example: 

		String str1 = "c"; 
		String str2 = "b"; 
		
		System.out.println(str1.compareTo(str2));
		//if equlas -> 0 
		//if fistOne is larger -> positive number 
		//if firsOne is smaller -> negative number  
 
 
 Collection and Map: 
 	-> Map is the only collections that don't extends or implement the Collection interface. 
 	
 		- A HashMap contains values based on the key. 
 		- It contains only unique elemetns 
 		- It may have one null key and multiple null values 
 		- It maintain no orders 
 		
 MAP -> HASHMAP:  
 
 SortedMap -> TreeMap
 
 Structure is like this: 
 
 K, V (key & value) 
 
 Key 	, 	Value 
 String, 	Integer 
 Integer, 	String 
 Double, 	Boolean 
 
 uerName,	abc123 
 
 Data is structured into Key and Value format. 
 
 Menu: 
 Regular Coffee , 2,99 
 Cappucino, 4,50 
 Hot Chocolate, 3.00 
 
=> TREEMAP is sorted version of HashMap 

=> TreeMap sorts by keys 

What is the difference between HashTable and HashMap? 

	-> HashTable is synchronized
	-> HashTable is key value 
	-> HashTable does not allow the null key  
	
 	-> HashMap is not synchronized.
	-> HashMap does allow a null key  
 
 */
		
}
