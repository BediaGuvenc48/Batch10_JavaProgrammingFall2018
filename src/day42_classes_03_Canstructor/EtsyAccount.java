package day42_classes_03_Canstructor;

public class EtsyAccount {

	
    private String email;
    private String firstName;
    private String password;
    
    public EtsyAccount() {
    	
    }
    
    public void setAccountInfo(String email, String firstName, String password ) {
        this.email = email;
        this.firstName = firstName;
        //this.password = password;
        setPassword(password);
    }
    
    public String getAccountInfo() {
//      String ret = email + " | " + firstName + " | " + password;
//      return ret;
        return this.email + " | " + firstName + " | " + password;
        //return getEmail() +" | " + getFirstName()+" | " + getPassword();
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        if(password.length() < 6) {
            System.out.println("Password - Must be at least 6 characters.");
            return;
        }
        this.password = password;
    }


}



