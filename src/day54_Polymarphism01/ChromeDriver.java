package day54_Polymarphism01;

public class ChromeDriver implements WebDriver {

	public void setChromeOptions(String [] options){
		
		
		for (String option : options) {
			System.out.println("setting chrome options: " + option);
		}
	}
	

	@Override
	public void navigate(String url) {
		
		System.out.println("Navigating to the" + url + " from Chrome");
	}
	
	@Override
	public void open() {
		
		System.out.println("Opening the URL from Chrome");
	}

	@Override
	public void close() {
		
		System.out.println("Closing the Websited from Chrome");
	}

	@Override
	public void quit() {
		
		System.out.println("Quitting the WebPage from Chrome");
		
	}

	
}
	
	
