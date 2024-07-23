package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath_FacebookLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		WebElement mail=driver.findElement(By.xpath("//input[@id=\'email\']"));
		mail.sendKeys("chandsanskruti@gmail.com");
		WebElement password=driver.findElement(By.xpath("//input[@id=\'pass\']"));
		password.sendKeys("Gtghh#6563");
		WebElement button=driver.findElement(By.xpath("//button[@name=\'login\']"));
		button.click();
	}

}
