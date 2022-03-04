package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leaftaps.com/opentaps/control/login");   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		String findlead = driver.getTitle();
		System.out.println(findlead);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9994376451");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String search = driver.getTitle();
		System.out.println(search);
		Thread.sleep(3000);
	// to capture id	
		WebElement leadid = driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[1]/div/a)[1]"));
		String getleadid = leadid.getText();
        System.out.println(getleadid);
		driver.findElement(By.xpath("(//div[contains(text(),'Lead ID')]/following::table/tbody/tr/td[1]/div/a)[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Delete")).click();
		String delete = driver.getTitle();
		System.out.println(delete);
		
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(getleadid);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		
		Thread.sleep(5000);
		driver.close();
	
	}

}
