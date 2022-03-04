package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		   driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		   
		   driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("pavithra");
		   driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[3]/div/a)[1]")).click();
		   String title = driver.getTitle();
		   System.out.println(title);
		   Thread.sleep(5000);
		   driver.findElement(By.linkText("Edit")).click();
		   driver.findElement(By.id("updateLeadForm_companyName")).clear();
		   Thread.sleep(5000);
		   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
		   
		   driver.findElement(By.xpath("//input[@name='submitButton'][1]")).click();
		   
		   Thread.sleep(5000);
		   driver.close();
		   

	}

}
