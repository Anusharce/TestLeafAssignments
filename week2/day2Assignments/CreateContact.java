package week2.day2Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anusha");
		driver.findElement(By.id("lastNameField")).sendKeys("Beesetti");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createContactForm_description")).sendKeys("For National and International Transactions");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("varaprasadanusha@gmail.com");
		WebElement State=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sel=new Select(State);
		sel.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updated to Any kind Of Transactions");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String Title= driver.getTitle();
		System.out.println(Title);


	}

}
