package day34_MethodWithReturn03;

public class VarArgs {
	
	public static void main(String[] args) {
		
		sum(5, 10); 
		sumAll(12); 
		sumAll(100, 200, 300, 400, 500, 600); 
		sumAll(10, 20, 30, 40);
		//sumAll(10, true); //Error 
		 
		shopinList("apple", "Kiwi", "Bananas");
		//shopinList("rice", "tomato", "onion", "veggie");
		//shopinList("headphone", "computer", "mac", "phone");
		
	}

	public static void sum(int n1, int n2) {
		
		System.out.println(n1 + n2);
		
		//it only accepts 2 numbers and will not accept more 
	}
	
	public static void sumAll(int ... nums) {
	//this will work without all elements or with all elements, more than 2 
	//can be accepted, because ... is Var-Args which is Vary Arguments 
	//... can only be inside in an Array, declaration 
	// we can put (boolean ... b) 
		
		int sum = 0; 
		
		for (int num : nums) {
			
			sum = sum + num; 
			
		}
		
		System.out.println("Sum is: " + sum);
		
//		System.out.println("Number of inputs: " + nums.length);
//		
//		for (int idx = 0; idx <nums.length; idx++) {
//			
//			System.out.println("Sum is: " + nums[idx]);
//		}
		
	}
	/*
	 * write a method create shopping list that has var-args
	 * Args: String varargs
	 * return type: Void 
	 * it will print shopping items in single line seperated by space  
	 * Example: 
	 * shoppingList("apple", "Kiwi", "Bananas") -> 
	 * output should be "Shopping List: apples Kiwi Bananas 
	 */
	
	public static void shopinList(String ... list) {
		
		System.out.print("Shopping List: ");
		for (String item : list){
			
			System.out.print(item + " ");
	
		}
	
		System.out.println("\n=================");
	}
	

	
}
