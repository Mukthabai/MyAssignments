package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		
		// To automate Facebook registration process using Select Class in Selenium WebDriver
				
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");
		
		// Create new account 
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dhinesh");
		driver.findElement(By.name("lastname")).sendKeys("Elangovan");
		driver.findElement(By.name("reg_email__")).sendKeys("dhin.1234@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("RisingStar12");
		driver.findElement(By.id("day")).sendKeys("17");
		driver.findElement(By.id("month")).sendKeys("Jul");
		driver.findElement(By.id("year")).sendKeys("1986");
		WebElement genderRadio = driver.findElement(By.xpath("//input[@value='2']")); 
        genderRadio.click();
        
		driver.findElement(By.name("websubmit")).click();
		
		driver.close();
	}

}
