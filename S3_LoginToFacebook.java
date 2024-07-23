package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S3_LoginToFacebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("chandsanskruti@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("bhah#js12");
		WebElement loginbutton=driver.findElement(By.name("login"));
		loginbutton.click();
		//loginbutton.sendKeys(Keys.ENTER);

	}

}
