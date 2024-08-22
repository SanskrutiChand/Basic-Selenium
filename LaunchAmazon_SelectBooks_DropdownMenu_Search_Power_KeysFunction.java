package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAmazon_SelectBooks_DropdownMenu_Search_Power_KeysFunction 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		for(int i=1;i<=12;i++)
		{
			Thread.sleep(500);
		    e1.sendKeys(Keys.ARROW_DOWN);
		}
		WebElement search=driver.findElement(By.id("twotabsearchtextbox")); 
		search.sendKeys("Computer");
		search.sendKeys(Keys.ENTER);
		
	}

}
