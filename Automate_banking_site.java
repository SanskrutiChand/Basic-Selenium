package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_banking_site 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement link=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		link.click();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("sanskrutichand");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("sansu@123");
		WebElement lc=driver.findElement(By.name("loginCaptchaValue"));
		
	}

}
