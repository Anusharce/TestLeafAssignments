package week4.day2Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("(//i[contains(@class,'globe')])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Window')]")).click();
		String stitle=driver.getTitle();
		System.out.println(stitle);
		driver.findElement(By.xpath("//span[contains(text(),'Open')]")).click();
		Set<String> set1=driver.getWindowHandles();
		List<String> list1=new ArrayList<>(set1);
		driver.switchTo().window(list1.get(1));
		String wtitle=driver.getTitle();
		System.out.println(wtitle);
		if(wtitle.equals("Dashboard"))
		{
			System.out.println("Window is opened");
		}
		else
		{
		System.out.println("Confirmed that Window is not Opened");
		}
		
	
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//span[contains(text(),'Multiple')]")).click();
		driver.switchTo().window(list1.get(1));
		String mtitle=driver.getTitle();
		System.out.println(mtitle);
		if(mtitle.equals("Dashboard"))
		{
			System.out.println("multiple Windows are opened");
		}
		else
		{
		System.out.println("Confirmed that multiple Windows are not Opened");
		}
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//span[contains(text(),'Close Windows')]")).click();
		driver.switchTo().window(list1.get(1));
		driver.close();
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//span[contains(text(),'Open with delay')]")).click();
		Set<String> set2=driver.getWindowHandles();
		List<String> list2=new ArrayList<>(set2);
		driver.switchTo().window(list2.get(1));
		driver.switchTo().window(list2.get(1));
		String dtitle=driver.getTitle();
		System.out.println(dtitle);
		if(wtitle.equals("Dashboard"))
		{
			System.out.println("Windows are opened with delay");
		}
		else
		{
		System.out.println("Confirmed that Window are not Opened with delay");
		}
		
		
	}

}
