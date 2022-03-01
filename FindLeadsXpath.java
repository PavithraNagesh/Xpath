package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeadsXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//applicable for all find element help to locate element in delay waits for 10 seconds then only throw exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("pavithra");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Pavithra')])[3]")).click();
		String result = driver.getTitle();
		System.out.println(result);
		
	}

}
