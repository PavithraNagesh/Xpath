package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver = new ChromeDriver();
   driver.get("http://leaftaps.com/opentaps/control/login");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
   driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");	
   driver.findElement(By.xpath("//input[@type='submit']")).click();
   driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
   driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
   Thread.sleep(3000);
   driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
   driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
   driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("pavithra18n@gmail.com");
   driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
   Thread.sleep(3000);
  
   WebElement find = driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]"));
   String name = find.getText();
   System.out.println(name);
   driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]")).click();
   Thread.sleep(3000);
   
   driver.findElement(By.linkText("Duplicate Lead")).click();
   String title = driver.getTitle();
   System.out.println(title);
   Thread.sleep(3000);
   
   driver.findElement(By.linkText("Create Lead")).click();
   driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);

   Thread.sleep(3000);
   driver.close();
 
	
	}

}
