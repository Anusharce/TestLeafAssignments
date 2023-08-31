package week2.day2Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadA2 {

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
		Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Anusha");
        driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath("(//a[contains(text(),'Anusha')])[1]")).click();
        String Title=driver.getTitle();
        System.out.println("Verified the Title"+ Title);
        driver.findElement(By.linkText("Edit")).click();
        WebElement CName=driver.findElement(By.xpath("//input[contains(@id,'companyName')]")); 
		CName.clear();
		Thread.sleep(2000);
		CName.sendKeys("Anasol Pvt lt");
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		WebElement UpdatedName=driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String FinalName=UpdatedName.getText();
		System.out.println("Verified the Company Name"+ FinalName);
		driver.close();

	}

}
