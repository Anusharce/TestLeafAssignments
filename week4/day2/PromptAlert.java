package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://leafground.com/alert.xhtml");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following::span")).click();
			Alert al= driver.switchTo().alert();
			al.sendKeys("Anusha");
			al.accept();
			String s1=driver.findElement(By.xpath("//span[contains(text(),'entered')]")).getText();
			if(s1.contains("enterd"))
			{
				System.out.println("Alert handeled");
			}
			else
			{
				System.out.println("Alert not handled");
			}
			

	}

}
