package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://en-gb.facebook.com/");
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Pavithra");
   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nagesh");
   driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9994376451");
   driver.findElement(By.id("password_step_input")).sendKeys("Pav!thra");
   
   WebElement bdaydate = driver.findElement(By.name("birthday_day"));
   Select date = new Select(bdaydate);
   date.selectByIndex(17);
   
   WebElement bdaymonth = driver.findElement(By.name("birthday_month"));
   Select month = new Select(bdaymonth);
   month.selectByVisibleText("Jul");
   
   WebElement bdayyear = driver.findElement(By.id("year"));
   Select year = new Select(bdayyear);
   year.selectByValue("1997");
   
   driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
   
   
	}

}
