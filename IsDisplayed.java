package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("121"));
		System.out.println(e1.isDisplayed());
		System.out.println(e1.isEnabled());
	}

}
