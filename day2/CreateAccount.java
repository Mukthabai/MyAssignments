package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		
		// To automate web elements like input fields, dropdowns and buttons using Select Class in Selenium WebDriver
				
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Sakthi");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select method1=new Select(industry);
		method1.selectByIndex(3);
		    
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select method2=new Select(ownership);
		method2.selectByVisibleText("S-Corporation");
		   
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select method3=new Select(source);
		method3.selectByValue("LEAD_EMPLOYEE");
				
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select method4=new Select(marketing);
		method4.selectByIndex(6);   
		    
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select method5=new Select(state);
		method5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String accountName=driver.findElement(By.className("tabletext")).getText();
		if(accountName.contains("Sakthi")) {
			System.out.println("Account for Sakthi is created successfully");
		} else {
			System.out.println("Account is not created");	
		}
		
		driver.close();
	}
	

}
