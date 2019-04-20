package day60_DataStructor_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
	
	public static void main(String[] args) {
		
		//First IN First Out 
		//Queue<String> q = new PriorityQueue<>(); 
		Queue<String> q = new LinkedList<>(); 
		q.add("Delta"); 
		q.add("American"); 
		q.add("Qatar"); 
		q.add("Turkish"); 
		
		System.out.println(q);
		
		
		
	}

}
