package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//li[3]")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("varaprasadanusha@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[contains(text(),'Anusha')])[1]")).click();
		WebElement Name1=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String name=Name1.getText();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		String Title=driver.getTitle();
		if(Title.equals("Duplicate Lead | opentaps CRM"))
		{
		System.out.println("Verified the Title as Duplicate Lead");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement Name2=driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String FName=Name2.getText();
		if(name.equals(FName))
		{
       System.out.println("Confirmed that the Duplicate name is same as First resulting name");
       }
		driver.close();
	}}
