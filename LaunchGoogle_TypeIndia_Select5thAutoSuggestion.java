package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_TypeIndia_Select5thAutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys("India");
		Thread.sleep(6000);
		List<WebElement>auto =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=auto.size();
		System.out.println(count);
		auto.get(4).click();
	}

}
