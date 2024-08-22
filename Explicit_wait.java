package basics.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_wait {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//pollingperiod is 500 msec=half sec
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait w1=new WebDriverWait(driver, Duration.ofSeconds(10));
		//pollingperiod is 500 msec=half sec
		w1.until(ExpectedConditions.titleIs("Sansu"));
		
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

}
