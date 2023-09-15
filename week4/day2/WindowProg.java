package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowProg {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String Ptitle=driver.getTitle();
		System.out.println(Ptitle);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Thread.sleep(3000);
		Set<String> handles=driver.getWindowHandles();
		List<String> lis=new ArrayList<>(handles);
		driver.switchTo().window(lis.get(1));
		String cTitle=driver.getTitle();
		System.out.println(cTitle);
		
	}

}
