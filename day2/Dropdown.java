package week2.day2;

		import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

		public class Dropdown {

			public static void main(String[] args) throws InterruptedException {
				
				// To automate interactions with these WebElement using Selenium WebDriver
				
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/");
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muktha");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bai");
			    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
					    
			    WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
			    Select method1=new Select(source);
			    method1.selectByIndex(5);
			    
			    WebElement marketing=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			    Select method2=new Select(marketing);
			    method2.selectByVisibleText("Automobile");
			    
			    WebElement currency=driver.findElement(By.id("createLeadForm_currencyUomId"));
			    Select method3=new Select(currency);
			    method3.selectByValue("KPW");
			    Thread.sleep(3000);			    
			    driver.findElement(By.className("smallSubmit")).click();      
			    Thread.sleep(3000);	
				driver.close();
			}
			

		}
