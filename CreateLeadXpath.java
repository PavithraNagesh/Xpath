package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadXpath {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//applicable for all find element help to locate element in delay waits for 10 seconds then only throw exception
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");	
		driver.findElement(By.xpath("//input[@type='submit']")).click();
        String title = driver.getTitle();
		System.out.println(title);	
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		String mytitle = driver.getTitle();
		System.out.println(mytitle);
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		 driver.findElement(By.xpath("(//input[contains(@name,'company')])[2]")).sendKeys("Testleaf");
		 driver.findElement(By.xpath("//input[contains(@id,'createLeadForm_firstName')]")).sendKeys("Pavithra");
		 driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[4]")).sendKeys("Nagesh");
		 driver.findElement(By.xpath("(//input[contains(@type,'text')])[33]")).sendKeys("Pavi");
		 driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("CSE");
		 driver.findElement(By.name("submitButton")).click();
		 String leadpage = driver.getTitle();
		 System.out.println(leadpage);
		 driver.findElement(By.linkText("Delete")).click();
		 
	}
	
	
}
