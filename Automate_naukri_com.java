package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_naukri_com {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("usernameField"));
		username.sendKeys("chandsanskruti@gmail.com");
		WebElement password=driver.findElement(By.id("passwordField"));
		password.sendKeys("Gmail@123");
		WebElement button=driver.findElement(By.xpath("//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']"));
		button.click();
		
	}

}
