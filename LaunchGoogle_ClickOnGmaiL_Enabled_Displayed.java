package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_ClickOnGmaiL_Enabled_Displayed 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement gmail_link=	driver.findElement(By.linkText("Gmail"));
		gmail_link.click();
		System.out.println(gmail_link.isDisplayed());
		System.out.println(gmail_link.isEnabled());
	}

}
