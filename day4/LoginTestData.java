package week2.day4;

public class LoginTestData extends TestData {
	
	// Creating a subclass
	
	public void enterUsername () {
        System.out.println("Username:");
    }

    public void enterPassword() {
        System.out.println("Password:");
    }
    
    public static void main (String[] args) {
    	LoginTestData td=new LoginTestData();
    	td.enterUsername();
    	td.enterPassword();
    	td.enterCredentials();
    	td.navigateToHomePage();
        
    }
}
