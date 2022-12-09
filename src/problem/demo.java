package problem;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class demo 
{
 public static void main(String[] args) throws InterruptedException 
 {
	 	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	 	WebDriver driver= new ChromeDriver();
	 	//driver.manage().timeouts().implicitlyWait(80,TimeUnit.SECONDS);
	 	driver.get("https://www.youtube.com");
	 	driver.findElement(By.xpath("//input[@id=\"search\"]")).sendKeys("selenium");
	 	driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
	 	driver.findElement(By.xpath("//a[@title=\"Selenium Part 1-  Web Automation Tool Introduction in Hindi\"]")).click();
	 	
	 	driver.findElement(By.xpath("//button[@class=\"ytp-fullscreen-button ytp-button\"]")).click();
	 	System.out.println("jhwidjwkdxjwn");
	 System.out.println("jhwidjwkdxjwn");
 }
}
