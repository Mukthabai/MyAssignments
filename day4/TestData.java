package week2.day4;

import week2.day3.OverridingSubClass;

public class TestData {
	
	// Creating a superclass

	String username;
	String password;
	 public void enterCredentials() {
	        System.out.println("Enter Credentials:");
	    }

	    public void navigateToHomePage() {
	        System.out.println("Navigating to Home page");
	    }
		public static void main(String[] args)
		{

			TestData superClass=new TestData();
			superClass.enterCredentials();
			superClass.navigateToHomePage();
		}	
}
	    	
