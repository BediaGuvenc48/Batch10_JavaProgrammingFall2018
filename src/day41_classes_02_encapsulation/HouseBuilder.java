package day41_classes_02_encapsulation;

import java.util.*; 

public class HouseBuilder {
	
	public static void main(String[] args) {
		
		
	House house1 = new House();
		house1.bedrooms = 3;
		house1.type = "Townhouse";
		house1.address = "123 Main st, Sterling VA 22222";
		house1.year = 2010;
		
	House house2 = new House();
		house2.bedrooms = 3;
		house2.type = "Single House";
		house2.address = "3456 Lee highway , Fairfax, 22031";
		house2.year = 2014;
		
	House house3 = new House();
		house3.bedrooms = 2;
		house3.type = "Condominuim";
		house3.address = "2234 K st NW Apt 543, Washington DC 20001";
		house3.year = 2012;
		
	House whiteHouse = new House();
		whiteHouse.bedrooms = 132;
		whiteHouse.type = "Mansion";
		whiteHouse.address = "1600 Pennsyllvania ave NW, Washington DC 20001";
		whiteHouse.year = 1800;
		
		System.out.println("House1 type:" + house1.type);
		System.out.println("House2 type:" + house2.type);
		System.out.println("House2 type:" + house3.type);
		System.out.println("whiteHouse type:" + whiteHouse.type);
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>Check>>>>>>>>>>>>>>>>>>>>>>>");
		int [] nums = new int [4]; // just example to show how you create an Array 
		nums[0] = 243; 
		
		
		
		String [] names = new String [4]; //just examples to explain how arrays work 
		names[0] = "Bill"; 
		
		
		House EsqersHouse = new House(); 
		EsqersHouse.type = "Townhouse"; 
		EsqersHouse.address = "4321 Jones St, Tysons', 22182"; 
		EsqersHouse.bedrooms = 3; 
		EsqersHouse.year = 1980; 
		
		House [] houses = new House [5];
		houses[0] = house1; 
		houses[1] = house2; 
		houses[2] = house3; 
		houses[3] = whiteHouse; 
		houses[4] = EsqersHouse; 
		
		System.out.println("======>>>>>>>>==========OUR CONSTRUCTED HOUSE=====>>>>>>>>");
		System.out.println(houses[0].address);
		
		System.out.println("=========");
		for (House n : houses) {
			System.out.println(n.address);
		}
			 
		System.out.println("=========");
		
		for (House b: houses) {
			System.out.println(b.type);
		}
		
		System.out.println("=========");
		
		for (House bed : houses) {
			
			System.out.println(bed.bedrooms);
		}
		System.out.println("=========");
		
		for (House y : houses) {
			System.out.println(y.year);
		}
		System.out.println("=========");
		
		for (House all : houses) {
			
			System.out.println(all.type + "=>" + all.address);
		}
		
		System.out.println("=========");
		
		for (int idx = 0; idx < houses.length; idx++) {
			
			System.out.println(houses[idx].type + " |" + houses[idx].address);
		}
		
		System.out.println("============ARRAYLIST OF HOUSE OBJECTS =============");
		
		
		//ArrayList<Integer> numList = new ArrayList<>(); Just an example 
		
		ArrayList<House> housesList = new ArrayList<>(); 
			
			housesList.add(house1); 
			housesList.add(house2); 
			housesList.add(house3); 
			housesList.add(whiteHouse); 
			housesList.add(EsqersHouse); 
			
	//2nd way is like this below since we have the ArrayList prepared already to us 
			
		ArrayList<House> housesList2 = new ArrayList<>(Arrays.asList(houses)); 
		
		for (House h1 : housesList2) {
			
			System.out.println(h1.address);
		}
		
		System.out.println("\n******************************");
		
		for (House h2 : housesList2) {
			
			if (h2.year >= 2006 && h2.year <= 2016) {
				
				System.out.println(h2.year + " | " + h2.address);
			}
		}
		
			System.out.println("******************************");
		for (int j = 0; j < housesList2.size(); j++) {
			
			House tempHouse = housesList.get(j); 
			
			if (tempHouse.year >= 2006 && tempHouse.year <= 2016) {
				
				System.out.println(tempHouse.year + " | " + tempHouse.address);
			}
			
		}
		
		System.out.println("+++++++ Test PrintHouseInfor Method +++++++");
		 printHouseInfo(house1);
		 printHouseInfo(whiteHouse); 
		  
	}

	//this is outside the main method 
	
	public static void printHouseInfo(House house) {
		
		System.out.println("===================");
		System.out.println("Type: " + house.type);
		System.out.println("Address: " + house.address);
		System.out.println("Bedrooms: " + house.bedrooms);
		System.out.println("Year: " + house.year);
		System.out.println("===================");
	}
}
