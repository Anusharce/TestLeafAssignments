package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		//Parent to Child
		driver.findElement(By.xpath("//form[@class='css-19j7d8y'])/input"));
		//Child to Parent
		driver.findElement(By.xpath("//input[@class='css-1upamjb']//parent::form"));
		


	}

}
