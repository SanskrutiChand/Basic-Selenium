package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_TypeIndia_Select4thSuggestion_Drop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("India");
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		
	}

}
