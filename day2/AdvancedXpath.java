package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvancedXpath {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//div[@id='username_container']/input")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.xpath("//form[@id='usernamegroup']/input")).sendKeys("testleaf@2024.com");
		
		Thread.sleep(3000);
		driver.close();
	}
}
