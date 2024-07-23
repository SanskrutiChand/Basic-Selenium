package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S4_LaunchAmazon_Clickon_CustomerServiceMobile {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement customer_service=	driver.findElement(By.linkText("Customer Service"));
		WebElement customer_service1=	driver.findElement(By.partialLinkText("Customer"));
		customer_service1.click();
		//WebElement mobiles=	driver.findElement(By.linkText("Mobiles"));
		WebElement mobiles1=	driver.findElement(By.partialLinkText("Mobi"));
		mobiles1.click();
	}

}
