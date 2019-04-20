package day43_classes_static_constructor02;

public class SmartTV {
	
	private int channel; 
	private int volumeLevel; 
	private boolean on; 
	private String brand;
	
	/*
	 * TV myTV = new TV(); 
	 * TV myTV = new TV("LG"); 
	 */
	
	
	public SmartTV () {
		
		System.out.println("Creating TV object using no Args- constructor");
		channel = 1; 
		volumeLevel = 1; 
		brand = "unidentified"; 
		on = false; 
		
	}
	
	//Overload the constructor, same name, but different parameters
	
	public SmartTV (String TV) {
			
		this.brand = brand; 
	}
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(on && channel > 0 && channel < 121) {
		     this.channel = channel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		}
	}
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	public void setVolumeLevel(int volumeLevel) {
		if(on == true && volumeLevel >= 1 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		}else {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");			
		}
	}
	public boolean isOn() {
		return on;
	}
	
	public void turnOn() {	//you can look at this as setter for isOn, but you can't officially say that it is setter. 
		if(isOn()  ) {
			System.out.println("TV is already ON");
		}else {
			on = true;
			//this.on = true;
		}
	}
	
	public void turnOff() {
		if(isOn()) {
			on = false;
		}else {
			System.out.println("TV is already OFF");
		}
	}
	
	public void channelUp() {
		if(isOn() && channel < 120) {
			channel++;
		}
	}
	
	public void channelDown() {
		if(isOn() && channel > 1) {
			channel--;
		}
	}
	
	public void volumeUp() {
		if(isOn() && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
	public void volumeDown() {
		if(isOn() && volumeLevel > 1) {
			volumeLevel--;
		}
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public static void main(String[] args) {
		
		
		SmartTV myTV = new SmartTV();
			myTV.getBrand(); 
		System.out.println(myTV.getBrand());
		
		SmartTV myTV1 = new SmartTV("LG"); 
			System.out.println(myTV1.getBrand());
		
	 
			
	}
 

}
