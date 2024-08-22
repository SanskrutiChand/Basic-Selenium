package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFlipkart_SearchShoe_ClickOn1stOption {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("shoes");
		Thread.sleep(6000);
		List<WebElement> s=driver.findElements(By.xpath("//div[@class='x6GwIv _2Ipp17']/div"));
		int count =s.size();
		s.get(count-1).click();
		
		
		
		
	}

}
