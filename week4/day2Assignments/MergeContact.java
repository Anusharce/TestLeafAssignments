package week4.day2Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> win=driver.getWindowHandles();
		List<String> lis=new ArrayList<>(win);
		driver.switchTo().window(lis.get(1));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[contains(@class,'firstName')]/a)[2]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(lis.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> win2=driver.getWindowHandles();
		List<String> lis2=new ArrayList<>(win2);
		driver.switchTo().window(lis2.get(1));
		driver.manage().window().maximize();
		//driver.switchTo().window(lis.get(1));
		driver.findElement(By.xpath("(//div[contains(@class,'firstName')]/a)[3]")).click();
		driver.switchTo().window(lis.get(0));
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(3000);
		String Title=driver.getTitle();
		System.out.println(Title);
		
		


	}

}
