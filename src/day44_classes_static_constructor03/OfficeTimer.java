package day44_classes_static_constructor03;

	
	public class OfficeTimer {
		
	    static int baseCounter=0;
	    
	    int counter=0;
	    
	    public OfficeTimer() {
	        this.counter++;
	        baseCounter++;
	    }
	    
	    public static void main(String[] args) {
	    	
	        for(int index =0;index<10;index++) {
	            
	            OfficeTimer office =new OfficeTimer();
	            System.out.println("BaseCounter: " + baseCounter);
	            System.out.println("Counter: " +office.counter);
	        }
	    }

	}
	
