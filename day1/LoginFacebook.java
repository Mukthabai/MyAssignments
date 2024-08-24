package week2.day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("Tuna@321");
        driver.findElement(By.name("login")).click();
       Thread.sleep(3000);
        //get title page
        String title = driver.getTitle();
        if(title.contains("Facebook")) {
        	System.out.println("Logged in successfully");
        }else {
        	System.out.println("Login failed");
        }
        
        driver.close();

	}

}