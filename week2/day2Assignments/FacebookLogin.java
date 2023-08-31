package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(@class,'selected')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Anusha");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Beesetti");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Anusha@511");
		Thread.sleep(2000);
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
	    Select sel1=new Select(Day);
		sel1.selectByValue("2");
		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
	    Select sel2=new Select(Month);
		sel2.selectByVisibleText("Apr");
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
	    Select sel3=new Select(Year);
		sel3.selectByVisibleText("1999");
		driver.findElement(By.xpath("//input[@name='sex']/preceding::label")).click();

	}

}
