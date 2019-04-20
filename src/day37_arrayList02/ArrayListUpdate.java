package day37_arrayList02;
import java.util.*; 
public class ArrayListUpdate {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> test = new ArrayList<Integer>(); 
			test.add(111); 
			test.add(112); 
			test.add(113); 
		
		System.out.println(test);
		
		test.set(1, 10000); 
		System.out.println(test);
		
		int number = 10000 * 2; 
		
		test.set(1, number); 
		System.out.println(test);
		
		test.set(2, test.get(2) * 2); 
		System.out.println(test);
		
		test.set(1, test.get(1)/1000); 
		System.out.println(test);
		
		
		System.out.println("\n============Test End =================");		
	List<Integer> nums = new ArrayList<>(); 
		nums.add(100); 
		nums.add(200); 
		nums.add(300); 
		nums.add(400); 
		nums.add(500); 
		
		System.out.println(nums);

//update 100 to 1000 
		nums.set(0, 1000); 
		System.out.println(nums);
		
//double the value of index 1 
		
		int num1 = 100 * 2; 
		
		nums.set(0, num1); 
		System.out.println(nums);
		
//another way of double the value of index 1 is: 
		nums.set(1, nums.get(1)*2); 
		System.out.println(nums);

//find the position of 300 and make it 3 
	
		nums.set(2, nums.get(2)/100); 
		System.out.println(nums);

//anothe way is: 
		nums.set(nums.indexOf(500), 65); // the method is only designed to accept value
		System.out.println(nums);		//no need to be confused 
	
	}

}
