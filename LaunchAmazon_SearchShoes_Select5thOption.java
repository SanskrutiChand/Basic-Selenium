package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_SearchShoes_Select5thOption 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
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
		search.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
	}

}
