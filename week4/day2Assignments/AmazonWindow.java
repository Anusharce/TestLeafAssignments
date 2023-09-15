package week4.day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("oneplus 9 pro");
		search.sendKeys(Keys.ENTER);
		String price= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String fprice=price.replaceAll("[a-zA-Z]", "");
		System.out.println(fprice);
		String rating= driver.findElement(By.xpath("(//span[contains(@class,'underline')])[1]")).getText();
		System.out.println(rating.replaceAll("[a-zA-Z]", ""));
		driver.findElement(By.xpath("//a[contains(@class, 'underline')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Set<String> set1=driver.getWindowHandles(); 
		List<String> list1=new ArrayList<>(set1);
		driver.switchTo().window(list1.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@aria-labelledby,'cart-button')])[1]")).click();
		
		WebElement ele=driver.findElement(By.xpath("(//span[contains(@class,'price')])[1]"));
		String Total=ele.getText();
		String ftotal=Total.replaceAll(" ", "");
		System.out.println(ftotal);
		if(ftotal.contains(fprice))
		{
			System.out.println("Price comparision is done");
		}
		}

}
