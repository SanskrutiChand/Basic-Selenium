package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGoogle_TypeAmazon_Select5thAutoSuggestion 
{

		public static void main(String[] args) throws InterruptedException 
		{
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement serach=driver.findElement(By.id("twotabsearchtextbox"));
			serach.sendKeys("Shoes");
			Thread.sleep(6000);
			
			List<WebElement>auto=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
			int count =auto.size();
			System.out.println(count);
			auto.get(4).click();
			
			
		}
	

}
