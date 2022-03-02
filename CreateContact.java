package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         ChromeDriver driver = new ChromeDriver();
         driver.get("http://leaftaps.com/opentaps/control/login");
         driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Pavithra");
		 driver.findElement(By.id("lastNameField")).sendKeys("Nagesh");
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Pavi");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("N");
		 driver.findElement(By.name("departmentName")).sendKeys("CSE");
		 driver.findElement(By.id("createContactForm_description")).sendKeys("create contact");
		 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("pavithra@gmail.com");
		 WebElement stateprovince = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select state = new Select(stateprovince);
		 state.selectByVisibleText("New York");
		 driver.findElement(By.name("submitButton")).click();
		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 driver.findElement(By.name("importantNote")).sendKeys("Wrong info");
		 driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		 String update = driver.getTitle();
		 System.out.println(update);
		 
	}

}
