package week2.day2Assignments;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Anusha");
		WebElement CName=driver.findElement(By.xpath("//input[@value='Chennai']")); 
		CName.clear();
		Thread.sleep(2000);
		CName.sendKeys("Hyderabad");
		boolean ele=driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		if(ele) {
			System.out.println("Element is not disabled");
		}
		else {
			System.out.println("Element is disabled");
		}
        WebElement cleartext=driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")); 
		cleartext.clear();
		WebElement Ret=driver.findElement(By.xpath("(//div[@class='col-12'])[5]//input"));
		String Text=Ret.getAttribute("value");
		System.out.println(Text);
		WebElement email=driver.findElement(By.xpath("//input[@placeholder='Your email and tab']"));
		email.sendKeys("varaprasadanusha@gmail.com");
		String next=email.getAttribute("value");
		if(next.equals("Your email and tab")) {
			System.out.println("Confirmed that Control moved to next element");
		}
        Thread.sleep(3000);
      driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Anusha Beesetti "
      		+ "from Andhra Pradesh"
      		+ " Done my graduation in the year of 2020, in Computer Science");
      driver.findElement(By.xpath("//button[@class='ql-bold']")).click();
      driver.findElement(By.xpath("//button[@class='ql-italic']")).click();
      driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Anusha Beesetti");
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.scrollBy(0,-250)");
      Thread.sleep(5000);
      WebElement enter=driver.findElement(By.xpath("((//div[@class='card'])[2]//div[1]//input)[1]"));
      enter.click();
      enter.sendKeys(Keys.ENTER);
      Thread.sleep(2000);
      WebElement error=driver.findElement(By.xpath("//span[contains(@class,'error-detail')]"));
      String errorc=error.getText();
      if(errorc.equals("Age is mandatory")) 
      {
    	  System.out.println("Confirmed that the error message is displaying");
      }
      
     WebElement label= driver.findElement(By.xpath("//label[text()='Username']"));
     Point lc1=label.getLocation();
  
    
     /*WebElement label2=driver.findElement(By.xpath("//h5[contains(text(),'Label')]/following::input[1]"));
     String lchange2=label2.getAttribute("value");*/
    WebElement label2= driver.findElement(By.xpath("//label[text()='Username']/preceding::input[1]"));
    //String lchange2=label.getText();
    label2.click();
    WebElement label3= driver.findElement(By.xpath("//label[text()='Username']"));
     Point lc3=label3.getLocation();
     if(lc1==lc3) {
     System.out.println("Confirmed that the Label Position not changed");}
     else {
    	 System.out.println("Confirmed that Username Label poistion changed");
     }
     WebElement Name=driver.findElement(By.xpath("//input[@placeholder='Search']"));
     Name.sendKeys("Anusha");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath("//li[text()='2']")).click();
     Thread.sleep(2000);
    WebElement Calander=driver.findElement(By.xpath("(//span[contains(@class,'trigger-calendar')])/input"));
    Calander.sendKeys("02/04/1999");
    driver.findElement(By.xpath("//a[text()='4']")).click();
    Thread.sleep(3000);
    WebElement spin=driver.findElement(By.xpath("(//span[contains(@class,'spinner')])/input"));
    spin.click();
    spin.sendKeys("3");
    driver.findElement(By.xpath("(//span[contains(@class,'triangle')])[2]")).click();
    WebElement slider=driver.findElement(By.xpath("//input[contains(@id,'slider')]"));
    String Num="50";
    slider.sendKeys(Num);
    WebElement line2=driver.findElement(By.xpath("//span[contains(@class,'slider')]"));
    Point Y=line2.getLocation();
    int X=Y.getY();
    if(X==695)
    {
    	System.out.println("slider moved to 50%");
    }
    driver.findElement(By.xpath("//input[contains(@class,'keyboard')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'shadow keypad')]")).click();
    WebElement key=driver.findElement(By.xpath("//button[text()='Enter']"));
    String keyboard=key.getText();
    if(keyboard.equals("Enter")) {
    	System.out.println("Confirmed that the Keyboard is opened");
    }
   
    driver.findElement(By.xpath("(//button[contains(@class,'bold')])[2]")).click();
    driver.findElement(By.xpath("(//button[contains(@class,'italic')])[2]")).click();
    driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Anush Beesetti");
    }}
