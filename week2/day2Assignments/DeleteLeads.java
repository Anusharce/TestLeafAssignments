package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeads {

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
		driver.findElement(By.xpath("//div[@class='x-tab-strip-wrap']//li[2]")).click();
		WebElement CC=driver.findElement(By.xpath("//input[@name='phoneCountryCode']")); 
		CC.clear();
		Thread.sleep(2000);
		CC.sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement firstID=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr//div//a"));
		String id=firstID.getText();
		//System.out.println(id);
		firstID.click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(id);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[(text()='Find Leads')]")).click();
		WebElement NoRec=driver.findElement(By.xpath("//div[contains(text(),'No records')]"));
		String No=NoRec.getText();
		if(No.equals("No records to display")){
		System.out.println("Verified No Records to display message");
		
      }
     driver.close();
}}
