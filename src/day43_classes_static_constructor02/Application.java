package day43_classes_static_constructor02;

public class Application {
	
	
	public static void main(String[] args) {
		
		
		AppUser user1 = new AppUser ("ironman", "Mark Smith", "ac124"); 
		
		AppUser user2 = new AppUser ("postman", "Sar Smar", "a23423"); 
		
		AppUser user3 = new AppUser ("superman", "Hi Joe", "fc16242"); 
		
		user1.setCount(100);
		
		System.out.println(user1.getName()+ " " + user1.getUserId() + " " + user1.getPassword());
		System.out.println(user2.getName() + " " + user2.getUserId() + " " + user2.getPassword());
		
		System.out.println(user1.getCount());
		System.out.println(user2.getCount());
		System.out.println(user3.getCount());
		
		AppUser user4 = new AppUser(); 
			System.out.println(user4.getCount());
			
		System.out.println(user1.getUserId());
		System.out.println(user2.getUserId());
		
		
	}

}
