package day54_Polymarphism01;

public class FirefoxDriver implements WebDriver{

	
   public void setFirefoxOptions(String [] str){
	 	
		System.out.println("this is FireFoxDriver Running !!!");
	}

	@Override
	public void navigate(String url) {
		 
		System.out.println("Navigating to the" + url + " from Firefox");
	}

	@Override
	public void open() {
		
		System.out.println("Opening the URL from Firefox");
	}

	@Override
	public void close() {
		System.out.println("Closing the Websited from Firefox");
	}

	@Override
	public void quit() {
		
		System.out.println("Quiting the page from Firefox");
	}
	
	
}