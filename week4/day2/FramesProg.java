package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesProg {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert al=driver.switchTo().alert();
		String text=al.getText();
		System.out.println(text);
		al.accept();
		String s=driver.findElement(By.id("demo")).getText();
		if(s.contains("OK"))
		{
			System.out.println("Alert Handeled");
		}
		
		
		
	

	}

}
