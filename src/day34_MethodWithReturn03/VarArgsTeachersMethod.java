package day34_MethodWithReturn03;

public class VarArgsTeachersMethod {
	
	public static void main(String[] args) {
		sum(10, 20);
		//sum(1, 4, 7); error
		sumAll();
		//sumAll(10, true); error
		sumAll(12,34,345);
		sumAll(423,35,6,23,34,63,23,454,455);
		
		shoppingList("rice" , "tomatos" , "grapes" , "beef" , "mango");
		shoppingList("Headphones", "New MacBookPro" , "Kitchen Aid", "Wooden Spoon");
		
		String [] myList = {"shoes", "shirts", "gloves"}; 
		shoppingList(myList); //even if you give an array to Var-Args, it will accept it
		
	}
	
	public static void sumAll(int... nums) {
		System.out.println("Number of inputs:" + nums.length);
		int sum = 0;
		for(int num : nums) {
			sum += num;
		}
		
		System.out.println("Sum : " + sum);
		
	}
	
	
	/*Method: shoppingList
	  Args: String var-args
	  return type: Void
	  It will print shopping items in single line, separated by space
	  shoppingList("apples" , "Kiwi", "Bananas") -> 
	  	prints: "Shopping List: apples Kiwi Bananas"
	*/
	public static void shoppingList(String... list) {
		System.out.print("Shopping list: ");
		for(String item : list ) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	

	public static void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	
	}

   }

