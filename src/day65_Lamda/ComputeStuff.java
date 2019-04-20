package day65_Lamda;

public class ComputeStuff {

	public static void main(String[] args) {
		
		Computable compute = new Computable () {

			@Override
			public boolean canBeComputed(Integer i, Integer j) {
				 
//				boolean isBothEVen = (i % 2 == 0) && (j % 2 == 0); 
				
				return (i % 2 == 0) && (j % 2 == 0);
			} 
			
		};
		
		 
		Computable evenNumberFinder = (i, j) -> (i%2==0) && (j%2==0); 
		boolean isBothEven = evenNumberFinder.canBeComputed(8, 4); 
		System.out.println(isBothEven);
		
		
		
		
}


@FunctionalInterface 
interface Computable {
	
	boolean canBeComputed(Integer i, Integer j); 
	
}

}