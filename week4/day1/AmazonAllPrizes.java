package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllPrizes {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement mob=driver.findElement(By.id("twotabsearchtextbox"));
        		mob.sendKeys("mobiles");
        		mob.sendKeys(Keys.ENTER);
        List<WebElement> all=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
        List<Integer>list=new ArrayList<>();
       // Collections.sort(list);
        for(WebElement each:all)
        {
        	String price=each.getText();
        	String Final=price.replaceAll(",","");
        	int mobprice=Integer.parseInt(Final);
        	list.add(mobprice);
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(0));
     
        
	
        
        
        


	}

}
