package basics.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllOptions_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement serach=driver.findElement(By.id("twotabsearchtextbox"));
		serach.sendKeys("Shoes");
		Thread.sleep(6000);
		
		List<WebElement>auto=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		Thread.sleep(2000);
		for(int i=0;i<auto.size();i++)
		{
		WebElement e1=auto.get(i);
		System.out.println(e1.getText());
		}
	}

}
