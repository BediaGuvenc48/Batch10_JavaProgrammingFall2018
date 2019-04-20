package day25_Arrays;

public class warmUpTask {
	
	public static void main(String[] args) {
		
	/*
	 * create an array called kitchenItems 
	 * knife, wooden spoons, plates, cups, forks, pan, pot, trash-can, fridge
	 * dishwasher
	 * 
	 * using a for each loop iterate through each item; 
	 * within you for each loop; 
	 * have a switch statement 
	 * switch (item) {
	 * 
	 * case (knife"; 
	 * print: "Knife is used for cutting veggies"; 
	 * break; 
	 * }
	 * 
	 * 	
	for (String car : cars ) {
		System.out.println(car + ", ");
	}
	 */
		
		String [] kitchenItem = new String [10];  
			kitchenItem[0] = "knife"; 
			kitchenItem[1] = "wooden spoon"; 
			kitchenItem[2] = "plates"; 
			kitchenItem[3] = "cups"; 
			kitchenItem[4] = "forks"; 
			kitchenItem[5] = "pan"; 
			kitchenItem[6] = "pot"; 
			kitchenItem[7] = "trash-can"; 
			kitchenItem[8] = "fridge"; 
			kitchenItem[9] = "dishwasher"; 
		
//		for (int idx = 0; idx < kitchenItem.length; idx++ ) {
//			
//			System.out.println(kitchenItem[idx]);
//		}
			
			for (String Item : kitchenItem) {
				
				switch(Item) {
				
				case "knife": 
					System.out.println("Knife is sharpe");
					break; 
				case "wooden spoon": 
					System.out.println("Wooden Spoon !!!");
					break; 
				case "plates": 
					System.out.println("plates !!!");
					break; 
				case "cups": 
					System.out.println("cups !!!");
					break; 
				default: 
					System.out.println("Item does not exist !!!");
				}
			}
		
		
		
		
		}
		

//		String [] kitchenItems = {"knife", "wooden-spoon", "plates", "cups", "forks", "pan", "pot", 
//				"trash-can", "fridge", "dishawaser"};
//		
//		String describe = "kitch"; 
//		for (String item : kitchenItems) {
//			
//			switch (item) {
//			
//			case "knife":
//				describe = "knife is a good tool used for kitche";
//				break;
//			case "cups":
//				describe = "cups are used for tea"; 
//				break;
//			default: 
//				System.out.println("item doesn't exist");
//				
//			}
//		}
//			System.out.println(describe);
//		

		
	/*	
		String [] kitchenItems = new String [] {"knife", "wooden-spoon", "plates", "cups", "forks", "pan", "pot", 
				"trash-can", "fridge", "dishawaser"};

		
		for (String item : kitchenItems) {
			
			switch (item.toLowerCase().trim()) {
			
			case "knife":
				System.out.println("Knife is for cutting veggies");
				break; 
			case "wooden-sppon": 
				System.out.println("wooden-spoon is used for eating soap");
				break;
			case "plates":
				System.out.println("Plates are used for rices");
				break; 
			case "cups":
				System.out.println("cups are used for tea");
				break; 
			case "forks":
				System.out.println("forks are used for fruits");
				break; 
			case "pan": 
				System.out.println("pan is used for cooking food");
				break;
			case "pot": 
				System.out.println("pot is used for cooking");
				break;
			case "trash-can":
				System.out.println("trash-can used for collecting trushes");
				break;
			case "fridge":
				System.out.println("fridge is used for keeping cools");
				break;
			case "dishwahsher":
				System.out.println("is used for washing the dishes");
				break;
			default: 
				System.out.println("Not included in items");
			
			}
			
			
		}*/
			
		
		
		
		
		
		
		
	}

