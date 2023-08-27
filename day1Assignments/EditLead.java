package week2.day1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Anasol");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anusha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Beesetti");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("For National and International Transactions");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("varaprasadanusha@gmail.com");
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel=new Select(State);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Updated to Any kind Of Transactions");
		driver.findElement(By.name("submitButton")).click();
		String Title= driver.getTitle();
		System.out.println(Title);
      }

    }
